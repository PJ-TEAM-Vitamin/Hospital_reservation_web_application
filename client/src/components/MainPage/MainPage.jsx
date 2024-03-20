import React from "react";
import Calendars from "./Calendars";
import NoticePage from "../NoticePage/NoticePage";
import {Container, CalendarContainer, NoticeContainer} from './MainPagestyle';

function MainPage() {
    return (
        <Container>
          <CalendarContainer>
            <Calendars /> {/* 캘린더 컴포넌트를 왼쪽에 배치 */}
          </CalendarContainer>
          <NoticeContainer>
            <NoticePage /> {/* 공지사항 목록 컴포넌트를 오른쪽에 배치 */}
          </NoticeContainer>
        </Container>
    );
};

export default MainPage;