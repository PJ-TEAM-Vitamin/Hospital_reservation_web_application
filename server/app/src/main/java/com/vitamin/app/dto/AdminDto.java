package com.vitamin.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class AdminDto {
    private BigInteger admin_id;
    private String password;
    private String email;
    private String name;
    private Integer is_active;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime last_login;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime created_at;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime updated_at;
    private BigInteger hospital_id;
}
