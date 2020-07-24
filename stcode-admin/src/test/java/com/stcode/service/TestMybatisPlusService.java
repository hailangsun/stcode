package com.stcode.service;

import com.stcode.modules.sys.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class TestMybatisPlusService {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test() {
        List<Long> list = sysUserService.queryAllMenuId(2l);
        System.out.println(list.get(0));
    }
}
