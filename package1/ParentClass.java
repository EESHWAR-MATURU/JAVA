package package1;
public class ParentClass {
   int a=10,b=20;
	public void sum() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.sum();
	}
}
