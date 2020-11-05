import java.time.LocalDate;
import java.time.Period;

public class A2_LocalDateDemo1 {

	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		
		//올 해의 크리스마스
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmax: " + xmas);
		
		//크리스마스까지 앞으로 몇일?
		LocalDate eve = xmas.minusDays(1);
		System.out.println("Xmas eve " + eve);
		
		// 이브까지 몇일
		Period eveleft = Period.between(today, eve);
		System.out.println("eve lefts " + eveleft.getDays() + "일");
	}
}
