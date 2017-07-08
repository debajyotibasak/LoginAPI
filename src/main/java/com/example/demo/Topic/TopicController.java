package com.example.demo.Topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

        @RequestMapping("/topics")
        public List<Topic> getAllTopics(){
            return Arrays.asList(
                    new Topic("Spring", "Spring Framework", "Spring Desciption"),
                    new Topic("Hibernate", "Hibernate Framework", "Hibernate Desciption"),
                    new Topic("Play", "Spring Framework", "Play Desciption"),
                    new Topic("JQuery", "JQuery Framework", "JQuery Desciption"),
                    new Topic("GRails", "GRails Framework", "GRails Desciption")
            );
        }
}
