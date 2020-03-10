package first;

public class Test {
	public static void main(String arg[]) {
		
		String q_paper[] = Databases.Total_Tables();
		for(int i=0;i<q_paper.length;i++) {
			System.out.println(q_paper[i]);
		}
	}

}
