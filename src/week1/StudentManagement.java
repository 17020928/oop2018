package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
	Student[] students =new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
		if(s1.getgroup()==s2.getgroup()) return true;
        return false; 
    }
	
    void studentsByGroup() {
        // TODO:
		for(int i=0;i<100;i++){
			if(students[i].getname() != "")
			System.out.println(students[i].getInfo());
		}
	}
	void removeStudent(String id) {
        // TODO:
		for(int i=0;i<100;i++){
			if(students[i].getId()==id) students[i].setid("");
	}
	}
    public static void main(String[] args) {
        // TODO:
		StudentManagement st= new StudentManagement();
		/*st.students[0]=new Student("Nghia","17020928","trandainghia@gmail.com");
		st.students[1]=new Student("Nhanh","17020942","nguyenngocnhanh@gmail.com");
		st.students[2]=new Student("Hau","170209234","nguyenthihau@gmail.com");
		st.removeStudent("17020928");
		st.studentsByGroup();
		if(st.sameGroup(st.students[0],st.students[1])) System.out.println("asdasd");
		*/
	}
}
