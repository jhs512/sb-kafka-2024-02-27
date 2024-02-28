package com.ll.sbkafka20240227.domain.post.post.service;

import com.ll.sbkafka20240227.domain.member.member.entity.Member;
import com.ll.sbkafka20240227.domain.post.post.entity.Author;
import com.ll.sbkafka20240227.domain.post.post.entity.Post;
import com.ll.sbkafka20240227.domain.post.post.repository.PostRepository;
import com.ll.sbkafka20240227.global.rsData.RsData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public RsData<Post> write(Author author, String title) {
        return RsData.of(
                postRepository.save(
                        Post.builder()
                                .author(author)
                                .title(title)
                                .build()
                )
        );
    }

    public Author of(Member member) {
        return entityManager.getReference(Author.class, member.getId());
    }
}

