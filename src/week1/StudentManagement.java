package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
	Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
		if (s1.getgroup().equals(s2.getgroup())) return true;
		return false;
	}
    void studentsByGroup() {
		String[] s = new String[100];
		int i=0,m=0;
		boolean kiemtra=true;
		while(students[i]!=null){
			for(int z=0;z<m;z++ ){
				if(students[i].getgroup().equals(s[z])) {
					kiemtra=false;
					break;
				}
			}
			if(kiemtra) {
				s[m]=students[i].getgroup();
				m++;
			}
			i++;
			kiemtra=true;
		}
		int tong=i;
		// Mảng s[m-1] chứa tên các group:
		for(int z=0;z<m;z++) {
			System.out.println("Nhom "+s[z]+":");
			for(int j=0;j<tong;j++){
				if(students[j].getgroup().equals(s[z]) ) System.out.println(students[j].getInfo());
			}
		}
	}
	void removeStudent(String id) {
    	int i=0;
    	if(id==null) id="";
		while(students[i]!=null){
			i++;
		}
		int max=i;
		int j=0;
		while(j<max){
			if(students[j].getid().equals(id)){
				for(int z=j;z<max;z++){
					students[z]=students[z+1];
				}
				max--;
			}
			else j++;
		}
	}
    public static void main(String[] args) {
		StudentManagement st = new StudentManagement();
		st.students[0]= new Student();
		st.students[1]= new Student("Nghia",null,"nghiaprto@");
		st.students[2]= new Student("Kha","17020942","tungasd@");
		st.students[3]= new Student(st.students[2]);
		st.students[3].setname("Nhanh");
		st.students[2].setgroup(null);
		System.out.println("Xuat lan dau tien:");
		st.studentsByGroup();
		System.out.println("\n"+"Xuat lan thu hai: ");
		st.removeStudent("17020942");
		st.studentsByGroup();
    }
}
