//package silseup5;
//
//public class Throws {
//
//	static int a, b;
//	public static void main(String[] args) throws Exception {
//		try{
//			System.out.println("매개변수로 받은 두개의 값");
//			a = Integer.parseInt(args[0]);
//			b = Integer.parseInt(args[1]);
//			System.out.println("a = " + a + "  b = " + b);
//			System.out.println("===========================");
//			System.out.println("a()메소드 호출 전");
//			a();
//			System.out.println("a()메소드 호출 전");
//		} catch(Exception e){
//			System.out.println("============================");
//			System.out.println(e + " - 예외발생");
//		} finally {
//			System.out.println("메소드 main()의 finally 블록 수행.");
//		}
//
//		
//		public static void a() throws Exception {
//			
//			System.out.println("b() 메소드 호출 전");
//			b();
//			System.out.println("b() 메소드 호출 후");
//			System.out.println("a()의  finally 블록 수행.");
//		}
//		
//		
//		public static void b() throws Exception {
//			
//			System.out.println("c() 메소드 호출 전");
//			c();
//			System.out.println("c() 메소드 호출 후");
//			System.out.println("a()의  finally 블록 수행.");
//		}
//		
//		
//		
//	}
//
//}
