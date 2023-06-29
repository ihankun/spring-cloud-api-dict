package com.ihankun.dict.api.holiday.api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ihankun.core.base.response.ResponseResult;
import com.ihankun.core.spring.api.annotation.api.KunGet;
import com.ihankun.core.spring.api.annotation.api.KunMapping;
import com.ihankun.core.spring.api.annotation.api.KunPost;
import com.ihankun.dict.api.holiday.api.fallback.DictHolidayFallback;
import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Api(tags = "国家字典Api")
@FeignClient(name="${spring.application.api.dict.name}", fallbackFactory= DictHolidayFallback.class)
@KunMapping("/api/v1/dict/holiday")
public interface DictHolidayApi {

    /**
     * 获取指定日期节假日及万年历信息
     * @param date 格式要求 yyyyMMdd
     * @return ResponseResult<HolidayVO>
     */
    @ApiOperation("获取指定日期节假日及万年历信息")
    @ApiOperationSupport(author = "hankun")
    @KunGet("/day/{date}")
    ResponseResult<DictHolidayVO> getDay(@PathVariable("date") String date);

    /**
     * 保存节假日及万年历字典
     * @param dictHolidayDTO 保存参数
     * @return ResponseResult
     */
    @ApiOperation("保存节假日及万年历字典")
    @ApiOperationSupport(author = "hankun")
    @KunPost("/s")
    ResponseResult save(@RequestBody DictHolidayDTO dictHolidayDTO);
}
