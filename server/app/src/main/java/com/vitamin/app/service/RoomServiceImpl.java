package com.vitamin.app.service;

import com.vitamin.app.dto.ClinicDto;
import com.vitamin.app.dto.RoomDto;
import com.vitamin.app.mapper.RoomMapper;
import com.vitamin.app.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public int insertRoom(RoomDto roomDto){
        return roomMapper.insertRoom(roomDto);
    }

    @Override
    public void updateRoom(RoomDto roomDto){
        roomMapper.updateRoom(roomDto);
    }

    @Override
    public int insertClinic(ClinicDto clinicDto){
        return roomMapper.insertClinic(clinicDto);
    }

    @Override
    public void updateClinic(ClinicDto clinicDto){
        roomMapper.updateClinic(clinicDto);
    }
}