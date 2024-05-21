package com.vitamin.app.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class RoomDto {
    private BigInteger room_id;
    private String name;
    private String area;
    private String floor;
    private String call_number;
    private BigInteger hospital_id;
    private BigInteger doctor_id;
}
