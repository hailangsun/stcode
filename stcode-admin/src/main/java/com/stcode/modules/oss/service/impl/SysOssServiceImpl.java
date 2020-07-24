package com.stcode.modules.oss.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stcode.common.utils.PageUtils;
import com.stcode.common.utils.Query;
import com.stcode.modules.oss.dao.SysOssDao;
import com.stcode.modules.oss.entity.SysOssEntity;
import com.stcode.modules.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<SysOssEntity> page = this.selectPage(new Query<SysOssEntity>(params).getPage());

		return new PageUtils(page);
	}

}
