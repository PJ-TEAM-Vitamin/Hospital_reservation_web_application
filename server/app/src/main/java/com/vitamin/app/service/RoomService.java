package com.vitamin.app.service;

import com.vitamin.app.dto.ClinicDto;
import com.vitamin.app.dto.RoomDto;

public interface RoomService {

    public int insertRoom(RoomDto roomDto);

    public void updateRoom(RoomDto roomDto);

    public int insertClinic(ClinicDto clinicDto);

    public void updateClinic(ClinicDto clinicDto);
}
