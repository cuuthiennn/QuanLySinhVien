package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.Diem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiemMapper {
    public List<Diem> getAllDiem(@Param("maSinhVien") String maSinhVien);

    public Diem getDiemByMaMonHoc(@Param("maSinhVien") String maSinhVien, @Param("maMonHoc") String maMonHoc);

    public void createDiem(Diem diem);

    public void updateDiem(Diem diem);

    public void deleteDiem(@Param("maSinhVien") String maSinhVien, @Param("maMonHoc") String maMonHoc);
}
