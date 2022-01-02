public class Adminstrators extends Employee
{
	private String jobType;

	public Adminstrators(String name, int age, int idNumber, String address, double monthlySalary, double monthlyBonus,
			String jobType,String gender) {
		super(name, age, idNumber, address, monthlySalary, monthlyBonus,gender);
		this.jobType = jobType;
	}

	public Adminstrators() {
		super();
	}

	public String getJobtype() {
		return jobType;
	}

	public void setJobtype(String jobType) {
		this.jobType = jobType;
	}

	@Override
    public String toString() {
        return "Adminstrator{" +
                "ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Job Title='" + jobType + '\'' +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bonus=" + getMonthlyBonus() +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
