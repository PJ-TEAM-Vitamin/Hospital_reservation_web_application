package com.vitamin.app.mapper;

import com.vitamin.app.dto.DiseaseDto;
import com.vitamin.app.dto.MedicationDto;
import com.vitamin.app.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;

@Mapper
public interface UserMapper {
    // 회원 정보 입력
    public int insertUser(UserDto userDto);
    // 회원 수정
    public void updateUser(UserDto userDto);
    // 회원 삭제
    public void deleteUser(String user_id);
    // 로그인
    public UserDto login(BigInteger user_id);

    //medication 정보 입력
    public int insertMedication(MedicationDto medicationDto);
    //disease 정보 입력
    public int insertDisease(DiseaseDto diseaseDto);
}