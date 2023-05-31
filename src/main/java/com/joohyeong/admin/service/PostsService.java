package com.joohyeong.admin.service;

import com.joohyeong.admin.domain.posts.PostsRepository;
import com.joohyeong.admin.web.dto.PostsSaveRequestDto;

import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity())
                .getId();
    }
}
