package com.stcode.controller;

import com.stcode.annotation.Login;
import com.stcode.common.utils.R;
import com.stcode.common.validator.ValidatorUtils;
import com.stcode.form.LoginForm;
import com.stcode.service.TokenService;
import com.stcode.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * 登录接口
 */
@RestController
@RequestMapping("/api")
@Api(tags = "登录接口")
public class ApiLoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private TokenService tokenService;

	@PostMapping("login")
	@ApiOperation("登录")
	public R login(@RequestBody LoginForm form) {
		// 表单校验
		ValidatorUtils.validateEntity(form);

		// 用户登录
		Map<String, Object> map = userService.login(form);

		return R.ok(map);
	}

	@Login
	@PostMapping("logout")
	@ApiOperation("退出")
	public R logout(@ApiIgnore @RequestAttribute("userId") long userId) {
		tokenService.expireToken(userId);
		return R.ok();
	}

}
