package gettet.setter;

public class SinfgetonMain {

	public static void main(String[] args) {
		
		SinglettonEx ex = SinglettonEx.getInstance();
		SinglettonEx ex1 = SinglettonEx.getInstance();
		SinglettonEx ex2 = SinglettonEx.getInstance();
		SinglettonEx ex3 = SinglettonEx.getInstance();
		SinglettonEx ex4 = SinglettonEx.getInstance();
		SinglettonEx ex5 = SinglettonEx.getInstance();
		
		//같은 주소를 갖고 있는지 확인
		if(ex == ex1) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
			
		}
	}

}
