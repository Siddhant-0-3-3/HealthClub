package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment 
{
@Id
@GeneratedValue
private Integer scheduleId;
private String trainerName;
private String workoutName;
private int duration;

@Override
public String toString() {
	return "Appointment [scheduleId=" + scheduleId + ", trainerName=" + trainerName + ", workoutName=" + workoutName
			+ ", duration=" + duration + "]";
}

public Integer getScheduleId() {
	return scheduleId;
}

public void setScheduleId(Integer scheduleId) {
	this.scheduleId = scheduleId;
}

public String getTrainerName() {
	return trainerName;
}

public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}

public String getWorkoutName() {
	return workoutName;
}

public void setWorkoutName(String workoutName) {
	this.workoutName = workoutName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public Appointment(Integer scheduleId, String trainerName, String workoutName, int duration) {
	super();
	this.scheduleId = scheduleId;
	this.trainerName = trainerName;
	this.workoutName = workoutName;
	this.duration = duration;
}

public Appointment() {
	super();
}

}
