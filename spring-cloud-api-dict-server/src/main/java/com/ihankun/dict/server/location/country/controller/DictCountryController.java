package com.ihankun.dict.server.location.country.controller;

import com.ihankun.core.base.response.ResponseResult;
import com.ihankun.core.spring.server.annotation.KunRestController;
import com.ihankun.dict.api.location.country.api.DictCountryApi;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import com.ihankun.dict.server.location.country.service.DictCountryService;
import io.swagger.annotations.Api;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hankun
 */
@KunRestController
@Api(tags = "国家字典Controller")
public class DictCountryController implements DictCountryApi {

    @Resource
    private DictCountryService dictCountryService;

    @Override
    public ResponseResult<List<DictCountryVO>> find(DictCountryQueryDTO queryDTO) {
        return ResponseResult.success(dictCountryService.find(queryDTO));
    }

    @Override
    public ResponseResult<List<DictCountryVO>> save(List<DictCountryDTO> saveDTO) {
        dictCountryService.save(saveDTO);
        return ResponseResult.success();
    }
}
