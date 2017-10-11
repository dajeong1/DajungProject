package silseup2;

public class Box {
	private int width;
	private int height;
	private int depth;
	private String color;
	private String name;
	
	public void setSize(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getDepth(){
		return this.depth;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getVloum(){
		return width*height*depth;
	}
	
	
	public Box(){
		setSize(1, 1, 1);
		setColor("white");
		setName("noname");
	}
	
	public Box(int width, int height, int depth){
		setSize(width, height, depth);
		setColor("white");
		setName("noname");
	}
	
	public Box(int width, int height, int depth, String color){
		setSize(width, height, depth);
		setColor(color);
		setName("noname");
	}
	
	public Box(int width, int height, int depth, String color, String name){
		setSize(width, height, depth);
		setColor(color);
		setName(name);
	}
	
	
	
	public String toString(){
		String result;
		result = "¿Ã∏ß:"+name+"\n"+"size: "+width+"x"+height+"x"+depth+"\n"
				+"color: "+color+"\n"+"Volum: "+getVloum()+"\n";
				
		return result;
	}
	

}
