package com.example.cargo.service;

import com.example.cargo.entity.Goods;
import com.example.cargo.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 货物业务逻辑层
 */
@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> list() {
        return goodsMapper.selectList(null);
    }

    public Goods getById(Integer id) {
        return goodsMapper.selectById(id);
    }

    public boolean add(Goods goods) {
        return goodsMapper.insert(goods) > 0;
    }

    public boolean update(Goods goods) {
        return goodsMapper.updateById(goods) > 0;
    }

    public boolean delete(Integer id) {
        return goodsMapper.deleteById(id) > 0;
    }
}
