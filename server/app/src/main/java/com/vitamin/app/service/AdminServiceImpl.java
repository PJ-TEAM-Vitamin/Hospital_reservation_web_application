package com.vitamin.app.service;

import com.vitamin.app.dto.AdminDto;
import com.vitamin.app.dto.ClosedDto;
import com.vitamin.app.dto.DoctorDto;
import com.vitamin.app.mapper.AdminMapper;
import com.vitamin.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminDto admin_login(BigInteger admin_id){
        return adminMapper.admin_login(admin_id);
    }

    @Override
    public void updateClosed(ClosedDto closedDto){
        adminMapper.updateClosed(closedDto);
    }

    @Override
    public int insertDoctor(DoctorDto doctorDto){
        return adminMapper.insertDoctor(doctorDto);
    }

    @Override
    public void updateDoctor(DoctorDto doctorDto){
        adminMapper.updateDoctor(doctorDto);
    }
}
