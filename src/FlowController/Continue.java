package FlowController;

public class Continue {

	public static void main(String[] args) {
		for(int x=20; x>1; x--) {
			if(x%2==0) {
				continue;
			}
			System.out.println(x);
		}
	}
}
