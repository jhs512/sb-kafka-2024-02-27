package com.ll.sbkafka20240227.domain.post.author.repository;


import com.ll.sbkafka20240227.domain.post.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
