package sec01.exam01;

public class SmartTv extends Television implements Searchable{
	
	@Override
	public void turOn() {
		System.out.println("SamrtTv를 켭니다.");
	}
	
	@Override
	public void turOff() {
		System.out.println("SamrtTv를 끕니다.");
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
		System.out.println("현재 볼륨 : "+ this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
