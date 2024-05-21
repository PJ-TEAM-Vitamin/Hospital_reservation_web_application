package com.vitamin.app.controller;

import com.vitamin.app.dto.AdminDto;
import com.vitamin.app.dto.ClosedDto;
import com.vitamin.app.dto.DoctorDto;
import com.vitamin.app.dto.NoticeDto;
import com.vitamin.app.service.AdminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    // admin 로그인
    @PostMapping("/login")
    public String admin_login(@RequestBody AdminDto adminDto, HttpSession session){
        AdminDto idDto = adminService.admin_login(adminDto.getAdmin_id());
        if (idDto == null || idDto.equals(null)){
            return "admin id 없음";
        }
        else if (adminDto.getPassword().equals(idDto.getPassword()) || (adminDto.getPassword() == idDto.getPassword())){
            session.setAttribute("adminid", adminDto.getAdmin_id() );
            return "admin 로그인";
        }
        else{
            return "admin 비밀번호 오류";
        }
    }

    // admin 로그아웃
    @GetMapping("/logout")
    public String admin_logout(HttpSession session){
        session.invalidate();
        return "admin 로그아웃";
    }
    // closed 페이지
    @GetMapping("/closed")
    public String closedPage(){
        return "closed page";
    }

    // closed 수정
    @PostMapping("/closed")
    public String updateClosed(@RequestBody ClosedDto closedDto){
        adminService.updateClosed(closedDto);
        return "closed 수정";
    }

    // doctor 관리 페이지
    @GetMapping("/doctor")
    public String doctorPage(){
        return "doctor Page";
    }

    //의사 정보 입력
    @PostMapping("/doctor")
    public String insertDoctor(@RequestBody DoctorDto doctorDto){
        adminService.insertDoctor(doctorDto);
        return "의사 정보 입력";
    }
    // 의사 정보 수정
    @PutMapping("/doctor/update")
    public String updateDoctor(@RequestBody DoctorDto doctorDto){
        adminService.updateDoctor(doctorDto);
        return "의사 정보 수정";
    }

    // 의사 정보 삭제


}
