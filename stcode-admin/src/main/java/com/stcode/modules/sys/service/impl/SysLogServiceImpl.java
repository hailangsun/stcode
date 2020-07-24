package com.stcode.modules.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stcode.common.utils.PageUtils;
import com.stcode.common.utils.Query;
import com.stcode.modules.sys.dao.SysLogDao;
import com.stcode.modules.sys.entity.SysLogEntity;
import com.stcode.modules.sys.service.SysLogService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLogEntity> implements SysLogService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String key = (String) params.get("key");

		Page<SysLogEntity> page = this.selectPage(new Query<SysLogEntity>(params).getPage(), new EntityWrapper<SysLogEntity>().like(StringUtils.isNotBlank(key), "username", key));

		return new PageUtils(page);
	}
}
