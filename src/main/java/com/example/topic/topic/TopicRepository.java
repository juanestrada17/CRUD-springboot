package com.example.topic.topic;

import org.springframework.data.repository.CrudRepository;

// The CrudRepository has all the common methods, and you have to extend the ones already in it
// The crud repository takes a Topic(which is the type) and the Id type which is String
public interface TopicRepository extends CrudRepository<Topic, String> {



    // Standard CRUD operations
    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}
