package serialization;

public class Employee {
	String empName;
	int empId;
	boolean mStatus;
	int[] phNos;

public Employee(String empName,int empId,boolean mStatus,int[] phNos) {	
	this.empName=empName;
	this.empId=empId;
	this.mStatus=mStatus;
	this.phNos=phNos;
}
public Employee(){
	 
 }

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public boolean ismStatus() {
	return mStatus;
}

public void setmStatus(boolean mStatus) {
	this.mStatus = mStatus;
}

public int[] getPhNos() {
	return phNos;
}

public void setPhNos(int[] phNos) {
	this.phNos = phNos;
}


}
