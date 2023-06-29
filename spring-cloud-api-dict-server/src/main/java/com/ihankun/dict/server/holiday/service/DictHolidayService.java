package com.ihankun.dict.server.holiday.service;

import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import org.springframework.validation.annotation.Validated;

@Validated
public interface DictHolidayService {

    /**
     * 获取指定日期节假日及万年历信息
     * @param date 格式要求 yyyyMMdd
     * @return HolidayVO
     */
    DictHolidayVO getDay(String date);

    /**
     * 保存节假日及万年历字典
     * @param dictHolidayDTO 保存参数
     */
    void save(DictHolidayDTO dictHolidayDTO);
}
