package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.MonHoc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MonHocMapper {
    public List<MonHoc> getAllMonHoc();

    public MonHoc getMonHocById(@Param("maMonHoc") String maMonHoc);

    public void createMonHoc(MonHoc monHoc);

    public void updateMonHoc(MonHoc monHoc);

    public void deleteMonHoc(@Param("maMonHoc") String maMonHoc);
}
