package com.vitamin.app.dto;

import lombok.Data;

import java.math.BigInteger;
@Data
public class DiseaseDto {
    private BigInteger disease_id;
    private String name;
    private BigInteger user_id;
}
