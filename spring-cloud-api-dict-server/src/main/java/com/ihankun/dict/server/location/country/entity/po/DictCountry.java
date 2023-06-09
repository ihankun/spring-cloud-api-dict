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
    private Long id;

    /**
     * 国家名称
     */
    private String name;

    /**
     * 中文名称
     */
    private String cname;

    /**
     * 英文名称
     */
    private String ename;

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

    /**
     * 首都
     */
    private String capital;

    /**
     * 国歌
     */
    private String nationalAnthem;

    /**
     * 货币
     */
    private String currency;

    /**
     * 国家代码
     */
    private String code;

    /**
     * 时区
     */
    private String timeZone;

    /**
     * 国际电话区号
     */
    private String areaCode;

    /**
     * 国际域名缩写
     */
    private String domain;

    /**
     * 所在州
     */
    private String continent;

    /**
     * 国旗
     */
    private String nationalFlag;

    /**
     * 国花
     */
    private String nationalFlower;

    /**
     * 是否是国家
     */
    private String countryFlag;

    /**
     * 首字母
     */
    private String initial;

    /**
     * 附加信息
     */
    private String extra;

    /**
     * 语言
     */
    private String language;
}
