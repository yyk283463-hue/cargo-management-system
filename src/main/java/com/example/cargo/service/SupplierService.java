package com.example.cargo.service;

import com.example.cargo.entity.Supplier;
import com.example.cargo.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 供应商业务逻辑层
 */
@Service
public class SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    public List<Supplier> list() {
        return supplierMapper.selectList(null);
    }

    public Supplier getById(Integer id) {
        return supplierMapper.selectById(id);
    }

    public boolean add(Supplier supplier) {
        return supplierMapper.insert(supplier) > 0;
    }

    public boolean update(Supplier supplier) {
        return supplierMapper.updateById(supplier) > 0;
    }

    public boolean delete(Integer id) {
        return supplierMapper.deleteById(id) > 0;
    }
}
