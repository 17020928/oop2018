package week1;

public class Student {

    private String name,id,group,email;
    // TODO: khai báo các phương thức getter, setter cho Student
	// Tên
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;	
	}
	//Id
	public void setid(String id){
		this.id = id;
	}
	public String getId(){
		return id;	
	}
	//Group
	public void setgroup(String group){
		this.group = group;
	}
	public String getgroup(){
		if(group==null) return "";
		return group;	
	}
	//email
	public void setemail(String email){
		this.email = email;
	}
	public String getemail() { return name; }
    Student() {
		// TODO:
		name = "Student";
		id = "000";
		group = "INT22405";
		email = "uet@vnu.edu.vn";
	}
    Student(String n, String sid, String em) {
        // TODO:
		name=n;
		id=sid;
		email=em;
		group="INT22401";
    }
    Student(Student s) {
        // TODO:
		name=s.name;
		id=s.id;
		group=s.group;
		email=s.email;
    }
	public String getInfo(){
		return(name+"\t"+id+"\t"+group+"\t"+email);
	}
}
