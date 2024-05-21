package com.vitamin.app.service;

import com.vitamin.app.dto.NoticeDto;
import com.vitamin.app.mapper.NoticeMapper;
import com.vitamin.app.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public int insertNotice(NoticeDto noticeDto){
        return noticeMapper.insertNotice(noticeDto);
    }

    @Override
    public void updateNotice(NoticeDto noticeDto){
        noticeMapper.updateNotice(noticeDto);
    }
}
