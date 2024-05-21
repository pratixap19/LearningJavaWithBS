package FinalKeyword;

public final class FinalKeywordConcept {
	
	final int i=10;
	
	public final void m1() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		FinalKeywordConcept f = new FinalKeywordConcept();
		//f.i=15;
		System.out.println(f.i);
		f.m1();
		

	}

}
