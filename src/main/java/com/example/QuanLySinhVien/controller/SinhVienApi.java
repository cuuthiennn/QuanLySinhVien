package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.SinhVien;
import com.example.QuanLySinhVien.service.SinhVienService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/SinhVien")
public class SinhVienApi {
    @Autowired
    private SinhVienService service;

    @GetMapping("/getAllSinhVien")
    ResponseEntity<?> doGetAllSinhVien(){
        List<SinhVien> sinhViens = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            sinhViens = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllSinhVien");
            result.put("data", sinhViens);
        }catch (Exception e){
            log.error("Error when call api getAllSinhVien: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllSinhVien");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getSinhVienById")
    ResponseEntity<?> doGetSinhVienById(@RequestParam("maSinhVien") String maSinhVien ){
        SinhVien sinhVien = new SinhVien();
        HashMap<String, Object> result = new HashMap<>();
        try {
            sinhVien = service.getEntityById(maSinhVien);
            result.put("success", true);
            result.put("message", "Success when call api getSinhVienById");
            result.put("data", sinhVien);
        }catch (Exception e){
            log.error("Error when call api getSinhVienById: ",e);
            result.put("success", false);
            result.put("message", "Failed when call api getSinhVienById");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createSinhVien")
    ResponseEntity<?> doCreateSinhVien(@RequestBody SinhVien sinhVien){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(sinhVien);
            result.put("success", true);
            result.put("message", "Success when call api createSinhVien");
            result.put("data", sinhVien.getMaSinhVien());
        }catch (Exception e){
            log.error("Error when call api createSinhVien: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createSinhVien");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateSinhVien")
    ResponseEntity<?> doUpdateSinhVien(@RequestBody SinhVien sinhVien){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(sinhVien);
            result.put("success", true);
            result.put("message", "Success when call api updateSinhVien");
            result.put("data", sinhVien.getMaSinhVien());
        }catch (Exception e){
            log.error("Error when call api updateSinhVien: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateSinhVien");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteSinhVien")
    ResponseEntity<?> doDeleteSinhVien(@RequestParam("maSinhVien") String maSinhVien){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maSinhVien);
            result.put("success", true);
            result.put("message", "Success when call api deleteSinhVien");
            result.put("data", maSinhVien);
        }catch (Exception e){
            result.put("success", false);
            result.put("message", "Failed when call api deleteSinhVien");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
