package homework;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	//default 값이 public
	public Time() {
	}
	public Time(int hour, int minute, int second) {
		//똑같음
	}
	
	//int 0, boolean flse, string null로 틀 잡기
	//fotmat은 문자열을 반환
	public String toSting() {
		return String.format ("%02d:%02d:%02d", hour, minute, second);
	}
}
