package silseup3;

public class MethodOverringEx {
	public static void main(String[] args) {
        //DObject클래스의 참조변수 obj 객체를 생성한다.
        //Line클래스의 참조변수 line 객체를 생성한다.
		DObject obj = new DObject();
		Line line = new Line();

        //부모인 DObject클래스의 참조변수로 자식인 Line클래스의 
        //객체 p를 생성한다.(업캐스팅)
		DObject p = new Line();
		DObject r = line; // 업캐스팅

        //draw()를 이용하여 메소드 오버라이딩을 확인할 수 있다.
        //obj객체가 draw()메소드 실행
		obj.draw();
        //line객체가 draw()메소드 실행
		line.draw();
//p객체가 draw()메소드 실행
		p.draw();
        //r객체가 draw()메소드 실행
		r.draw();

        //부모인 DObject클래스의 참조변수로 자식인 Rect클래스의 
        //객체 rect를 생성한다.(업캐스팅)
		DObject rect = new Rect();
        //부모인 DObject클래스의 참조변수로 자식인 Circle클래스의 
        //객체 circle를 생성한다.(업캐스팅)
		DObject circle = new Circle();

//rect객체가 draw()메소드 실행
		rect.draw();
        //circle객체가 draw()메소드 실행
		circle.draw();
	}
}
