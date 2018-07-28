package com.poc.springboot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	
	@RequestMapping("/topics")
	public List<Topic> returnTopics() {
		return Arrays.asList(
				new Topic("TopicId1","TopicName1","TopicDescription1"),
				new Topic("TopicId2","TopicName2","TopicDescription2"),
				new Topic("TopicId3","TopicName3","TopicDescription3")

				);
	}
}
