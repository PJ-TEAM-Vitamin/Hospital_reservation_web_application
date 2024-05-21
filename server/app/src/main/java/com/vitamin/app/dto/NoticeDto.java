package com.vitamin.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class NoticeDto {
    private BigInteger notice_id;
    private String title;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime created_at;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "Asia/Seoul")
    private LocalDateTime updated_at;
    private BigInteger hospital_id;
    private BigInteger admin_id;
}
