package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.Lop;
import com.example.QuanLySinhVien.entity.MonHoc;
import com.example.QuanLySinhVien.service.LopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/Lop")
public class LopApi {

    @Autowired
    private LopService service;

    @GetMapping("/getAllLop")
    ResponseEntity<?> doGetAllLop(){
        List<Lop> lops = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            lops = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllLop");
            result.put("data", lops);
        }catch (Exception e){
            log.error("Error when call api getLopById: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllLop");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getLopById")
    ResponseEntity<?> doGetLopById(@RequestParam("maLop") String maLop){
        Lop lop = new Lop();
        HashMap<String, Object> result = new HashMap<>();
        try {
            lop = service.getEntityById(maLop);
            result.put("success", true);
            result.put("message", "Success when call api getLopById");
            result.put("data", lop);
        }catch (Exception e){
            log.error("Error when call api getLopById: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getLopById");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateLop")
    ResponseEntity<?> doUpdateLop(@RequestBody Lop lop){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(lop);
            result.put("success", true);
            result.put("message", "Success when call api updateLop");
            result.put("data", lop.getMaLop());
        }catch (Exception e){
            log.error("Error when call api updateLop: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateLop");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createLop")
    ResponseEntity<?> doCreateLop(@RequestBody Lop lop){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(lop);
            result.put("success", true);
            result.put("message", "Success when call api createLop");
            result.put("data", lop.getMaLop());
        }catch (Exception e){
            log.error("Error when call api createLop: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createLop");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteLop")
    ResponseEntity<?> doDeleteLop(@RequestParam("maLop") String maLop){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maLop);
            result.put("success", true);
            result.put("message", "Success when call api deleteLop");
            result.put("data", maLop);
        }catch (Exception e){
            log.error("Error when call api deleteLop: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteLop");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
