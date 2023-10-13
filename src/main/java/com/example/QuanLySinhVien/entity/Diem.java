package com.example.QuanLySinhVien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Diem {
    private String maSinhVien;
    private String maMonHoc;
    private float diemL1;
    private float diemL2;
}
