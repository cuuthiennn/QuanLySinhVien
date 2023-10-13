package com.example.QuanLySinhVien.controller;

import com.example.QuanLySinhVien.entity.HeDT;
import com.example.QuanLySinhVien.service.HeDTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/HeDT")
public class HeDTApi {

    @Autowired
    private HeDTService service;

    @GetMapping("/getAllHeDT")
    ResponseEntity<?> doGetAllHeDT(){
        List<HeDT> heDTS = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<>();
        try {
            heDTS = service.getAllEntity();
            result.put("success", true);
            result.put("message", "Success when call api getAllHeDT");
            result.put("data", heDTS);
        }catch (Exception e){
            log.error("Error when call api getAllHeDT: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllHeDT");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getHeDTById")
    ResponseEntity<?> doGetHeDTById(@RequestParam("maHeDT") String maHeDT){
        HeDT heDT = new HeDT();
        HashMap<String, Object> result = new HashMap<>();
        try {
            heDT = service.getEntityById(maHeDT);
            result.put("success", true);
            result.put("message", "Success when call api getAllHeDT");
            result.put("data", heDT);
        }catch (Exception e){
            log.error("Error when call api getAllHeDT: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api getAllHeDT");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateHeDT")
    ResponseEntity<?> doUpdateHeDT(@RequestBody HeDT entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.updateEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api updateHeDT");
            result.put("data", entity.getMaHeDT());
        }catch (Exception e){
            log.error("Error when call api updateHeDT: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api updateHeDT");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/createHeDT")
    ResponseEntity<?> doCreateHeDT(@RequestBody HeDT entity){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.createEntity(entity);
            result.put("success", true);
            result.put("message", "Success when call api createHeDT");
            result.put("data", entity.getMaHeDT());
        }catch (Exception e){
            log.error("Error when call api createHeDT: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api createHeDT");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/deleteHeDT")
    ResponseEntity<?> doDeleteHeDT(@RequestParam("maHeDT") String maHeDT){
        HashMap<String, Object> result = new HashMap<>();
        try {
            service.deleteEntity(maHeDT);
            result.put("success", true);
            result.put("message", "Success when call api deleteHeDT");
            result.put("data", maHeDT);
        }catch (Exception e){
            log.error("Error when call api deleteHeDT: ", e);
            result.put("success", false);
            result.put("message", "Failed when call api deleteHeDT");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
