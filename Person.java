public abstract class Person
{
    private String name,gender;
    private int age,idNumber;
    private String address;
    
    public Person(String name,int age,int idNumber,String address,String gender)
    {
        this.name=name;
        this.age=age;
        this.idNumber=idNumber;
        this.address=address;
        this.gender=gender;
    }

    public Person() {
		super();
	}

	public void setName(String Name) 
    {
        this.name = Name;
    }

    public String getName() 
    {
        return name;
    }

    public void setAge(int age) 
    {
        if (age<18 || age>80)
        {
            System.out.println("Please enter right age");
        }
        else 
        {
            this.age = age;
        }
    }

    public int getAge() 
    {
        return age;
    }

    public void setIdNumber(int idNumber) 
    {
        if (idNumber<0)
        {
            System.out.println("There is no negative ID Number ");
        }
        else 
        {
            this.idNumber = idNumber;
        }
    }

    public int getIdNumber() 
    {
        return idNumber;
    }
    
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public abstract double calcSalary();


    @Override
    public String toString() 
    {
        return "Person{" +
        		" ID Number=" + idNumber +
                ", Name='" + getName() + '\'' +
                ", Age=" + age +  ", Gender='" + gender + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
}