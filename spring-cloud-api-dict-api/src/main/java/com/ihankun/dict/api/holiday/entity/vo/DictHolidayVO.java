package com.ihankun.dict.api.holiday.entity.vo;

import com.ihankun.core.base.api.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@ApiModel("节假日万年历字典vo")
@Data
public class DictHolidayVO extends BaseVO {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "当前日期")
    private String date;

    @ApiModelProperty(value = "当前周第几天")
    private Integer weekDay;

    @ApiModelProperty(value = "天干地支纪年法描述")
    private String yearTips;

    @ApiModelProperty(value = "类型 0 工作日 1 假日 2 节假日")
    private Integer type;

    @ApiModelProperty(value = "类型描述 比如 国庆,休息日,工作日")
    private String typeDes;

    @ApiModelProperty(value = "属相")
    private String chineseZodiac;

    @ApiModelProperty(value = "节气描述")
    private String solarTerms;

    @ApiModelProperty(value = "农历日期")
    private String lunarCalendar;

    @ApiModelProperty(value = "宜事项")
    private String suit;

    @ApiModelProperty(value = "这一年的第几天")
    private Integer dayOfYear;

    @ApiModelProperty(value = "这一年的第几周")
    private Integer weekOfYear;

    @ApiModelProperty(value = "星座")
    private String constellation;

    @ApiModelProperty(value = "如果当前是工作日 则返回是当前月的第几个工作日，否则返回0")
    private Integer indexWorkDayOfMonth;
}
