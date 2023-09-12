package com.kh.youtube.service;

import com.kh.youtube.domain.CommentLike;
import com.kh.youtube.domain.Subscribe;
import com.kh.youtube.repo.CommentLikeDAO;
import com.kh.youtube.repo.SubscribeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribeService {

    @Autowired
    private SubscribeDAO dao;

    public List<Subscribe> showAll(){
        return dao.findAll();
    }
    public Subscribe show(int code){
        return dao.findById(code).orElse(null);
    }
    public Subscribe create(Subscribe subscribe){
        return dao.save(subscribe);
    }

    public Subscribe update(Subscribe subscribe) {
        return dao.save(subscribe);

    }
    public Subscribe delete(int code){
        Subscribe data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }

}
