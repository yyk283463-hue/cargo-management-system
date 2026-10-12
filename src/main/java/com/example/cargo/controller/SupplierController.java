package com.example.cargo.controller;

import com.example.cargo.common.Result;
import com.example.cargo.entity.Supplier;
import com.example.cargo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 供应商管理 Controller
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/list")
    public Result<List<Supplier>> list() {
        List<Supplier> list = supplierService.list();
        return Result.success(list);
    }

    @GetMapping("/{id}")
    public Result<Supplier> getById(@PathVariable Integer id) {
        Supplier supplier = supplierService.getById(id);
        return Result.success(supplier);
    }

    @PostMapping
    public Result<Void> add(@RequestBody Supplier supplier) {
        supplierService.add(supplier);
        return Result.success();
    }

    @PutMapping
    public Result<Void> update(@RequestBody Supplier supplier) {
        supplierService.update(supplier);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id) {
        supplierService.delete(id);
        return Result.success();
    }
}
