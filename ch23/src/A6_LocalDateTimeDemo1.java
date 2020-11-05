import java.time.LocalDateTime;

public class A6_LocalDateTimeDemo1 {

	public static void main(String[] args) {
		// 현재 날짜 시간
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		//영국 바이어랑 22시간 35분뒤 화상미팅
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		
		// 미팅 날짜 시각
		System.out.println(mt);

	}

}
