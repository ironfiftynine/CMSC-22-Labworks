public class Date{

	private int Year;
	private int Month;
	private int Day;
 
 public Date(){
 	this.Year = 1000;
 	this.Month = 1;
 	this.Day = 1;
 }


public Date(int x, int y, int z){

	this.Year = x;
	this.Month = y;
	this.Day = z;

}

public int getYear(){
	return Year;
}

public void setYear(int Year){
	if (Year <= 999 || Year >= 10000){
		throw new IllegalArgumentException("Invalid Input");
	}
	this.Year = Year;

}

public int getMonth(){
	return Month;
}

public void setMonth(int Month){
		if (Month <= 0|| Month >= 13){
		throw new IllegalArgumentException("Invalid Input");
	}
	this.Month = Month;
}

public int getDay(){
	return Day;
}


public void setDay(int Day){
		if ((this.Month == 2 && Day <= 0 || Day >= 29) && (this.Year % 4 == 0)){
		throw new IllegalArgumentException("Invalid Input");
	}
		else if ((this.Month == 12 || this.Month == 10 || this.Month == 8 || this.Month == 7 || this.Month == 5 || this.Month == 3 || this.Month == 1) && Day <= 0 || Day >= 31){
			throw new IllegalArgumentException("Invalid Input");
		}
		else if (Day <= 0 || Day >= 30){
			throw new IllegalArgumentException("Invalid Input");
		}
		else if ((this.Month == 2 && Day >= 0 || Day >= 28) && (this.Year % 4 != 0)){
			throw new IllegalArgumentException("Invalid Input");
		}
	this.Day = Day;
}

public String toString(){
	return String.format("%02d/%02d/%02d", this.Month,this.Day,this.Year);
}

public void setDate(int Year, int Month, int Day){
	setYear(Year);
	setMonth(Month);
	setDay(Day);
}
}
