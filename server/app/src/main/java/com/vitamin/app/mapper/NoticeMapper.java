package com.vitamin.app.mapper;

import com.vitamin.app.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
    // notice 정보 입력
    public int insertNotice(NoticeDto noticeDto);
    // notice 수정
    public void updateNotice(NoticeDto noticeDto);
}
