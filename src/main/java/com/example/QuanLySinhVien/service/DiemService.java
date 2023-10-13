package com.example.QuanLySinhVien.service;

import com.example.QuanLySinhVien.entity.Diem;

import java.util.List;

public interface DiemService {
    public List<Diem> getAllDiem(String maSinhVien);

    public Diem getDiemByMaMonHoc(String maSinhVien, String maMonHoc);

    public void createDiem(Diem diem);

    public void updateDiem(Diem diem);

    public void deleteDiem(String maSinhVien, String maMonHoc);
}
