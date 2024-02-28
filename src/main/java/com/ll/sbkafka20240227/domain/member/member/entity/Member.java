package com.ll.sbkafka20240227.domain.member.member.entity;

import com.ll.sbkafka20240227.global.jpa.entity.BaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class Member extends BaseTime {
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    @Setter(PRIVATE)
    private long postsCount;

    public void increasePostsCount() {
        postsCount++;
    }
}