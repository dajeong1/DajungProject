//package silseup5;
//
//public class Throws {
//
//	static int a, b;
//	public static void main(String[] args) throws Exception {
//		try{
//			System.out.println("�Ű������� ���� �ΰ��� ��");
//			a = Integer.parseInt(args[0]);
//			b = Integer.parseInt(args[1]);
//			System.out.println("a = " + a + "  b = " + b);
//			System.out.println("===========================");
//			System.out.println("a()�޼ҵ� ȣ�� ��");
//			a();
//			System.out.println("a()�޼ҵ� ȣ�� ��");
//		} catch(Exception e){
//			System.out.println("============================");
//			System.out.println(e + " - ���ܹ߻�");
//		} finally {
//			System.out.println("�޼ҵ� main()�� finally ��� ����.");
//		}
//
//		
//		public static void a() throws Exception {
//			
//			System.out.println("b() �޼ҵ� ȣ�� ��");
//			b();
//			System.out.println("b() �޼ҵ� ȣ�� ��");
//			System.out.println("a()��  finally ��� ����.");
//		}
//		
//		
//		public static void b() throws Exception {
//			
//			System.out.println("c() �޼ҵ� ȣ�� ��");
//			c();
//			System.out.println("c() �޼ҵ� ȣ�� ��");
//			System.out.println("a()��  finally ��� ����.");
//		}
//		
//		
//		
//	}
//
//}
