package com.zensar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class Test6 {
	
	public static void main(String[] args) {
		
		//System.out.print(ZoneId.getAvailableZoneIds());
		
		//ZoneId id=ZoneId.of("NZ");
		
		
		LocalDate lt=LocalDate.of(1986, 10, 17);
		
		LocalDate lt1=LocalDate.now();
		
		
		Period between = Period.between(lt, lt1);
		
		System.out.println(between.getDays()+" "+between.getMonths()+" "+between.getYears());
		
	//	System.out.println(lt.);
		
		
		
		
		
	}

}
