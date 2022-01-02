public abstract class Employee extends Person
{
	private double monthlySalary,monthlyBonus;

	public Employee(String name, int age, int idNumber, String address, double monthlySalary, double monthlyBonus,String gender) {
		super(name, age, idNumber, address,gender);
		this.monthlySalary = monthlySalary;
		this.monthlyBonus = monthlyBonus;
	}

	public Employee() {
		super();
	}


    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        if(monthlyBonus<0 || monthlyBonus > 10000)
            System.out.println("Please enter right monthly bonus");
        else
            this.monthlyBonus=monthlyBonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary<0||monthlySalary >50000 )
            System.out.println("Please enter right monthly salary");
        else
            this.monthlySalary=monthlySalary;
    }

    @Override
    public double calcSalary(){
        return (monthlySalary + monthlyBonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bouns=" + monthlyBonus +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
