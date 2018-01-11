package A;

public class concatTest {
	public static String concatwithString() {
		String t = "prem";
		for (int i = 0; i < 10000; i++)
			
		{

			t = t.concat("kumar");
		}

		return t;
	}

	public static String concatwithStringBuffer() {
		StringBuffer sb = new StringBuffer("prem");
		for (int i = 0; i <10000; i++)
			
		{
			sb.append("kumar");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatwithString();
		System.out.println("Time taken by Concating with String:" + (System.currentTimeMillis() - startTime) + "sec");
		startTime = System.currentTimeMillis();
		concatwithStringBuffer();
		System.out.println(
				"Time taken by Concating with StringBuffer:" + (System.currentTimeMillis() - startTime) + "sec");

	}
}
