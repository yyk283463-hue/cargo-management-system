package com.example.cargo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cargo.entity.InventoryRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 出入库记录 Mapper 接口
 */
@Mapper
public interface InventoryRecordMapper extends BaseMapper<InventoryRecord> {

}
