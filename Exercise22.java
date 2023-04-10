package homework;

public class Exercise22 {

	public static void main(String[] args) {
		
		// 시간=거리/속도
		// 광년이 거리임
		
		double distance = 40e12;
		double speed = 300000;
		double lightyear = 60 * 60 * 24 * 365 * speed;
		double time = distance/lightyear;
	 //	double time = distance/speed/60/60/24/365
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");

	}

}
