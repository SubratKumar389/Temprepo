package PojoSerializationandDeserialization;

public class EmployeeDetails {
	String name;
	String id;
	String email;
	int[] phnos;
	
public EmployeeDetails(String name,String id,String email,int[] phnos) {
	this.name=name;
	this.id=id;
	this.email=email;
	this.phnos=phnos;
}




public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int[] getPhnos() {
	return phnos;
}

public void setPhnos(int[] phnos) {
	this.phnos = phnos;
}



}
