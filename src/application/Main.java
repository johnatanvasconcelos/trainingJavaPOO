package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		/*DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now(); 
		Instant d03 = Instant.now();*/
		
		LocalDate d04 = LocalDate.parse("2024-04-15");
		LocalDateTime d05 = LocalDateTime.parse("2024-04-15T01:05:02");
		Instant d06 = Instant.parse("2024-04-15T01:05:02Z");
		/*Instant d07 = Instant.parse("2024-04-15T01:05:02Z");*/
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Past Week: " + pastWeekLocalDate);
		System.out.println("Next Week: " + nextWeekLocalDate);
		
		
		
		
		
		
		
		/*LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); 
		LocalDate r2 = LocalDate.ofInstant(d07, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));*/
		
		/*System.out.println("r1: " + r1);
		System.out.println("r2 Portugal: " + r2);
		System.out.println("r3: " + r3);
		System.out.println("r4 Portugal: " + r4);
		System.out.println("d04 dia: " + d04.getDayOfMonth());
		System.out.println("d04 dia: " + d04.getMonthValue());
		System.out.println("d04 dia: " + d04.getYear());
		System.out.println("d04 dia: " + d04.getMonth());*/
		
		
		/*LocalDate d07 = LocalDate.parse("26/11/1999", fmt1);
		LocalDateTime d08 = LocalDateTime.parse("26/11/1999 00:51", fmt2);
		
		LocalDate d09 = LocalDate.of(1999, 11, 26);
		LocalDateTime d10 = LocalDateTime.of(1999, 11, 26, 00, 51);
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println("\n" + d04.format(fmt1));
		System.out.println(d05.format(fmt2) + "h");
		System.out.println(fmt3.format(d06) + "h" + "\n");
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);*/
	}
}
