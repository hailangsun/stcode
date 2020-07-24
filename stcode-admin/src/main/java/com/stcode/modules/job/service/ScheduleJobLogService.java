package com.stcode.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.stcode.common.utils.PageUtils;
import com.stcode.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);

}
