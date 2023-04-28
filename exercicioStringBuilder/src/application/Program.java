package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				LocalDateTime.parse("21/06/2018 13:05:44", sdf), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful contry!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post(
				LocalDateTime.parse("28/07/2018 23:14:19", sdf), 
				"Good night guys!",
				"See you tomorrow", 
				12);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
