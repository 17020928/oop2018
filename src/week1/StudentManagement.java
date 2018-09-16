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
		// Mảng s[m-1] chứa tên các group: 2
		for(int z=0;z<m;z++) {
			System.out.println("Nhom "+s[z]+":");
			for(int j=0;j<tong;j++){
				if(students[j].getgroup().equals(s[z]) && !students[j].getId().equals("--") /*&& !students[j].getgroup().equals("")*/) System.out.println(students[j].getInfo());
			}
			//System.out.println(s[z]+" ");
		}
	}
	void removeStudent(String id) {
    	int i=0;
		while(students[i]!=null){
			if(students[i].getId().equals(id)) students[i].setid("--");
			i++;
		}
	}
    public static void main(String[] args) {
		StudentManagement st = new StudentManagement();
		st.students[0]= new Student();
		st.students[1]= new Student("Nghia","17020928","nghiaprto@");
		st.students[2]=new Student("Kha","17020942","tungasd@");
		st.students[2].setgroup(null);
		System.out.println("Xuat lan dau tien:");
		st.studentsByGroup();
	/*	System.out.println("Xuat lan thu hai: ");
		st.removeStudent("000");
		st.studentsByGroup();
*/
    }
}
