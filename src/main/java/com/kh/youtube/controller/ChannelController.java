package com.kh.youtube.controller;

import com.kh.youtube.domain.Channel;
import com.kh.youtube.service.ChannelService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/*")
public class ChannelController {

    @Autowired
    private ChannelService service;


    @GetMapping("/channel")
    public ResponseEntity<List<Channel>> showAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.showAll());
    }


    // SELECT * FROM channel WHERE id=?
    @GetMapping("/channel/{id}")
    public ResponseEntity<Channel> show(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.show(id));
    }



    @PostMapping("/channel")
    public ResponseEntity<Channel> create(@PathVariable Channel channel) {
        return ResponseEntity.status(HttpStatus.OK).body(service.create(channel));
    }

    @PutMapping("/channel")
    public ResponseEntity<Channel> update(@PathVariable Channel channel) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(channel));
    }

    @DeleteMapping("/channel/{id}")
    public ResponseEntity<Channel> delete(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }


}