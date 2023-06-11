package com.ihankun.dict.api.location.country.entity.dto;

import com.ihankun.core.base.api.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hankun
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel("国家字典dto")
@Data
public class DictCountryDTO extends BaseDTO {

    /**
     * 国家字典主键ID
     */
    @ApiModelProperty(value = "查国家字典主键ID")
    private Long dictCountryId;

    /**
     * 国家名称
     */
    @ApiModelProperty(value = "国家名称")
    private String dictCountryName;

    /**
     * 简拼
     */
    @ApiModelProperty(value = "简拼")
    private String inputCode;

    /**
     * 全拼
     */
    @ApiModelProperty(value = "全拼")
    private String fullCode;

    /**
     * 五笔
     */
    @ApiModelProperty(value = "五笔")
    private String wbCode;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer orderNo;

    /**
     * 作废标记
     */
    @ApiModelProperty(value = "作废标记")
    private String invalidFlag;
}
