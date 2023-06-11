package com.ihankun.dict.server.location.country.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.ihankun.core.db.config.DataSourceType;
import com.ihankun.core.db.mapper.KunBaseMapper;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
import com.ihankun.dict.server.location.country.entity.po.DictCountry;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hankun
 */
@Mapper
public interface DictCountryMapper extends KunBaseMapper<DictCountry> {

    /**
     * @author hankun
     * @param queryDTO 查询参数
     * @return List<DictCountryVO>
     */
    @DS(DataSourceType.DICT)
    List<DictCountry> findDictCountry(DictCountryQueryDTO queryDTO);
}
