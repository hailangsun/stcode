package com.stcode.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.stcode.common.utils.PageUtils;
import com.stcode.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
