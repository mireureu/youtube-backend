package com.kh.youtube.service;

import com.kh.youtube.domain.Video;
import com.kh.youtube.domain.VideoComment;
import com.kh.youtube.repo.VideoCommentDAO;
import com.kh.youtube.repo.VideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoCommentService {

    @Autowired
    private VideoCommentDAO dao;

    public List<VideoComment> showAll(){
        return dao.findAll();
    }
    public VideoComment show(int code){
        return dao.findById(code).orElse(null);
    }
    public VideoComment create(VideoComment videocomment){
        return dao.save(videocomment);
    }

    public VideoComment update(VideoComment videocomment) {
        return dao.save(videocomment);

    }
    public VideoComment delete(int code){
        VideoComment data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }

}
