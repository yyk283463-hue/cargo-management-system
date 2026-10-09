package com.example.cargo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cargo.entity.Category;
import com.example.cargo.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 分类业务逻辑层
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询所有分类
     */
    public List<Category> list() {
        return categoryMapper.selectList(null);
    }

    /**
     * 根据ID查询
     */
    public Category getById(Integer id) {
        return categoryMapper.selectById(id);
    }

    /**
     * 新增分类
     */
    public boolean add(Category category) {
        return categoryMapper.insert(category) > 0;
    }

    /**
     * 修改分类
     */
    public boolean update(Category category) {
        return categoryMapper.updateById(category) > 0;
    }

    /**
     * 删除分类
     */
    public boolean delete(Integer id) {
        return categoryMapper.deleteById(id) > 0;
    }
}