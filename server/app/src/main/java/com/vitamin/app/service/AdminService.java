package com.vitamin.app.service;

import com.vitamin.app.dto.AdminDto;
import com.vitamin.app.dto.ClosedDto;
import com.vitamin.app.dto.DoctorDto;


import java.math.BigInteger;

public interface AdminService {
    public AdminDto admin_login(BigInteger admin_id);
    public void updateClosed(ClosedDto closedDto);

    public int insertDoctor(DoctorDto doctorDto);

    public void updateDoctor(DoctorDto doctorDto);
}