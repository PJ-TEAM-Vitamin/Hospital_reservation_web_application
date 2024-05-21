package com.vitamin.app.service;

import com.vitamin.app.dto.DiseaseDto;
import com.vitamin.app.dto.MedicationDto;
import com.vitamin.app.dto.UserDto;
import com.vitamin.app.mapper.UserMapper;
import com.vitamin.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(UserDto userDto){
        return userMapper.insertUser(userDto);
    }

    @Override
    public void updateUser(UserDto userDto){
        userMapper.updateUser(userDto);
    }
    @Override
    public void deleteUser(String user_id){
        userMapper.deleteUser(user_id);
    }

    @Override
    public UserDto login(BigInteger user_id){
        return userMapper.login(user_id);
    }

    @Override
    public int insertMedication(MedicationDto medicationDto){
        return userMapper.insertMedication(medicationDto);
    }

    @Override
    public int insertDisease(DiseaseDto diseaseDto){
        return userMapper.insertDisease(diseaseDto);
    }
}
