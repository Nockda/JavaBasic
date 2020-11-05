import java.time.Duration;
import java.time.LocalTime;

public class A5_LocalTimeDemo2 {

	public static void main(String[] args) {
		//PC 방의 PC이용 시작 시간
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("시작시간" + start);
		
		// PC방의 종료시간
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC 이용 종료시간 " + end);
		
		//PC 이용시간
		Duration between = Duration.between(start, end);
		System.out.println("PC 총 이용시간 " + between);
		System.out.println("PC 총 이용시간 " + between.toHours()
											+between.toMinutes()
											+between.toSeconds());
	}

}
