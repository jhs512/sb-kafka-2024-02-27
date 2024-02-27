package com.ll.sbkafka20240227.domain.post.post.entity;

import com.ll.sbkafka20240227.domain.member.member.entity.Member;
import com.ll.sbkafka20240227.global.jpa.entity.BaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class Post extends BaseTime {
    @ManyToOne
    private Member author;
    private String title;
}