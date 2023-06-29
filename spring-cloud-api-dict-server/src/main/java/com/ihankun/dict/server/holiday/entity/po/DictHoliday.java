package com.ihankun.dict.server.holiday.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ihankun.core.base.api.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "dict_country", schema = "dict")
public class DictHoliday extends BasePO {

    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
    private Long id;

    /**
     * 当前日期
     */
    private String date;

    /**
     * 当前周第几天
     */
    private Integer weekDay;

    /**
     * 天干地支纪年法描述
     */
    private String yearTips;

    /**
     * 类型 0 工作日 1 假日 2 节假日
     */
    private Integer type;

    /**
     * 类型描述 比如 国庆,休息日,工作日
     */
    private String typeDes;

    /**
     * 属相
     */
    private String chineseZodiac;

    /**
     * 节气描述
     */
    private String solarTerms;

    /**
     * 农历日期
     */
    private String lunarCalendar;

    /**
     * 宜事项
     */
    private String suit;

    /**
     * 这一年的第几天
     */
    private Integer dayOfYear;

    /**
     * 这一年的第几周
     */
    private Integer weekOfYear;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 如果当前是工作日 则返回是当前月的第几个工作日，否则返回0
     */
    private Integer indexWorkDayOfMonth;
}
