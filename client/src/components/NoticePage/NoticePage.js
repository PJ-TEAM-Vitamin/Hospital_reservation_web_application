import React, { useState } from 'react';
import styled from 'styled-components';

const Container = styled.div`
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
`;

const NoticeList = styled.div`
  list-style: none;
  padding: 0;
`;

const NoticeItem = styled.div`
  display: flex;
  align-items: center;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  overflow: hidden;
  margin-bottom: 20px;
  cursor: pointer;
`;

const NoticeNumber = styled.div`
  padding: 20px;
  border-right: 1px solid #ddd;
`;

const NoticeInfo = styled.div`
  flex-grow: 1;
  padding: 20px;
`;

const NoticeTitle = styled.h3`
  color: #333;
  margin: 0;
`;

const NoticeDate = styled.span`
  color: #555;
  margin-left: auto;
  padding-left: 20px;
  border-left: 1px solid #ddd;
`;

const NoticeContent = styled.p`
  margin-top: 10px;
  color: #666;
`;

function NoticePage() {
  const [selectedNotice, setSelectedNotice] = useState(null);

  const notices = [
    { id: 1, title: '첫 번째 공지사항', content: '이것은 첫 번째 공지사항입니다.', date: '03.20' },
    { id: 2, title: '두 번째 공지사항', content: '이것은 두 번째 공지사항입니다.', date: '03.19' },
    { id: 3, title: '세 번째 공지사항', content: '이것은 세 번째 공지사항입니다.', date: '03.18' },
    { id: 4, title: '네 번째 공지사항', content: '이것은 네 번째 공지사항입니다.', date: '03.17' },
  ];

  const handleNoticeClick = (id) => {
    setSelectedNotice(id === selectedNotice ? null : id);
  };

  return (
    <Container>
      <NoticeList>
        {notices.map((notice) => (
          <NoticeItem key={notice.id} onClick={() => handleNoticeClick(notice.id)}>
            <NoticeNumber>{notice.id}</NoticeNumber>
            <NoticeInfo>
              <NoticeTitle>{notice.title}</NoticeTitle>
              {selectedNotice === notice.id && <NoticeContent>{notice.content}</NoticeContent>}
            </NoticeInfo>
            <NoticeDate>{notice.date}</NoticeDate>
          </NoticeItem>
        ))}
      </NoticeList>
    </Container>
  );
}

export default NoticePage;