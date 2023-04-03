package sec01.exam01;

public abstract class Television implements RemoteControl {

	protected int volume;

	@Override
	public void turOn() {
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turOff() {
		System.out.println("텔레비전을 끕니다.");

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	// 인터페이스 에서 정의한 3개의 추상메서드를 모두 구현해야하는데
	// 2개만 구현 경우 -----> 추상 클래스가 된다.
//	@Override
//	public void setVolume(int volume) {
//		if(volume> MAX_VOLUME) {
//			this.volume =MAX_VOLUME;
//		}else if(volume < MIN_VOLUME) {
//			this.volume = MIN_VOLUME;
//		}else {
//			this.volume = volume;
//		}
//		System.out.println("현재 볼륨 : "+ this.volume);
//	}

}
