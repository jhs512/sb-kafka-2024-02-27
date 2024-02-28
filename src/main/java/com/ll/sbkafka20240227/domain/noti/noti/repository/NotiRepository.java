package com.ll.sbkafka20240227.domain.noti.noti.repository;

import com.ll.sbkafka20240227.domain.noti.noti.entity.Noti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotiRepository extends JpaRepository<Noti, Long> {
}