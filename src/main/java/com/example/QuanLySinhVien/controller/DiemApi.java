package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.Diem;
import com.example.QuanLySinhVien.service.DiemService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonEncoding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("api/Diem")
public class DiemApi {

    @Autowired
    private DiemService service;

    @GetMapping("/getAllDiem")
    ResponseEntity<?> doGetAllDiem(){
        List<Diem> diems = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try{
            diems = service.getAllDiem();
            result.put("success", true);
            result.put("message", "Success when call api getAllDiem");
            result.put("data", diems);
        }catch (Exception e){
            log.error("Error when call api getAllDiem: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllDiem");
            result.put("data", diems);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAllDiemSinhVien")
    ResponseEntity<?> doGetAllDiemSinhVien(@RequestParam("maSinhVien") String maSinhVien){
        List<Diem> diems = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try{
            diems = service.getAllDiemSinhVien(maSinhVien);
            result.put("success", true);
            result.put("message", "Success when call api getAllDiemSinhVien");
            result.put("data", diems);
        }catch (Exception e){
            log.error("Error when call api getAllDiemSinhVien: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllDiemSinhVien");
            result.put("data", diems);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAllDiemMonHoc")
    ResponseEntity<?> doGetAllDiemMonHoc(@RequestParam("maMonHoc") String maMonHoc){
        List<Diem> diems = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try{
            diems = service.getAllDiemMonHoc(maMonHoc);
            result.put("success", true);
            result.put("message", "Success when call api getAllDiemMonHoc");
            result.put("data", diems);
        }catch (Exception e){
            log.error("Error when call api getAllDiemMonHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllDiemMonHoc");
            result.put("data", diems);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getDiemSinhVienByMaMonHoc")
    ResponseEntity<?> doGetDiemSinhVienByMaMonHoc(@RequestParam("maSinhVien") String maSinhVien,
                                          @RequestParam("maMonHoc") String maMonHoc){
        Diem diem = new Diem();
        HashMap<String, Object> result = new HashMap<>();
        try{
            diem = service.getDiemSinhVienByMaMonHoc(maSinhVien, maMonHoc);
            result.put("success", true);
            result.put("message", "Success when call api getDiemSinhVienByMaMonHoc");
            result.put("data", diem);
        }catch (Exception e){
            log.error("Error when call api getDiemSinhVienByMaMonHoc: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getDiemSinhVienByMaMonHoc");
            result.put("data", diem);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createDiem")
    ResponseEntity<?> doCreateDiem(@RequestBody Diem entity){
        HashMap<String, Object> result = new HashMap<>();
        try{
            service.createDiem(entity);
            result.put("success", true);
            result.put("message", "Success when call api createDiem");
            result.put("data", entity);
        }catch (Exception e){
            log.error("Error when call api createDiem: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createDiem");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateDiem")
    ResponseEntity<?> doUpdateDiem(@RequestBody Diem entity){
        HashMap<String, Object> result = new HashMap<>();
        try{
            service.updateDiem(entity);
            result.put("success", true);
            result.put("message", "Success when call api updateDiem");
            result.put("data", entity);
        }catch (Exception e){
            log.error("Error when call api updateDiem: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateDiem");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteDiem")
    ResponseEntity<?> doDeleteDiem(@RequestParam("maSinhVien") String maSinhVien,
                                   @RequestParam("maMonHoc") String maMonHoc){
        HashMap<String, Object> result = new HashMap<>();
        try{
            service.deleteDiem(maSinhVien, maMonHoc);
            result.put("success", true);
            result.put("message", "Success when call api deleteDiem");
            result.put("data", maSinhVien);
        }catch (Exception e){
            log.error("Error when call api deleteDiem: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteDiem");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

}
