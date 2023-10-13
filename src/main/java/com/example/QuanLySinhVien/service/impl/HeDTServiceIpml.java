package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.HeDT;
import com.example.QuanLySinhVien.mapper.HeDTMapper;
import com.example.QuanLySinhVien.service.HeDTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeDTServiceIpml implements HeDTService {

    @Autowired
    private HeDTMapper mapper;

    @Override
    public List<HeDT> getAllEntity() {
        return mapper.getAllHeDT();
    }

    @Override
    public HeDT getEntityById(String id) {
        return mapper.getHeDTById(id);
    }

    @Override
    public void createEntity(HeDT entity) {
        mapper.createHeDT(entity);
    }

    @Override
    public void updateEntity(HeDT entity) {
        mapper.updateHeDT(entity);
    }

    @Override
    public void deleteEntity(String id) {
        mapper.deleteHeDT(id);
    }
}
