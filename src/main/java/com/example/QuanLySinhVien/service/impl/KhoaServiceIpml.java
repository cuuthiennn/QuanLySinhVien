package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.Khoa;
import com.example.QuanLySinhVien.mapper.KhoaMapper;
import com.example.QuanLySinhVien.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaServiceIpml implements KhoaService {

    @Autowired
    private KhoaMapper mapper;

    @Override
    public List<Khoa> getAllEntity() {
        return mapper.getAllKhoa();
    }

    @Override
    public Khoa getEntityById(String id) {
        return mapper.getKhoaById(id);
    }

    @Override
    public void createEntity(Khoa entity) {
        mapper.createKhoa(entity);
    }

    @Override
    public void updateEntity(Khoa entity) {
        mapper.updateKhoa(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteKhoa(id);
    }
}
