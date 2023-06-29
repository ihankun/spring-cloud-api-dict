package com.ihankun.dict.api.holiday.api.fallback;

import com.ihankun.core.base.response.ResponseResult;
import com.ihankun.dict.api.holiday.api.DictHolidayApi;
import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import feign.hystrix.FallbackFactory;

public class DictHolidayFallback implements FallbackFactory<DictHolidayApi> {
    @Override
    public DictHolidayApi create(Throwable throwable) {
        return new DictHolidayApi() {

            @Override
            public ResponseResult<DictHolidayVO> getDay(String date) {
                return ResponseResult.fallback(throwable);
            }

            @Override
            public ResponseResult save(DictHolidayDTO dictHolidayDTO) {
                return ResponseResult.fallback(throwable);
            }
        };
    }
}
