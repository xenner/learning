package packt.jee.eclipse.rest.ws.services; 
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
 
import packt.jee.eclipse.rest.ws.dto.Course; 
import packt.jee.eclipse.rest.ws.dto.Teacher; 
 
@Path("/course") 
public class CourseService { 
 
	@GET 
	  @Produces (MediaType.APPLICATION_JSON) 
	  @Path("get/{courseId}") 
	  public Course getCourseJSON (@PathParam("courseId") int id) { 
	 
	    return createDummyCourse(id); 
	 
	  } 
	 
	  @GET 
	  @Produces (MediaType.APPLICATION_XML) 
	  @Path("get/{courseId}") 
	  public Course getCourseXML (@PathParam("courseId") int id) { 
	 
	    return createDummyCourse(id); 
	 
	  }
	  
	  @PUT 
	  @Consumes (MediaType.APPLICATION_JSON) 
	  @Produces (MediaType.APPLICATION_JSON) 
	  @Path("update") 
	  public Course updateCourseJSON (Course course) {
		  course.setName(course.getName() + "-PUT");
		        return course; 
		  
	  }
	  
	  @PUT 
	  @Consumes (MediaType.APPLICATION_XML) 
	  @Produces (MediaType.APPLICATION_XML) 
	  @Path("update") 
	  public Course updateCourseXML (Course course) {
		  course.setName(course.getName() + "-PUT");
		        return course; 
		  
	  }
	  
	  @POST 
	  @Consumes (MediaType.APPLICATION_JSON) 
	  @Produces (MediaType.APPLICATION_JSON) 
	  @Path("add") 
	  public Course addCourse (Course course) { 
	 
	    int courseId = dummyAddCourse(course.getName(), 
	     course.getCredits()); 
	 
	    course.setId(courseId); 
	 
	    return course; 
	  } 

	  private Course createDummyCourse (int id) { 
		    //To keep the example simple, we will return 
		    //hardcoded value here. However, you could get 
		    //data from database using, for example, JDO or JDBC 
		 
		    return new Course(id,"Course-" + id, 5, new Teacher(2, 
		     "Teacher1")); 
		  }

	 
	  private int dummyAddCourse (String courseName, int credits) { 
	 
	    //To keep the example simple, we will just print 
	    //parameters we received in this method to console and not 
	    //actually save data to database. 
	    System.out.println("Adding course " + courseName + ", credits = " + credits); 
	 
	    //TODO: Add course to database table 
	 
	    //return hard-coded id 
	    return 10; 
	  } 
}