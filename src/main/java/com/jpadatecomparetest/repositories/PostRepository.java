package com.jpadatecomparetest.repositories;

import com.jpadatecomparetest.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select p from Post p where p.createdAt > ?1")
    Post findPostsBiggerThan(Date d1);

}