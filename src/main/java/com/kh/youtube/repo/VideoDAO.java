package com.kh.youtube.repo;

import com.kh.youtube.domain.Subscribe;
import com.kh.youtube.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoDAO extends JpaRepository<Video, Integer> {
}
