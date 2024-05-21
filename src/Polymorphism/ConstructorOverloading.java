package Polymorphism;

public class ConstructorOverloading {

	double width,height,depth;
	
	public ConstructorOverloading() {
		width=height=depth=0;
	}

	public ConstructorOverloading(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}

	public ConstructorOverloading(double len) {
		width=height=depth=len;
	}
	
	public double volumn() {
		return(width*height*depth);
	}

	public static void main(String[] args) {
		//ConstructorOverloading obj = new ConstructorOverloading();
		//ConstructorOverloading obj = new ConstructorOverloading(10.5,2.4,14.9);
		ConstructorOverloading obj = new ConstructorOverloading(20.0);
		System.out.println(obj.volumn());
	}

}
