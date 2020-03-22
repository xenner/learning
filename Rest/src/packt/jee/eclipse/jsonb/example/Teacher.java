package packt.jee.eclipse.jsonb.example;

import javax.json.bind.annotation.JsonbProperty;

public class Teacher { 
	@JsonbProperty
	private int id;
	
	@JsonbProperty
	private String name; 

	public Teacher() {} 

	public Teacher (int id, String name) { 
		this.setId(id); 
		this.setName(name); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

} 