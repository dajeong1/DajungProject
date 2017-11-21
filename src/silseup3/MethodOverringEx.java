package silseup3;

public class MethodOverringEx {
	public static void main(String[] args) {
        //DObjectŬ������ �������� obj ��ü�� �����Ѵ�.
        //LineŬ������ �������� line ��ü�� �����Ѵ�.
		DObject obj = new DObject();
		Line line = new Line();

        //�θ��� DObjectŬ������ ���������� �ڽ��� LineŬ������ 
        //��ü p�� �����Ѵ�.(��ĳ����)
		DObject p = new Line();
		DObject r = line; // ��ĳ����

        //draw()�� �̿��Ͽ� �޼ҵ� �������̵��� Ȯ���� �� �ִ�.
        //obj��ü�� draw()�޼ҵ� ����
		obj.draw();
        //line��ü�� draw()�޼ҵ� ����
		line.draw();
//p��ü�� draw()�޼ҵ� ����
		p.draw();
        //r��ü�� draw()�޼ҵ� ����
		r.draw();

        //�θ��� DObjectŬ������ ���������� �ڽ��� RectŬ������ 
        //��ü rect�� �����Ѵ�.(��ĳ����)
		DObject rect = new Rect();
        //�θ��� DObjectŬ������ ���������� �ڽ��� CircleŬ������ 
        //��ü circle�� �����Ѵ�.(��ĳ����)
		DObject circle = new Circle();

//rect��ü�� draw()�޼ҵ� ����
		rect.draw();
        //circle��ü�� draw()�޼ҵ� ����
		circle.draw();
	}
}
