package ds.designpatterns.factory.dto;

import ds.designpatterns.factory.impl.IEmployee;

public class FullTimeEmployee implements IEmployee
{

	private final String salaryPerHour = "8€";
	
	public String getSalaryPerHour() 
	{
		return salaryPerHour;
	}

}
