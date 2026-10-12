package com.example.cargo.controller;

import com.example.cargo.common.Result;
import com.example.cargo.entity.InventoryRecord;
import com.example.cargo.service.InventoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 出入库记录 Controller
 */
@RestController
@RequestMapping("/record")
public class InventoryRecordController {

    @Autowired
    private InventoryRecordService inventoryRecordService;

    @GetMapping("/list")
    public Result<List<InventoryRecord>> list() {
        List<InventoryRecord> list = inventoryRecordService.list();
        return Result.success(list);
    }

    @GetMapping("/{id}")
    public Result<InventoryRecord> getById(@PathVariable Integer id) {
        InventoryRecord record = inventoryRecordService.getById(id);
        return Result.success(record);
    }

    @PostMapping
    public Result<Void> add(@RequestBody InventoryRecord record) {
        inventoryRecordService.add(record);
        return Result.success();
    }

    @PutMapping
    public Result<Void> update(@RequestBody InventoryRecord record) {
        inventoryRecordService.update(record);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id) {
        inventoryRecordService.delete(id);
        return Result.success();
    }
}
