package Java.ninth;

class Student {
	int noOfTest = 3;
	String name;
	int[] score;
	String grade;
	
	Student(){
		score = new int[3];
		grade = "";
	}
	
	Student(String name){
		this();
		this.name = name;
	}
	
	String getGrade(){
		return this.grade;
	}
	
	String getName(){
		return this.name;
	}
	
	int getScore(int i){
		return this.score[i-1];
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setScore(int i, int score){
		this.score[i-1] = score;
	}
}

class GraduateStudent extends Student {
	void computeGrade(){
		if((score[0]+score[1]+score[2])/noOfTest >= 80)
			this.grade = "Pass";
		else
			this.grade = "Fail";
	}
}

class UndergraduateStudent extends Student {
	void computeGrade(){
		if((score[0]+score[1]+score[2])/noOfTest >= 70)
			this.grade = "Pass";
		else
			this.grade = "Fail";
	}
}

public class ComputeGrade{//�����̸� ��ġ��
	public static void main(String[] args){
		
		Student[] student = new Student[10];
		
		
		GraduateStudent a1 = new GraduateStudent();
		a1.setName("��"); a1.setScore(1,62); a1.setScore(2,58); a1.setScore(3,79);
		student[0] = a1;
		
		UndergraduateStudent a2 = new UndergraduateStudent();
		a2.setName("��"); a2.setScore(1,65); a2.setScore(2,58); a2.setScore(3,74);
		student[1] = a2;
		
		UndergraduateStudent a3 = new UndergraduateStudent();
		a3.setName("��"); a3.setScore(1,85); a3.setScore(2,89); a3.setScore(3,76);
		student[2] = a3;
		
		GraduateStudent a4 = new GraduateStudent();
		a4.setName("��"); a4.setScore(1,86); a4.setScore(2,70); a4.setScore(3,80);
		student[3] = a4;
		
		UndergraduateStudent a5 = new UndergraduateStudent();
		a5.setName("��"); a5.setScore(1,86); a5.setScore(2,71); a5.setScore(3,98);
		student[4] = a5;
		
		GraduateStudent a6 = new GraduateStudent();
		a6.setName("��"); a6.setScore(1,60); a6.setScore(2,70); a6.setScore(3,78);
		student[5] = a6;
		
		GraduateStudent a7 = new GraduateStudent();
		a7.setName("ĥ"); a7.setScore(1,84); a7.setScore(2,71); a7.setScore(3,86);
		student[6] = a7;
		
		UndergraduateStudent a8 = new UndergraduateStudent();
		a8.setName("��"); a8.setScore(1,85); a8.setScore(2,74); a8.setScore(3,66);
		student[7] = a8;
		
		GraduateStudent a9 = new GraduateStudent();
		a9.setName("��"); a9.setScore(1,77); a9.setScore(2,90); a9.setScore(3,88);
		student[8] = a9;
		
		UndergraduateStudent a10 = new UndergraduateStudent();
		a10.setName("��"); a10.setScore(1,67); a10.setScore(2,52); a10.setScore(3,71);
		student[9] = a10;
		
		
		UndergraduateStudent u;
		GraduateStudent g;
		
		
		System.out.println("�кλ� ���");
		for(int i=0; i<10; i++){
			if(student[i] instanceof UndergraduateStudent){
				u = (UndergraduateStudent)student[i];
				u.computeGrade();
				System.out.println("�̸� :"+u.name+"   3���� ���� :"+u.score[0]+","+u.score[1]+","+u.score[2]+
						            "  ���� :"+u.grade);
			}
		}
		
		System.out.println("\n���п��� ���");
		for(int i=0; i<10; i++){
			if(student[i] instanceof GraduateStudent){
				g = (GraduateStudent)student[i];
				g.computeGrade();
				System.out.println("�̸� :"+g.name+"   3���� ���� :"+g.score[0]+","+g.score[1]+","+g.score[2]+
						            "  ���� :"+g.grade);
			}
		}	
	}	
}