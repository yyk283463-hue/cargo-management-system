package com.example.cargo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 货物实体类
 */
@Data
@TableName("goods")
public class Goods {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer categoryId;

    private Integer supplierId;

    private BigDecimal price;

    private Integer stock;

    private String unit;

    private String remark;

    private LocalDateTime createTime;

    // ======== 非数据库字段，用于页面展示 ========
    @TableField(exist = false)
    private String categoryName;   // 分类名称

    @TableField(exist = false)
    private String supplierName;   // 供应商名称
}
