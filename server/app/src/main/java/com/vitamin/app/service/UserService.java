package com.vitamin.app.service;

import com.vitamin.app.dto.DiseaseDto;
import com.vitamin.app.dto.MedicationDto;
import com.vitamin.app.dto.UserDto;

import java.math.BigInteger;

public interface UserService {
    public int insertUser(UserDto userDto);
    public void updateUser(UserDto userDto);
    public void deleteUser(String user_id);

    public UserDto login(BigInteger user_id);

    public int insertMedication(MedicationDto medicationDto);

    public int insertDisease(DiseaseDto diseaseDto);


}

