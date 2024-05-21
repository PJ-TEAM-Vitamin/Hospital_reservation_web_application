package com.vitamin.app.dto;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDate;

@Data
public class MajorDto {
    private BigInteger major_id;
    private String title;
    private String degree;
    private String school;
    private LocalDate graduate;
    private BigInteger doctor_id;
}
