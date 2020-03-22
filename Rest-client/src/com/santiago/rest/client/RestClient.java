package com.santiago.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {
	 public static void main(String[] args) {
	        Client client = ClientBuilder.newClient();
//	        requestCourseById(client, "10");
	        testAddCourseJSON(client);
	        client.close();
	    }
	 
	 private static void requestCourseById(Client client, String courseId) {
	        WebTarget target = client.target("http://localhost:9080/REST/services/course/get/" + courseId);
	        String s = target.request(MediaType.APPLICATION_JSON).get(String.class);
	        System.out.println("response : " + s);
	    }

	//Test addCourse method (JSON version) of CourseService 
	  public static void testAddCourseJSON(Client client) { 
	 
	    //Get WebTarget for a URL 
	    WebTarget webTarget = 
	 client.target("http://localhost:9080/REST/services/course/add"); 
	 
	    //Create JSON representation of Course, 
	    //with course_name and credits fields. Instead of creating 
	    //JSON manually, you could also use JAXB to create JSON from 
	    //Java object. 
	    String courseJSON = "{\"name\":\"Curso Loco\", \n" + 
	    		"     \"credits\":7}"; 
	 
	    //Execute HTTP post method 
	    Response response = webTarget.request(). 
	        post(Entity.entity(courseJSON, 
	         MediaType.APPLICATION_JSON_TYPE)); 
	 
	    //Check response code. 200 is OK 
	    if (response.getStatus() != 200) { 
	      //Print error message 
	      System.out.println("Error invoking REST Web Service - " + 
	       response.getStatusInfo().getReasonPhrase() + 
	          ", Error Code : " + response.getStatus()); 
	      //Also dump content of response message 
	      System.out.println(response.readEntity(String.class)); 
	      return; 
	    } 
	 
	    //REST call was successful. Print the response 
	    System.out.println(response.readEntity(String.class)); 
	  }

}
