package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.Khoa;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KhoaMapper {
    public List<Khoa> getAllKhoa();

    public Khoa getKhoaById(@Param("maKhoa") String maKhoa);

    public void createKhoa(Khoa khoa);

    public void updateKhoa(Khoa khoa);

    public void deleteKhoa(@Param("maKhoa") String maKhoa);
}
