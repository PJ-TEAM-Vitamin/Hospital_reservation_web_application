package com.vitamin.app.controller;


import com.vitamin.app.dto.DiseaseDto;
import com.vitamin.app.dto.MedicationDto;
import com.vitamin.app.dto.UserDto;
import com.vitamin.app.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    // 회원가입 화면
    @GetMapping("/signup")
    public String signupPage(){
        return "signup Page";
    }
    // 회원가입 진행
    @PostMapping("/signup")
    public void signUp(@RequestBody UserDto userDto){
        userService.insertUser(userDto);
    }
    // 회원정보 삭제
    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable String user_id){
        userService.deleteUser(user_id);
    }
    // 회원정보 수정
    @PutMapping("/update")
    public void updateUser(@RequestBody UserDto userDto){
        userService.updateUser(userDto);
    }

    // 로그인 화면
    @GetMapping
    public String loginPage(){
        return "로그인 화면";
    }
    // 로그인, front랑 연결 시 필요하면 Model 사용
    @PostMapping("login")
    public String login(@RequestBody UserDto userDto, HttpSession session){
        UserDto idDto = userService.login(userDto.getUser_id());
        if (idDto == null || idDto.equals(null)){
            return "아이디 없음";
        }
        else if (userDto.getPassword().equals(idDto.getPassword()) || (userDto.getPassword() == idDto.getPassword())){
            session.setAttribute("loginid", userDto.getUser_id());
            return "로그인";
        }
        else{
            return "비밀번호 오류";
        }
    }
    // 로그아웃
    @GetMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "로그아웃";
    }

    //medication 정보 입력
    @PostMapping("/medication")
    public String insertMedication(@RequestBody MedicationDto medicationDto){
        userService.insertMedication(medicationDto);
        return "medication 정보 입력";
    }

    // diease 정보 입력
    @PostMapping("/disease")
    public String insertDisease(@RequestBody DiseaseDto diseaseDto){
        userService.insertDisease(diseaseDto);
        return "disease 정보 입력";
    }

    // notice 조회


}
