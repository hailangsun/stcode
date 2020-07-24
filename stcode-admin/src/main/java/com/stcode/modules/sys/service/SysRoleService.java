package com.stcode.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.stcode.common.utils.PageUtils;
import com.stcode.modules.sys.entity.SysRoleEntity;

import java.util.Map;

/**
 * 角色
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

}
