package com.vitamin.app.mapper;

import com.vitamin.app.dto.ClinicDto;
import com.vitamin.app.dto.RoomDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomMapper {
    public int insertRoom(RoomDto roomDto);

    public void updateRoom(RoomDto roomDto);

    public int insertClinic(ClinicDto clinicDto);

    public void updateClinic(ClinicDto clinicDto);
}
