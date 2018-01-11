package A;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("prem");
		System.out.println(sb.capacity());
		sb.append("skjhascckjascnaosichnasc");
		System.out.println(sb.capacity());
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
		sb.ensureCapacity(55);
		System.out.println(sb.capacity());
	
	
	}
	
	

}
