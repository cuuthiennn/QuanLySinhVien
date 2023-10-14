package com.example.QuanLySinhVien.service;

import com.example.QuanLySinhVien.entity.Diem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiemService {
    public List<Diem> getAllDiem();

    public List<Diem> getAllDiemMonHoc(@Param("maMonHoc") String maMonHoc);

    public List<Diem> getAllDiemSinhVien(@Param("maSinhVien") String maSinhVien);

    public Diem getDiemSinhVienByMaMonHoc(@Param("maSinhVien") String maSinhVien, @Param("maMonHoc") String maMonHoc);

    public void createDiem(Diem diem);

    public void updateDiem(Diem diem);

    public void deleteDiem(@Param("maSinhVien") String maSinhVien, @Param("maMonHoc") String maMonHoc);
}
