package com.vitamin.app.mapper;

import com.vitamin.app.dto.AdminDto;
import com.vitamin.app.dto.ClosedDto;
import com.vitamin.app.dto.DoctorDto;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
@Mapper
public interface AdminMapper {
    public AdminDto admin_login(BigInteger admin_id);

    // closed 수정
    public void updateClosed(ClosedDto closedDto);

    // 의사 정보 추가
    public int insertDoctor(DoctorDto doctorDto);
    // 의사 정보 수정
    public void updateDoctor(DoctorDto doctorDto);


}