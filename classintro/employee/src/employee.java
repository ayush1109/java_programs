class Employee{
	String name;
	int yearJoining;
	double salary;
	string address;

	Employee()
	{
		name = " ";
		yearJoining = 0;
		salary = 0;
		address = " ";
	}
	Employee(String name, int yearJoining, double salary, String address)
	{
		this.name = name;
		this.yearJoining = yearJoining;
		this.salary = salary;
		this.address = address;
	}
	void display()
	{
		System.out.println(name + "\t" + yearJoining + "\t" + address);
	}
}