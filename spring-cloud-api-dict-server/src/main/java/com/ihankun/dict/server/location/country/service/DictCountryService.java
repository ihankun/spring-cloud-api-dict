package com.ihankun.dict.server.location.country.service;

import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @author hankun
 */
@Validated
public interface DictCountryService {

    /**
     * 查询国家字典
     * @author hankun
     * @return List<DictCountryVO>
     */
    List<DictCountryVO> findDictCountry();
}
