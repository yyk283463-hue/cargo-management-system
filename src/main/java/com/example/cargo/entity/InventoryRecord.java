package com.example.cargo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 出入库记录实体类
 */
@Data
@TableName("inventory_record")
public class InventoryRecord {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer goodsId;

    /**
     * 类型：1=入库，2=出库
     */
    private Integer type;

    private Integer quantity;

    private String operator;

    private String remark;

    private LocalDateTime createTime;

    // ======== 非数据库字段，用于页面展示 ========
    @TableField(exist = false)
    private String goodsName;      // 货物名称

    @TableField(exist = false)
    private String typeName;       // 类型名称（入库/出库）
}
