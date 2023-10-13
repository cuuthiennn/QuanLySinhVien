package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.MonHoc;
import com.example.QuanLySinhVien.mapper.MonHocMapper;
import com.example.QuanLySinhVien.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocImpl implements MonHocService {
    @Autowired
    private MonHocMapper mapper;
    @Override
    public List<MonHoc> getAllEntity() {
        return mapper.getAllMonHoc();
    }

    @Override
    public MonHoc getEntityById(String id) {
        return mapper.getMonHocById(id);
    }

    @Override
    public void createEntity(MonHoc entity) {
        mapper.createMonHoc(entity);
    }

    @Override
    public void updateEntity(MonHoc entity) {
        mapper.updateMonHoc(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteMonHoc(id);
    }
}
