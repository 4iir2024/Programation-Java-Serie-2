package ex1;

public class Time {
	
	private int hour;
	private int minute;
	private int second ;
	
	
	public Time()
	{
		
	}
	
	

	public Time(int hour, int minute, int second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	


	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		if(hour < 24 && hour >=0)
			this.hour = hour;
		else
			this.hour=0;
		
	}



	public int getMinute() {
		return minute;
	}



	public void setMinute(int minute) {
		if(minute < 59 && minute >= 0 )
			this.minute = minute;
		else
			this.minute=0;
		
	}



	public int getSecond() {
		return second;
	}



	public void setSecond(int second) {
		if(second < 59 && second >=0)
			this.second = second;
		
		else
			this.second=0;
		
		
	}
	
	

	public Time nextSecond() {

		int hour = 0, minute = 0, second = 0;

		if (this.second != 59)
			second = this.second + 1;

		else {

			second = 0;

			if (this.minute != 59)
				minute = this.minute + 1;

			else {

				minute = 0;

				if (this.hour != 23)
					hour = this.hour + 1;

				else {

					hour = 0;

				}

			}

		}

		return new Time(hour, minute, second);
	}

	public Time previousSecond() {

		int hour = 0, minute = 0, second = 0;

		if (this.second != 0)
			second = this.second - 1;

		else {

			second = 59;

			if (this.minute != 0)
				minute = this.minute - 1;

			else {

				minute = 59;

				if (this.hour != 0)
					hour = this.hour - 1;

				else {

					hour = 23;

				}

			}

		}

		return new Time(hour, minute, second);

	}




	@Override
	public String toString() {
		return "Time is "  + hour +":"+ minute +":"+ second ;
	}



	public static void main(String[] args) {
		Time t1 = new Time(03,23,34);
		t1.nextSecond();
		
		System.out.println(t1.nextSecond());
		System.out.println(t1.toString());
		

	}

}
