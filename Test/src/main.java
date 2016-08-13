class Date
{
	int Day;
	int Month;
	int Year;
	
	public Date(int y, int m, int d)
	{
		Day = d;
		Month = m;
		Year = y;
	}
}

class Student extends Date
{
	String name;
	boolean gender;
	Date DOB;
	
	public Student(String n, boolean g, Date d)
	{
		name = n;
		gender = g;
		DOB = d;
	}
	
	boolean equals(Student A)
	{
		if(A)
		if(A.DOB.day == this.DOB.day && A.DOB.month == this.DOB.month && A.DOB.year == this.DOB.year && A.name.equals(this.name) && A.gender == this.gender)
		{
			return true;
		}
		else
			return false;
	}
}