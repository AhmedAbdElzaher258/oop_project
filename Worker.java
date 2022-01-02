public class Worker extends Adminstrators 
{
	private String workType; 
	
	public Worker(String name, int age, int idNumber, String address, double monthlySalary, double monthlyBonus,
			String jobType, String gender, String workType) {
		super(name, age, idNumber, address, monthlySalary, monthlyBonus, jobType, gender);
		this.workType = workType;
	}
	
	public Worker() {
		super();
	}



	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Override
    public String toString() {
        return "Worker{" +
        		" ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gedner='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Job Title='" + getJobtype() + '\'' +
                ", Work Type='" + workType + '\'' +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bouns=" + getMonthlyBonus() +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
