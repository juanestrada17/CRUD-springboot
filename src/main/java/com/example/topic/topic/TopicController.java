package com.example.topic.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    // Creates an instance of the TopicService class and inject it.
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    // Create a class and assign its type to the method, create an array in order to get the JSONs
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    // the curly braces are to tell spring that it's a variable apart. It is available portion
    @RequestMapping("/topics/{id}")
    // with the path variable you can put different ids, and it will show depending on them
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    // POST request functionality

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }

    //PUT request functionality is similar to the add, however you need to add two parameters
    @PutMapping(value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    //DELETE request functionality
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
