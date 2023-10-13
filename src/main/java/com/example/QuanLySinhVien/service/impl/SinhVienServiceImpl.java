package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.SinhVien;
import com.example.QuanLySinhVien.mapper.SinhVienMapper;
import com.example.QuanLySinhVien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    private SinhVienMapper mapper;

    @Override
    public List<SinhVien> getAllEntity() {
        return mapper.getAllSinhVien();
    }

    @Override
    public SinhVien getEntityById(String id) {
        return mapper.getSinhVienById(id);
    }

    @Override
    public void createEntity(SinhVien entity) {
        mapper.createSinhVien(entity);
    }

    @Override
    public void updateEntity(SinhVien entity) {
        mapper.updateSinhVien(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteSinhVien(id);
    }
}
