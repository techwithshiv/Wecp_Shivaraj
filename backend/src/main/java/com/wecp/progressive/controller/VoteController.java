package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Vote;
import com.wecp.progressive.service.VoteService;
import com.wecp.progressive.service.impl.VoteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

 
@RestController
@RequestMapping("/vote")
public class VoteController {
 
    @Autowired
    private VoteServiceImpl voteService;
 
    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        return voteService.getAllVotes();
    }
 
    @PostMapping
    public ResponseEntity<Integer> createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
    }
 
    @GetMapping("/count")
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return voteService.getVotesCountOfAllCategories();
    }
}
