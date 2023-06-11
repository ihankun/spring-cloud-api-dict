package com.ihankun.dict.api.location.country.api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ihankun.core.base.api.ResponseResult;
import com.ihankun.core.spring.api.annotation.api.KunGet;
import com.ihankun.core.spring.api.annotation.api.KunMapping;
import com.ihankun.dict.api.location.country.api.fallback.DictCountryFallback;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @author hankun
 */
@Api(tags = "国家字典Api")
@FeignClient(name="${spring.application.api.dict.name}", fallbackFactory= DictCountryFallback.class)
@KunMapping("/api/dict/country")
public interface DictCountryApi {

    @ApiOperation("查询国家字典")
    @ApiOperationSupport(author = "hankun")
    @KunGet
    ResponseResult<List<DictCountryVO>> findDictCountry();
}
