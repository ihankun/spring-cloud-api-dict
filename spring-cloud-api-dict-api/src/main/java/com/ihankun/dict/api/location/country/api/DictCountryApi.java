package com.ihankun.dict.api.location.country.api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ihankun.core.base.api.ResponseResult;
import com.ihankun.core.spring.api.annotation.api.KunGet;
import com.ihankun.core.spring.api.annotation.api.KunMapping;
import com.ihankun.core.spring.api.annotation.api.KunPost;
import com.ihankun.dict.api.location.country.api.fallback.DictCountryFallback;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author hankun
 */
@Api(tags = "国家字典Api")
@FeignClient(name="${spring.application.api.dict.name}", fallbackFactory= DictCountryFallback.class)
@KunMapping("/api/v1/dict/country")
public interface DictCountryApi {

    @ApiOperation("查询国家字典")
    @ApiOperationSupport(author = "hankun")
    @KunGet
    ResponseResult<List<DictCountryVO>> find(DictCountryQueryDTO queryDTO);

    @ApiOperation("保存国家字典")
    @ApiOperationSupport(author = "hankun")
    @KunPost("/s")
    ResponseResult<List<DictCountryVO>> save(@RequestBody List<DictCountryDTO> saveDTO);
}
