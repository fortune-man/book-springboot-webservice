package com.joohyeong.admin.web;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void 메인페이지_로딩() throws Exception {
        // when
        String body = this.restTemplate.getForObject("/", String.class);

        // logging
        System.out.println(body);

        // then
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }


}