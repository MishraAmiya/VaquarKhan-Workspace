package school.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class School {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public void getTotalStudentCount(){
	
}
public void getTotalStudentCount(int _class){
	
}
public void getTotalStudentCount(String gender){
	
}
public void getTotalStudentCount(int _class,String gender){
	
}

public void getTotalTeacherCount(){
	
}
public void getTotalTeacherCountServingClass(int _class){
	
}
	
}
