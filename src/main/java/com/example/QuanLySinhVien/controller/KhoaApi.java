package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.Khoa;
import com.example.QuanLySinhVien.entity.Lop;
import com.example.QuanLySinhVien.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/Khoa")
public class KhoaApi {

    @Autowired
    private KhoaService service;

    @GetMapping("/getAllKhoa")
    ResponseEntity<?> doGetAllKhoa(){
        List<Khoa> khoas = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            khoas = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllKhoa");
            result.put("data", khoas);
        }catch (Exception e){
            log.error("Error when call api getAllKhoa: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllKhoa");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getKhoaById")
    ResponseEntity<?> doGetKhoaById(@RequestParam("maKhoa") String maKhoa){
        Khoa khoa = new Khoa();
        HashMap<String, Object> result = new HashMap<>();
        try {
            khoa = service.getEntityById(maKhoa);
            result.put("success", true);
            result.put("message", "Success when call api getKhoaById");
            result.put("data", khoa);
        }catch (Exception e){
            log.error("Error when call api getKhoaById: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getKhoaById");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateKhoa")
    ResponseEntity<?> doUpdateKhoa(@RequestBody Khoa entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api updateKhoa");
            result.put("data", entity.getMaKhoa());
        }catch (Exception e){
            log.error("Error when call api updateKhoa: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateKhoa");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/createKhoa")
    ResponseEntity<?> doCreateKhoa(@RequestBody Khoa entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api createKhoa");
            result.put("data", entity.getMaKhoa());
        }catch (Exception e){
            log.error("Error when call api createKhoa: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createKhoa");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/deleteKhoa")
    ResponseEntity<?> doDeleteKhoa(@RequestParam("maKhoa") String maKhoa){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maKhoa);
            result.put("success", true);
            result.put("message", "Success when call api deleteKhoa");
            result.put("data", maKhoa);
        }catch (Exception e){
            log.error("Error when call api deleteKhoa: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteKhoa");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
