package com.vitamin.app.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class ClinicDto {
    private BigInteger clinic_id;
    private String title;
    private String description;
    private BigInteger room_id;
}
