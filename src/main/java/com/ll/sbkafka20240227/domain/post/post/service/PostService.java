package com.ll.sbkafka20240227.domain.post.post.service;

import com.ll.sbkafka20240227.domain.member.member.entity.Member;
import com.ll.sbkafka20240227.domain.noti.noti.service.NotiService;
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
    private final NotiService notiService;
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public RsData<Post> write(Author author, String title) {
        author.increasePostsCount();

        Post post = postRepository.save(
                Post.builder()
                        .author(author)
                        .title(title)
                        .build()
        );

        firePostCreatedEvent(post);

        return RsData.of(post);
    }

    private void firePostCreatedEvent(Post post) {
        System.out.println("이벤트 발생");
    }

    public Author of(Member member) {
        return entityManager.getReference(Author.class, member.getId());
    }
}

