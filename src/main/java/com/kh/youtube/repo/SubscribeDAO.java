package com.kh.youtube.repo;


import com.kh.youtube.domain.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscribeDAO extends JpaRepository<Subscribe, Integer> {
}
