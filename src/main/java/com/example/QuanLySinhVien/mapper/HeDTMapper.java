package com.example.QuanLySinhVien.mapper;

import com.example.QuanLySinhVien.entity.HeDT;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HeDTMapper {
    public List<HeDT> getAllHeDT();

    public HeDT getHeDTById(@Param("maHeDT") String maHeDT);

    public void createHeDT(HeDT heDT);

    public void updateHeDT(HeDT heDT);

    public void deleteHeDT(String maHeDT);
}
