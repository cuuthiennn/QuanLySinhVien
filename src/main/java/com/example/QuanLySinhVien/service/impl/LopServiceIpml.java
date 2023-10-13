package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.Lop;
import com.example.QuanLySinhVien.mapper.LopMapper;
import com.example.QuanLySinhVien.service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopServiceIpml implements LopService {

    @Autowired
    private LopMapper mapper;

    @Override
    public List<Lop> getAllEntity() {
        return mapper.getAllLop();
    }

    @Override
    public Lop getEntityById(String id) {
        return mapper.getLopById(id);
    }

    @Override
    public void createEntity(Lop entity) {
        mapper.createLop(entity);
    }

    @Override
    public void updateEntity(Lop entity) {
        mapper.updateLop(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteLop(id);
    }
}
