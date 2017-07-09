package com.example.demo.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Use this as a Business Service
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Desciption"),
            new Topic("Hibernate", "Hibernate Framework", "Hibernate Desciption"),
            new Topic("Play", "Spring Framework", "Play Desciption"),
            new Topic("JQuery", "JQuery Framework", "JQuery Desciption"),
            new Topic("GRails", "GRails Framework", "GRails Desciption")
    ));*/

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        /*return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();*/
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
         /* for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }*/
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        /*topics.removeIf(t -> t.getId().equals(id));*/
        topicRepository.delete(id);
    }
}
