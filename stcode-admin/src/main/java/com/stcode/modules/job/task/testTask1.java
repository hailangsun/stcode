package com.stcode.modules.job.task;

import com.stcode.modules.sys.entity.SysUserEntity;
import com.stcode.modules.sys.service.SysUserService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("testTask1")
public class testTask1 {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysUserService sysUserService;

    public void test(String params) {
        logger.info("我是带参数的test方法，正在被执行，参数为：" + params);

        SysUserEntity user = sysUserService.selectById(2);
        System.out.println(ToStringBuilder.reflectionToString(user));

    }


}
