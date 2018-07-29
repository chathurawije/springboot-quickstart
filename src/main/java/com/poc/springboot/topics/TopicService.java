package com.poc.springboot.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new
	 * Topic("TopicId1", "TopicName1", "TopicDescription1"), new Topic("TopicId2",
	 * "TopicName2", "TopicDescription2"), new Topic("TopicId3", "TopicName3",
	 * "TopicDescription3")));
	 */

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		// Iterable<Topic> topici=topicRepository.findAll();
		// for (Topic topic : topici) {
		// topics.add(topic);
		// }
		return topics;
		// return (List<Topic>) topicRepository.findAll();

	}

	public Topic getTopic(String id) {

		return topicRepository.findOne(id);

		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		// topics.add(topic);

	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
		// for (int i = 0; i < topics.size(); i++) {
		// Topic t = topics.get(i);
		// if (t.getId().equals(id)) {
		// topics.set(i, topic);
		// return;
		// }
		// }

	}

	public void deleteTopic(String id) {

		topicRepository.delete(id);

		// topics.removeIf(t -> t.getId().equals(id));

	}

}
