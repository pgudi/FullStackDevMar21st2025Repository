package com.gentech.relationship;

import com.gentech.relationship.entity.Comments;
import com.gentech.relationship.entity.VideoPost;
import com.gentech.relationship.repository.CommentsRepository;
import com.gentech.relationship.repository.VideoPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}

	@Autowired
	private VideoPostRepository videoPostRepository;

	@Autowired
	private CommentsRepository commentsRepository;


	@Override
	public void run(String... args) throws Exception {
		VideoPost post=new VideoPost();
		post.setVideoType("Education");
		post.setVideoDescription("It is for Spring Security Tutorial");

		Comments comment1=new Comments();
		comment1.setCommentType("positive");
		comment1.setCommentDescription("This video provides complete Spring Security Concepts properly");

		Comments comment2=new Comments();
		comment2.setCommentType("average");
		comment2.setCommentDescription("This video has not included JWT Token more eloborately");

		Comments comment3=new Comments();
		comment3.setCommentType("negative");
		comment3.setCommentDescription("This video has not had good clarify and visiability");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		videoPostRepository.save(post);

	}
}
