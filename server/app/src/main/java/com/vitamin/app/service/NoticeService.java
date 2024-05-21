package com.vitamin.app.service;

import com.vitamin.app.dto.NoticeDto;

public interface NoticeService {
    public int insertNotice(NoticeDto noticeDto);

    public void updateNotice(NoticeDto noticeDto);
}
