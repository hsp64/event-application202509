package com.study.event.repository;

import com.study.event.domain.entity.Event;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(false)
class EventRepositoryImplTest {

    @Autowired
    EventRepository eventRepository;

    //무한 스크롤
/*    @Test
    @DisplayName("bulkInsert")
    void bulkInsert() {
        //given
        for (int i = 1; i <= 300; i++) {
            Event event = Event.builder()
                    .title("더미제목 " + i)
                    .description("더미내용" + i)
                    .date(LocalDate.now())
                    .image("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMDdfMjg1%2FMDAxNjY1MTQ5NTExOTQ3.e6OvarLo1MiPK-_Dho_TLav8cICtn_Z1MSfcWRx5pSQg.FwUF4XFq5EME2hRrq7ujYeZLW6YeI8c_dfrJWVWs0oUg.JPEG.ormrbb%2F1665149371661.jpg&type=a340")
                    .build();

            eventRepository.save(event);
        }
        //when

        //then
    }*/


}