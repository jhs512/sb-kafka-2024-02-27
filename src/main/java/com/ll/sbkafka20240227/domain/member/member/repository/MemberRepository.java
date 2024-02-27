package com.ll.sbkafka20240227.domain.member.member.repository;

import com.ll.sbkafka20240227.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
