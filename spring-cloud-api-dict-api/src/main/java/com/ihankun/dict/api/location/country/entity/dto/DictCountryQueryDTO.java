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
public class DictCountryQueryDTO extends BaseDTO {

    /**
     * 国家名称
     */
    @ApiModelProperty(value = "国家名称")
    private String name;
}
