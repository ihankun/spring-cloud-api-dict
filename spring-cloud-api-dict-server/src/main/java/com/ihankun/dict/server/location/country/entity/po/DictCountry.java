package com.ihankun.dict.server.location.country.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ihankun.core.base.api.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hankun
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "dict_country", schema = "dict")
public class DictCountry extends BasePO {

    /**
     * 国家字典主键ID
     */
    @TableId(type = IdType.INPUT)
    private Long dictCountryId;

    /**
     * 国家名称
     */
    private String dictCountryName;

    /**
     * 简拼
     */
    private String inputCode;

    /**
     * 全拼
     */
    private String fullCode;

    /**
     * 五笔
     */
    private String wbCode;

    /**
     * 排序
     */
    private Integer orderNo;

    /**
     * 作废标记
     */
    private String invalidFlag;
}
