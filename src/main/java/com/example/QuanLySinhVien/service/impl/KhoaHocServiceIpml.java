package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.KhoaHoc;
import com.example.QuanLySinhVien.mapper.KhoaHocMapper;
import com.example.QuanLySinhVien.service.KhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaHocServiceIpml implements KhoaHocService {

    @Autowired
    private KhoaHocMapper mapper;

    @Override
    public List<KhoaHoc> getAllEntity() {
        return mapper.getAllKhoaHoc();
    }

    @Override
    public KhoaHoc getEntityById(String id) {
        return mapper.getKhoaHocById(id);
    }

    @Override
    public void createEntity(KhoaHoc entity) {
        mapper.createKhoaHoc(entity);
    }

    @Override
    public void updateEntity(KhoaHoc entity) {
        mapper.updateKhoaHoc(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteKhoaHoc(id);
    }
}
