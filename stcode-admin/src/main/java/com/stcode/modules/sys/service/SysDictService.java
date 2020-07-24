package com.stcode.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.stcode.common.utils.PageUtils;
import com.stcode.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 */
public interface SysDictService extends IService<SysDictEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
