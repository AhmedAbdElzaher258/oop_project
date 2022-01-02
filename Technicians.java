public class Technicians extends Employee
{
	private String lab;

    public Technicians(String name, int age, int idNumber, String address, double monthlySalary, double monthlyBonus,
			String lab,String gender) {
		super(name, age, idNumber, address, monthlySalary, monthlyBonus,gender);
		this.lab = lab;
	}

	public Technicians() {
		super();
	}
	
	public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }


    @Override
    public String toString() {
        return "Technician{" +
                " ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Lab=" + lab +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bonus=" + getMonthlyBonus() +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
