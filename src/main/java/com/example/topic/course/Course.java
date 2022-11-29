package com.example.topic.course;

import com.example.topic.topic.Topic;

import javax.persistence.*;



@Entity
@Table
public class Course {

    @Id
    private String id;
    private String name;
    private String Description;

    // Use the topic in the courses class and joins courses and topics
    // Many courses, 1 topic from JPA
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course(){

    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.Description = description;
        // Create a new topic in the constructor with the topic id and empty other values
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
