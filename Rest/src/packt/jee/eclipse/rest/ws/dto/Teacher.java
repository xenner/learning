package packt.jee.eclipse.rest.ws.dto; 
 
import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType; 
import javax.xml.bind.annotation.XmlAttribute; 
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
 
@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD) 
public class Teacher { 
 
  @XmlAttribute 
  private int id; 
 
  @XmlElement(name="teacher_name") 
  private String name;

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}

public Teacher(int id, String name) {
	super();
	this.id = id;
	this.name = name;
} 
  
  //Getters and setters follow 
}