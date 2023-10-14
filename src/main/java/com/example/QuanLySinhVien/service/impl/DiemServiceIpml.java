package com.example.QuanLySinhVien.service.impl;

import com.example.QuanLySinhVien.entity.Diem;
import com.example.QuanLySinhVien.mapper.DiemMapper;
import com.example.QuanLySinhVien.service.DiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceIpml implements DiemService {

    @Autowired
    private DiemMapper mapper;

    @Override
    public List<Diem> getAllDiem() {
        return mapper.getAllDiem();
    }

    @Override
    public List<Diem> getAllDiemMonHoc(String maMonHoc) {
        return mapper.getAllDiemMonHoc(maMonHoc);
    }

    @Override
    public List<Diem> getAllDiemSinhVien(String maSinhVien) {
        return mapper.getAllDiemSinhVien(maSinhVien);
    }

    @Override
    public Diem getDiemSinhVienByMaMonHoc(String maSinhVien, String maMonHoc) {
        return mapper.getDiemSinhVienByMaMonHoc(maSinhVien, maMonHoc);
    }

    @Override
    public void createDiem(Diem diem) {
        mapper.createDiem(diem);
    }

    @Override
    public void updateDiem(Diem diem) {
        mapper.updateDiem(diem);
    }

    @Override
    public void deleteDiem(String maSinhVien, String maMonHoc) {
        mapper.deleteDiem(maSinhVien, maMonHoc);
    }
}
