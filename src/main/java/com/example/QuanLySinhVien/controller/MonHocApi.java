package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.MonHoc;
import com.example.QuanLySinhVien.entity.SinhVien;
import com.example.QuanLySinhVien.service.MonHocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/MonHoc")
public class MonHocApi {

    @Autowired
    private MonHocService service;

    @GetMapping("/getAllMonHoc")
    ResponseEntity<?> doGetAllMonHoc(){
        List<MonHoc> monHocs = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            monHocs = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllMonHoc");
            result.put("data", monHocs);
        }catch (Exception e){
            log.error("Error when call api getAllMonHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllMonHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateMonHoc")
    ResponseEntity<?> doUpdateMonHoc(@RequestBody MonHoc monHoc){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(monHoc);
            result.put("success", true);
            result.put("message", "Success when call api updateMonHoc");
            result.put("data", monHoc.getMaMonHoc());
        }catch (Exception e){
            log.error("Error when call api updateSinhVien: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateMonHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createMonHoc")
    ResponseEntity<?> doCreateMonHoc(@RequestBody MonHoc monHoc){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(monHoc);
            result.put("success", true);
            result.put("message", "Success when call api createMonHoc");
            result.put("data", monHoc.getMaMonHoc());
        }catch (Exception e){
            log.error("Error when call api createMonHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createMonHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteMonHoc")
    ResponseEntity<?> doDeleteMonHoc(@RequestParam("maMonHoc") String maMonHoc){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maMonHoc);
            result.put("success", true);
            result.put("message", "Success when call api deleteMonHoc");
            result.put("data", maMonHoc);
        }catch (Exception e){
            log.error("Error when call api deleteMonHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteMonHoc");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

}
