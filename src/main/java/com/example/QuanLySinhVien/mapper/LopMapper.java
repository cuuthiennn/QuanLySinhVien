package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.Lop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LopMapper {
    public List<Lop> getAllLop();

    public Lop getLopById(@Param("maLop") String maLop);

    public void createLop(Lop lop);

    public void updateLop(Lop lop);

    public void deleteLop(String maLop);
}
