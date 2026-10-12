package com.example.cargo.service;

import com.example.cargo.entity.InventoryRecord;
import com.example.cargo.mapper.InventoryRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 出入库记录业务逻辑层
 */
@Service
public class InventoryRecordService {

    @Autowired
    private InventoryRecordMapper inventoryRecordMapper;

    public List<InventoryRecord> list() {
        return inventoryRecordMapper.selectList(null);
    }

    public InventoryRecord getById(Integer id) {
        return inventoryRecordMapper.selectById(id);
    }

    public boolean add(InventoryRecord record) {
        return inventoryRecordMapper.insert(record) > 0;
    }

    public boolean update(InventoryRecord record) {
        return inventoryRecordMapper.updateById(record) > 0;
    }

    public boolean delete(Integer id) {
        return inventoryRecordMapper.deleteById(id) > 0;
    }
}
