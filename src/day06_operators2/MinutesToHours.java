package day06_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
	
	int minutes =150;
	int hours = minutes / 60;
	int remainingMinutes = minutes%60;
	
	System.out.print(minutes  + " minutes is " );
	System.out.println(hours + " hours, " + remainingMinutes + " minutes");
}
}
