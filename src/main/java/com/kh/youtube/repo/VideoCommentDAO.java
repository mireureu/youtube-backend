package com.kh.youtube.repo;

import com.kh.youtube.domain.Video;
import com.kh.youtube.domain.VideoComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoCommentDAO extends JpaRepository<VideoComment, Integer> {
}
