package com.vitamin.app.controller;

import com.vitamin.app.dto.ClinicDto;
import com.vitamin.app.dto.RoomDto;
import com.vitamin.app.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    // 방 정보 입력
    @PostMapping()
    public String insertRoom(@RequestBody RoomDto roomDto){
        roomService.insertRoom(roomDto);
        return "방 정보 입력";
    }
    // 방 정보 수정
    @PutMapping("/update")
    public String updateRoom(@RequestBody RoomDto roomDto){
        roomService.updateRoom(roomDto);
        return "방 정보 수정";
    }

    // clinic 입력
    @PostMapping("/clinic")
    public String insertClinic(@RequestBody ClinicDto clinicDto){
        roomService.insertClinic(clinicDto);
        return "clinic 정보 입력";
    }
    // clinic 수정
    @PutMapping("/clinic/update")
    public String updateClinic(@RequestBody ClinicDto clinicDto){
        roomService.updateClinic(clinicDto);
        return "clinic 정보 수정";
    }

}