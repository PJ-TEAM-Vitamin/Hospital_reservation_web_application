package com.vitamin.app.dto;

import lombok.Data;

import java.math.BigInteger;
@Data
public class MedicationDto {
    private BigInteger medication_id;
    private String name;
    private String manufacturer;
    private BigInteger user_id;
}
