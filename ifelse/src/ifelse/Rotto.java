package ifelse;

public class Rotto {

	public static void main(String[] args) {
		int randum =0;
		
		int rotto1 =0;
		int rotto2 =0;
		int rotto3 =0;
		int rotto4 =0;
		int rotto5 =0;
		int rotto6 =0;
		
		int i = 0;
		while(true) {
			i++;
			randum = (int)(Math.random()*45)+1;
			if(rotto1 == 0)
			{rotto1 = randum;
			}else if ((rotto1 != 0) && (rotto1 != randum)){
				if (rotto2 == 0) {rotto2 = randum;
				}else if ((rotto2 != 0) && (rotto2 != randum)) {
						if (rotto3 == 0) {rotto3 = randum;
						}else if ((rotto3 != 0) && (rotto3 != randum)) {
							if (rotto4 == 0) {rotto4 = randum;
						}else if ((rotto4 != 0) && (rotto4 != randum)) {
							if (rotto5 == 0) {rotto5 = randum;
							}else if ((rotto5 != 0) && (rotto5 != randum)) {
								if (rotto6 == 0 ) {rotto6 = randum; break;
								}
							}
						}

					}

				}

			}
		}
		System.out.println("실행 횟수:"+i);
		System.out.println("=================");
		System.out.println("첫번째 로또 번호: "+rotto1);
		System.out.println("두번째 로또 번호: "+rotto2);
		System.out.println("세번째 로또 번호: "+rotto3);
		System.out.println("네번째 로또 번호: "+rotto4);
		System.out.println("다섯번째 로또 번호: "+rotto5);
		System.out.println("여섯번째 로또 번호: "+rotto6);
	}
}
