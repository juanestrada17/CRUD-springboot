package com.example.topic.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    // Gets an instance of the interface into the service
    @Autowired
    private CourseRepository courseRepository;

    // ADDS the string id to get its id, GET ALL

    public List<Course> getAllCourses(String topicId){
        //Creates a list, loops through all the items and add them to the arraylist
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        // Find it by ID or return a new Topic() class
        return courseRepository.findById(id).orElse(new Course());
    }

    public void addCourse(Course course) {
        // using topic repository
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        // It already knows there's an element with the id in the table so it just updates it
        courseRepository.save(course);
    }

    // DELETES if it's found in the topics
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}



