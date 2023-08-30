package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedbacks") // Specify the MongoDB collection name
public class Feedback {

    @Id
    private String id;
    private Integer userId;
    private String userName;
    private String feedback;
    @Override
    public String toString() {
        return "Feedback [id=" + id + ", userId=" + userId + ", userName=" + userName + ", feedback=" + feedback + "]";
    }


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public Integer getUserId() {
	return userId;
}


public void setUserId(Integer userId) {
	this.userId = userId;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getFeedback() {
	return feedback;
}


public void setFeedback(String feedback) {
	this.feedback = feedback;
}


public Feedback(String id, Integer userId, String userName, String feedback) {
	super();
	this.id = id;
	this.userId = userId;
	this.userName = userName;
	this.feedback = feedback;
}
public Feedback() {
	super();
}

}