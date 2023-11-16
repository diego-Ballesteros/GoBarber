package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.ReviewEntity;
import com.gobarber.demo.persistence.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<ReviewEntity> getAll(){
        return this.reviewRepository.findAll();
    }
}
