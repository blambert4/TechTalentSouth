package com.tts.twitter.repository;

import java.util.List;

import com.tts.twitter.model.User;
import com.tts.twitter.model.Tweet;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long>{
    List<Tweet> findAllByOrderByCreatedAtDesc();
    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);
}
