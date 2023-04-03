package sec01.exam01;

// 여러개의 인터페이스를 구현 할 수 있다.
// 인터페이스들에 선언된 추상 메서드를 모두 구현해야 한다
// 미구현 메서드가 남아 있다면 추상클래스가 된다,
public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume> MAX_VOLUME) {
			this.volume =MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ this.volume);
	}
	
}
