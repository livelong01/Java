package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime  moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post () {
		
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	/*
	 * / so podemos add e remover comentarios com o addcomment 
	 * e removecomment, entao precisa tirar o getsetters 
	 * de modificar comment e add na forma tradicional de lista.
	 */
	
	
	public void addComment (Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment (Comment comment) {
		comments.remove(comment);
	}
	
	
	// USAR CLASSE STRINGBUILDER QUANDO QUER FAZER UMA STRING MAIS ELABORADA"
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		// como podem ter muitos comentarios, usa o for each, PARA MOSTRAR TODOS ELES.
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); // converte o stringbuilder em String
		
	}



}
