package com.example.QuanLySinhVien.service;

import com.example.QuanLySinhVien.entity.SinhVien;

import java.util.List;

public interface AbstractService<T> {
    public List<T> getAllEntity();

    public T getEntityById(String id);

    public void createEntity(T entity);

    public void updateEntity(T entity);

    public void deleteEntity(String id);
}
