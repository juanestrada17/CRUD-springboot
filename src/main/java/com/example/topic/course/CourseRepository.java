package com.example.topic.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// The CrudRepository has all the common methods, and you have to extend the ones already in it
// The crud repository takes a Topic(which is the type) and the Id type which is String
public interface CourseRepository extends CrudRepository<Course, String> {
    // The Id is necessary, so it finds its id and not the object/class
    public List<Course> findByTopicId(String topicId);

}

// EXAMPLES of implementing more repository methods
// public List<Course> findByName(String name);
// public List<Course> findByDescription(String foo);


// Standard CRUD operations
// getAllTopics()
// getTopic(String id)
// updateTopic(Topic t)
// deleteTopic(String id)
