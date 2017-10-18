package Java.Seventh;

class Stack {
	private int top;
	private int[] stk;
	private int size;

	Stack() {
		size = 10;
		stk = new int[10];
		top = -1;
	}

	Stack(int k) {
		size = k;
		stk = new int[k];
		top = -1;
	}
	
	void push (int data) {
		if(top == size - 1)
			System.out.println("Stack full");
		else
			stk[++top] = data;
	}

	int pop(){
		if(top < 0){
			System.out.println("Stack empty");
			return -1;
		}
		else
			return stk[top--];
	}
	
	int getSize(){
		return size;
	}
			
}

