public class Doctor extends Employee
{
	private String subject;
	
    public Doctor(String name,int age, int idNumber,String addres,String subject,  double monthlySalary ,double monthlyBonus,String gender)
    {
        super(name,age,idNumber,addres,monthlySalary,monthlyBonus,gender);
        this.subject=subject;

    }
    
    public Doctor() {
		super();
	}

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Subject='" + subject + '\'' +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bonus=" + getMonthlyBonus() +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
