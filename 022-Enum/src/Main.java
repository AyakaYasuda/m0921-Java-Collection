
public class Main {

	public static void main(String[] args) {
		
		EnumDays day = EnumDays.TUESDAY;
		
		switch(day) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Nothing");	
			break;
		}

	}

}
