package com.kh.youtube.service;

import com.kh.youtube.domain.Subscribe;
import com.kh.youtube.domain.Video;
import com.kh.youtube.repo.SubscribeDAO;
import com.kh.youtube.repo.VideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoDAO dao;

    public List<Video> showAll(){
        return dao.findAll();
    }
    public Video show(int code){
        return dao.findById(code).orElse(null);
    }
    public Video create(Video video){
        return dao.save(video);
    }

    public Video update(Video video) {
        return dao.save(video);

    }
    public Video delete(int code){
        Video data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }

}
