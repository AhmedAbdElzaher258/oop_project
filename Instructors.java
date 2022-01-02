public class Instructors extends Doctor
{
    private String section;
  

    
	public Instructors(String name, int age, int idNumber, String addres, String subject, double monthlySalary,
			double monthlyBonus, String section,String gender) {
		super(name, age, idNumber, addres, subject, monthlySalary, monthlyBonus,gender);
		this.section = section;
	}

	public Instructors() {
		super();
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

    @Override
    public String toString() {
        return "Instructor{" +
                "ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Subject='" + getSubject() + '\'' +
                ", Section='" + section + '\'' +
                ", Monthly Salary=" + getMonthlySalary() +
                ", Monthly Bouns=" + getMonthlyBonus() +
                ", Final Monthly Salary=" + calcSalary() +
                '}';
    }
}
