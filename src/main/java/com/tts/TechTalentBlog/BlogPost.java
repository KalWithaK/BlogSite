package com.tts.TechTalentBlog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	public Long id;
	private String title;
	private String author;
	private String blogEntry;
	
public BlogPost() {
}

public BlogPost(String title, String author, String blogEntry) {
	this.title = title;
	this.author = author;
	this.blogEntry = blogEntry;
}

public void setId(Long id) {
	this.id = id;
}
public Long getId() {
	return id;
}

public void setTitle(String title) {
	this.title = title;
}
public String getTitle() {
	return title;
}

public void setAuthor(String author) {
	this.author = author;
}
public String getAuthor() {
	return author;
}

public void setBlogEntry(String blogEntry) {
	this.blogEntry = blogEntry;
}
public String getBlogEntry() {
	return blogEntry;
}

@Override
public String toString() {
	return "BlogPost [id= " + id + ", title= " + title + ", author= " + author + ", Blog Entry= " + blogEntry + "]";
	
}



}
