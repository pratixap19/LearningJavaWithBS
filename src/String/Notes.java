package String;

public class Notes {
	/* What is String?
	 * It is a sequence of characters written in double quotes.
	 * It is a non primitive data type.
	 * It is a final class.
	 * Whenever you declare any String an object gets created.
	 * 
	 * There are two ways to create String
	 * 1. using literals  String s="Welcome"; //SCP
	 * using new keyword  String s = new String("Welcome"); //Heap
	 * 
	 * Important points about String
	 * 1. it is immutable in nature-once String object is created it can't be changed.If you try to alter a String
	 * a new String object is created.
	 * 
	 * 2. String Constant Pool
	 * In Java, the String Constant Pool is a special area of memory where the JVM (Java Virtual Machine) 
	 * stores literal strings. When you create a string literal in your Java code, such as "hello", "world", etc., 
	 * the JVM checks if that string already exists in the String Constant Pool. 
	 * If it does, it simply returns a reference to the existing string. 
	 * If not, it creates a new string object and adds it to the pool.
	 * This mechanism helps in conserving memory. It avoids creating duplicate string objects.
	 * 
	 * Java maintains a special area in the heap memory called String Constant Pool, 
	 * where it stores String using literal, when a new String is created, JVM checks in the SCP first. If an
	 * identical String is found then new variable points to the existing String instead creating a new String.
	 * 
	 * Multi threading vs non multi threading
	 * 
	 * What is multithreading?
	 * Multithreading in Java allows your program to execute multiple tasks simultaneously, 
	 * making it more efficient and responsive by leveraging the capabilities of modern CPUs.
	 * 
	 * Imagine you have a busy kitchen with multiple chefs. Each chef can work on a different task, 
	 * like chopping vegetables or grilling meat, at the same time. 
	 * Multithreading in Java is like having multiple chefs (threads) working together in a program. 
	 * Each thread can perform a different task simultaneously, helping the program run faster and more efficiently,
	 * just like the kitchen runs smoothly with multiple chefs handling different tasks at once.
	 * 
	 * MT is faster compare to NMT.
	 * In MT it is not guaranteed that data synchronization happens where as in NMT it is guaranteed that data
	 * synchronization is happens.
	 * For data reading purpose we will go for MT.
	 * For data updating purpose we will for NMT.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
