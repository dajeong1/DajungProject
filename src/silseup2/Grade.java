package silseup2;

class Student{
	private String name;
	private int kor;
	private int mat;
	private int eng;

	public Student() {
		name = null;
		kor = 0;
		mat = 0;
		eng = 0;
	}

	public Student(String name, int kor, int mat, int eng){
       this.name = name;
       this.kor = kor;
       this.mat = mat;
       this.eng = eng;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    public int getKor(){
    	return kor;
    }

    public void setKor(int kor){
    	this.kor = kor;
    }


    public int getMat(){
    	return mat;
    }

    public void setMat(int mat){
    	this.mat = mat;
    }


    public int getEng(){
    	return eng;
    }

    public void setEng(int eng){
    	this.eng = eng;
    }


	public String toString() {
		return name + "�� ������ " + getTotal() + " �̸�, ����� " + getAvg() + "�̰� ������ " + getGrade() + "�Դϴ�";
	}


	public int getTotal(){
    	return kor + mat + eng;
    }


	public double getAvg(){
    	return getTotal() / 3.0;
    }
	

	public char getGrade() {
		switch ((int) getAvg() / 10) { 
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
}

public class Grade {

	public static void main(String[] args) {
		
        Student st = new Student();
        st.setName("ȫ�浿");
        st.setKor(75);
        st.setMat(88);
        st.setEng(95);    
		System.out.println(st.toString());

        Student ss = new Student("�ε鷹", 90, 75, 88);
		System.out.println("�̸� : " + ss.getName());
		System.out.println("���� : " + ss.getKor());
		System.out.println("���� : " + ss.getMat());
		System.out.println("���� : " + ss.getEng());
		System.out.println("���� : " + ss.getTotal());
		System.out.printf("��� : %.2f\n", ss.getAvg());
		System.out.println("���� : " + ss.getGrade());
		
	}

}
