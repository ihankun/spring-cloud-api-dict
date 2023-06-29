package com.ihankun.dict.server.holiday.dao;

import com.ihankun.core.db.mapper.KunBaseMapper;
import com.ihankun.dict.server.holiday.entity.po.DictHoliday;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictHolidayMapper extends KunBaseMapper<DictHoliday> {
}
