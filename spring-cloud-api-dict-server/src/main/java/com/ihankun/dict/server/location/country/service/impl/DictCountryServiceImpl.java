package com.ihankun.dict.server.location.country.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.ihankun.core.db.config.DataSourceType;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import com.ihankun.dict.server.location.country.dao.DictCountryMapper;
import com.ihankun.dict.server.location.country.entity.convert.DictCountryConvert;
import com.ihankun.dict.server.location.country.entity.po.DictCountry;
import com.ihankun.dict.server.location.country.service.DictCountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hankun
 */
@Slf4j
@Service
public class DictCountryServiceImpl implements DictCountryService {

    @Resource
    private DictCountryMapper dictCountryMapper;

    @Resource
    private DictCountryConvert dictCountryConvert;

    @Override
    public List<DictCountryVO> find(DictCountryQueryDTO queryDTO) {
        List<DictCountry> list = dictCountryMapper.find(queryDTO);

        return dictCountryConvert.po2Vo(list);
    }

    @DS(DataSourceType.DICT)
    @Override
    public void save(List<DictCountryDTO> saveDTO) {
        List<DictCountry> list = dictCountryConvert.dto2Po(saveDTO);
        dictCountryMapper.save(list);
    }
}
