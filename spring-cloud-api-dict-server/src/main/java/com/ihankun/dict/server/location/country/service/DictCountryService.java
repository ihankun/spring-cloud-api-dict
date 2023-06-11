package com.ihankun.dict.server.location.country.service;

import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
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
     * @param queryDTO 查询参数
     * @author hankun
     * @return List<DictCountryVO>
     */
    List<DictCountryVO> find(DictCountryQueryDTO queryDTO);

    /**
     * 查询国家字典
     * @param saveDTO 保存参数
     * @author hankun
     */
    void save(List<DictCountryDTO> saveDTO);
}
