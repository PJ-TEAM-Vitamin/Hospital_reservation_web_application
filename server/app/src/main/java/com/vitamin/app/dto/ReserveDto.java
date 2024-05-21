package com.vitamin.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class ReserveDto {
    private BigInteger reserve_id;
    private String symptom;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime reservation;
    private Integer reservation_status;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime confirmed;
    private BigInteger user_id;
}
