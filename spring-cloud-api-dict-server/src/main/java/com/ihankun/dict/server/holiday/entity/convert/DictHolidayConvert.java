package com.ihankun.dict.server.holiday.entity.convert;

import com.ihankun.core.spring.server.convert.Dto2PoBaseConvert;
import com.ihankun.core.spring.server.convert.Dto2VoBaseConvert;
import com.ihankun.core.spring.server.convert.Vo2PoBaseConvert;
import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import com.ihankun.dict.server.holiday.entity.po.DictHoliday;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DictHolidayConvert extends Dto2PoBaseConvert<DictHolidayDTO, DictHoliday>,
        Dto2VoBaseConvert<DictHolidayDTO, DictHolidayVO>, Vo2PoBaseConvert<DictHolidayVO, DictHoliday> {
}
