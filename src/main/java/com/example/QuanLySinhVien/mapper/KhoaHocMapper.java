package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.KhoaHoc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KhoaHocMapper {
    public List<KhoaHoc> getAllKhoaHoc();

    public KhoaHoc getKhoaHocById(@Param("maKhoaHoc") String maKhoaHoc);

    public void createKhoaHoc(KhoaHoc khoaHoc);

    public void updateKhoaHoc(KhoaHoc khoaHoc);

    public void deleteKhoaHoc(String maKhoaHoc);
}
