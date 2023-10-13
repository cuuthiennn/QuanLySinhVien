package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.SinhVien;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SinhVienMapper {
    public List<SinhVien> getAllSinhVien();

    public SinhVien getSinhVienById(String maSinhVien);

    public void createSinhVien(SinhVien sinhVien);

    public void updateSinhVien(SinhVien sinhVien);

    public void deleteSinhVien(String maSinhVien);
}
