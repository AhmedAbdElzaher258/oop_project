public class Student extends Person
{
	private double gpa,grade;
   
    public Student() {
		super();
	}


	public Student(String name,int age,int idNumbers,String address,double grade,double gpa,String gender)
    {
        super(name,age,idNumbers,address,gender);
        this.grade=grade;
        this.gpa=gpa;
    }
     
	public void setGrade(double grade) 
    {
        if (grade<=0 || grade >=100)
        {
            System.out.println("Plese enter right grade ");
        }
        else 
        {
            this.grade = grade;
        }
    }

    public double getGrade() 
    {
        return grade;
    }

    public void setGpa(double gpa) 
    {
        if (gpa<=0 || gpa >=4)
        {
            System.out.println("Plese enter right GPA ");
        }
        else 
        {
            this.gpa = gpa;
        }    
    }

    public double getGpa() 
    {
        return gpa;
    }

    @Override
    public String toString() 
    {
        return "Student{" +
        		" ID Number=" + getIdNumber() +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Gender='" + getGender() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Grade=" + grade +
                ", GPA=" + gpa +
                '}';
    }


	@Override
	public double calcSalary() {
		return 0;
	}

}