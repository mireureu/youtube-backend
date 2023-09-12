package com.kh.youtube.service;

import com.kh.youtube.domain.Category;
import com.kh.youtube.domain.CommentLike;
import com.kh.youtube.repo.CommentLikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentLikeService {

    @Autowired
    private CommentLikeDAO dao;

    public List<CommentLike> showAll(){
        return dao.findAll();
    }
    public CommentLike show(int code){
        return dao.findById(code).orElse(null);
    }
    public CommentLike create(CommentLike commentLike){
        return dao.save(commentLike);
    }

    public CommentLike update(CommentLike commentLike) {
        return dao.save(commentLike);

    }
    public CommentLike delete(int code){
        CommentLike data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }

}
