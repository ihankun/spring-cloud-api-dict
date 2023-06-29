package com.ihankun.dict.server.holiday.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ihankun.core.commons.id.IdGenerator;
import com.ihankun.dict.api.holiday.entity.dto.DictHolidayDTO;
import com.ihankun.dict.api.holiday.entity.vo.DictHolidayVO;
import com.ihankun.dict.server.holiday.dao.DictHolidayMapper;
import com.ihankun.dict.server.holiday.entity.convert.DictHolidayConvert;
import com.ihankun.dict.server.holiday.entity.po.DictHoliday;
import com.ihankun.dict.server.holiday.service.DictHolidayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DictHolidayServiceImpl implements DictHolidayService {

    @Resource
    private DictHolidayMapper dictHolidayMapper;
    @Resource
    private DictHolidayConvert dictHolidayConvert;

    /**
     * 获取指定日期节假日及万年历信息
     * @param date 格式要求 yyyyMMdd
     * @return HolidayVO
     */
    @Override
    public DictHolidayVO getDay(String date) {
        DictHoliday dictHoliday = dictHolidayMapper.selectOne(
                new QueryWrapper<DictHoliday>().eq("date", date).last("limit 1"));

        return dictHolidayConvert.po2Vo(dictHoliday);
    }

    /**
     * 保存节假日及万年历字典
     * @param dictHolidayDTO 保存参数
     */
    @Override
    public void save(DictHolidayDTO dictHolidayDTO) {
        dictHolidayDTO.setId(IdGenerator.ins().generator());
        dictHolidayMapper.save(dictHolidayConvert.dto2Po(dictHolidayDTO));
    }
}
