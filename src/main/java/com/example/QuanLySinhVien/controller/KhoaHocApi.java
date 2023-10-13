package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.Khoa;
import com.example.QuanLySinhVien.entity.KhoaHoc;
import com.example.QuanLySinhVien.service.KhoaHocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/KhoaHoc")
public class KhoaHocApi {

    @Autowired
    private KhoaHocService service;

    @GetMapping("/getAllKhoaHoc")
    ResponseEntity<?> doGetAllKhoaHoc(){
        List<KhoaHoc> khoaHocs = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            khoaHocs = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllKhoaHoc");
            result.put("data", khoaHocs);
        }catch (Exception e){
            log.error("Error when call api getAllKhoaHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllKhoaHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getKhoaHocById")
    ResponseEntity<?> doGetKhoaById(@RequestParam("maKhoaHoc") String maKhoaHoc){
        KhoaHoc khoaHoc = new KhoaHoc();
        HashMap<String, Object> result = new HashMap<>();
        try {
            khoaHoc = service.getEntityById(maKhoaHoc);
            result.put("success", true);
            result.put("message", "Success when call api getKhoaHocById");
            result.put("data", khoaHoc);
        }catch (Exception e){
            log.error("Error when call api getKhoaHocById: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getKhoaHocById");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateKhoaHoc")
    ResponseEntity<?> doUpdateKhoaHoc(@RequestBody KhoaHoc entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api updateKhoaHoc");
            result.put("data", entity.getMaKhoaHoc());
        }catch (Exception e){
            log.error("Error when call api updateKhoaHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateKhoaHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/createKhoaHoc")
    ResponseEntity<?> doCreateKhoaHoc(@RequestBody KhoaHoc entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api createKhoaHoc");
            result.put("data", entity.getMaKhoaHoc());
        }catch (Exception e){
            log.error("Error when call api createKhoaHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createKhoaHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/deleteKhoaHoc")
    ResponseEntity<?> doDeleteKhoaHoc(@RequestParam("maKhoaHoc") String maKhoaHoc){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maKhoaHoc);
            result.put("success", true);
            result.put("message", "Success when call api deleteKhoaHoc");
            result.put("data", maKhoaHoc);
        }catch (Exception e){
            log.error("Error when call api deleteKhoaHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteKhoaHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
