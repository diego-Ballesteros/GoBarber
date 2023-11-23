package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.ReviewEntity;
import com.gobarber.demo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gobarber/reviews")
public class ReviewController {

    private final ReviewService reviewService;
    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping()
    public ResponseEntity<List<ReviewEntity>> getAll(){
        return ResponseEntity.ok(this.reviewService.getAll());
    }
}
