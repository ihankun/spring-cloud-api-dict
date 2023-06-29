package com.ihankun.dict.server.holiday.controller;

import com.ihankun.core.base.response.ResponseResult;
import com.ihankun.dict.api.holiday.api.DictHolidayApi;
import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import com.ihankun.dict.server.holiday.service.DictHolidayService;

import javax.annotation.Resource;

public class DictHolidayController implements DictHolidayApi {

    @Resource
    private DictHolidayService dictHolidayService;

    /**
     * 获取指定日期节假日及万年历信息
     * @param date 格式要求 yyyyMMdd
     * @return ResponseResult<HolidayVO>
     */
    @Override
    public ResponseResult<DictHolidayVO> getDay(String date) {
        return ResponseResult.success(dictHolidayService.getDay(date));
    }

    /**
     * 保存节假日及万年历字典
     * @param dictHolidayDTO 保存参数
     * @return ResponseResult
     */
    @Override
    public ResponseResult save(DictHolidayDTO dictHolidayDTO) {
        dictHolidayService.save(dictHolidayDTO);
        return ResponseResult.success();
    }
}
