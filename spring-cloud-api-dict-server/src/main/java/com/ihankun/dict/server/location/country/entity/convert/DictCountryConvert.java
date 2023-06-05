package com.ihankun.dict.server.location.country.entity.convert;

import com.ihankun.core.spring.server.convert.Dto2PoBaseConvert;
import com.ihankun.core.spring.server.convert.Dto2VoBaseConvert;
import com.ihankun.core.spring.server.convert.Vo2PoBaseConvert;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import com.ihankun.dict.server.location.country.entity.po.DictCountry;
import org.mapstruct.Mapper;

/**
 * @author hankun
 */
@Mapper(componentModel = "spring")
public interface DictCountryConvert extends Dto2PoBaseConvert<DictCountryDTO, DictCountry>,
        Dto2VoBaseConvert<DictCountryDTO, DictCountryVO>, Vo2PoBaseConvert<DictCountryVO, DictCountry> {
}
