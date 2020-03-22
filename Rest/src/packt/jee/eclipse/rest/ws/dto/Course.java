package packt.jee.eclipse.rest.ws.dto; 
 
import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType; 
import javax.xml.bind.annotation.XmlAttribute; 
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty; 
 
@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD) 
public class Course { 
 
  @XmlAttribute 
  private int id; 
 
  @XmlElement(name="course_name")
  private String name; 
 
  private int credits; 
 
  private Teacher teacher;

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getCredits() {
	return credits;
}

public Teacher getTeacher() {
	return teacher;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setCredits(int credits) {
	this.credits = credits;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

public Course() {
	super();
	// TODO Auto-generated constructor stub
}

public Course(int id, String name, int credits, Teacher teacher) {
	super();
	this.id = id;
	this.name = name;
	this.credits = credits;
	this.teacher = teacher;
} 
 
 
  //Getters and setters follow 
}