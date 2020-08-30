package com.janowik.carbanapi.controller;

import com.janowik.carbanapi.model.Comment;
import com.janowik.carbanapi.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TestController {

    private final CommentService commentService;

    @GetMapping
    public String testMethod(){
        return "Test from method SWAGGER UI";
    }
/*    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentService.getComments();
    }*/
}
