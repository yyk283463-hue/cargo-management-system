package com.example.cargo.controller;

import com.example.cargo.common.Result;
import com.example.cargo.entity.Goods;
import com.example.cargo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 货物管理 Controller
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public Result<List<Goods>> list() {
        List<Goods> list = goodsService.list();
        return Result.success(list);
    }

    @GetMapping("/{id}")
    public Result<Goods> getById(@PathVariable Integer id) {
        Goods goods = goodsService.getById(id);
        return Result.success(goods);
    }

    @PostMapping
    public Result<Void> add(@RequestBody Goods goods) {
        goodsService.add(goods);
        return Result.success();
    }

    @PutMapping
    public Result<Void> update(@RequestBody Goods goods) {
        goodsService.update(goods);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id) {
        goodsService.delete(id);
        return Result.success();
    }
}
