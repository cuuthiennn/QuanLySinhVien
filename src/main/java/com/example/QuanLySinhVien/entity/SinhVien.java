package com.example.QuanLySinhVien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private String gioiTinh;
    private Date ngaySinh;
    private String queQuan;
    private String maLop;
}
