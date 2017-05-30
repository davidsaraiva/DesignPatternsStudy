package ds.designpatterns.factory.dto;

import ds.designpatterns.factory.impl.IEmployee;

public class TemporaryEmployee implements IEmployee
{

	private final String salaryPerHour = "5€";
	
	public String getSalaryPerHour() {
		return salaryPerHour;
	}

}
