package ObjectAndClass;

public class Pen {
	
	int length=5;
	int width=2;
	
	public void write() {
		System.out.println("we can write with pen");
	}
	
	public static void main(String[] args) {
		Pen obj=new Pen();
		System.out.println(obj.length);
		obj.write();
	}
}
