package com.example.demo.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Use this as a Business Service
@Service
public class TopicService {
    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Desciption"),
            new Topic("Hibernate", "Hibernate Framework", "Hibernate Desciption"),
            new Topic("Play", "Spring Framework", "Play Desciption"),
            new Topic("JQuery", "JQuery Framework", "JQuery Desciption"),
            new Topic("GRails", "GRails Framework", "GRails Desciption")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
