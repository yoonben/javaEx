package arratEx;

public class ArryEx9 {
	private void maun() {
		String[] names = new String[3];
		names[0] = new String( "java");
		names[1] = new String ("java");
		names[2] = "C#";
		
		if(names[0].equals(names[1])) {
			System.out.println("0번방 == 1번방  ");
		}else {
			System.out.println("0번방 != 1번방  ");
		}
	}
}
