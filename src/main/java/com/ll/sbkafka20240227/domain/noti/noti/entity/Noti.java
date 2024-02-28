package com.ll.sbkafka20240227.domain.noti.noti.entity;

import com.ll.sbkafka20240227.domain.member.member.entity.Member;
import com.ll.sbkafka20240227.global.jpa.entity.BaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class Noti extends BaseTime {
    @ManyToOne
    private Member actor;
    @ManyToOne
    private Member receiver;
    private String relTypeCode;
    private long relId;
    private String typeCode;
    private String type2Code;
    private boolean read;
}
