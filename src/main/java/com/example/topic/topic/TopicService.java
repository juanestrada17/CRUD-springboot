package com.example.topic.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    // Gets an instance of the interface into the service
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        //Creates a list, loops through all the items and add them to the arraylist
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        // Find it by ID or return a new Topic() class
        return topicRepository.findById(id).orElse(new Topic());
    }

    public void addTopic(Topic topic) {
        // using topic repository
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        // It already knows there's an element with the id in the table so it just updates it
        topicRepository.save(topic);
    }

    // DELETES if it's found in the topics
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}



