import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	
	

	    public static void main(String[] args)
	    {
	    	while(true)
	    	{
				String Username,username;
			    String Password,password;
		
			    Username = "mostafaKamel";
			    Password = "m123k";
		
			    Scanner input = new Scanner(System.in);
			    do
			    {
			    System.out.println("Enter Username: ");
			    username = input.nextLine();
			    }
			    while(username.isBlank());
			    
			    do
			    {
				    System.out.println("Enter Password: ");
				    password = input.nextLine();
			    }
			    while(password.isBlank());
			    
			    if (username.equals(Username) && password.equals(Password)) 
			    {
			        Main m=new Main();
			    	m.run();
			    }
		
			    else if (username.equals(Username)) 
			    {
			        System.out.println("Invalid Password!");
			    }
			    else if (password.equals(Password)) 
			    {
			        System.out.println("Invalid Username!");
			    }
			    else 
			    {
			        System.out.println("Invalid Username & Password!");
			    }
	    	}
	    }
	
	public void run()
	{
    	Scanner sc=new Scanner(System.in);
    	
        ArrayList<Doctor> doc = new ArrayList<Doctor>();
        ArrayList<Technicians> tech = new ArrayList<Technicians>();
        ArrayList<Student> st = new ArrayList<Student>();
        ArrayList<Worker> wk = new ArrayList<Worker>();
        ArrayList<Instructors> inst = new ArrayList<Instructors>();
        ArrayList<Adminstrators> admin = new ArrayList<Adminstrators>();
        
    	Student s =new Student();
    	Doctor d = new Doctor();
    	Adminstrators a= new Adminstrators();
    	Instructors ins =new Instructors();
    	Technicians tec = new Technicians();
    	Worker wor = new Worker();
    	
    	while (true) 
    	{
    		System.out.println("--------Welcome to the FCI management system--------");
    		System.out.println("1- Add person");
    		System.out.println("2- Disable person");
    		System.out.println("3- Search for person");
    		System.out.println("4- Delete person");
    		System.out.println("5- Exit");
          
    		System.out.println("Please, enter your choice:");

    		Scanner in = new Scanner(System.in);
    		String line = in.nextLine();

    		switch (line) 
    		{
    		case "1":
    			System.out.println("1- Add students");
    			System.out.println("2- Add doctor");
    			System.out.println("3- Add instructor");
             	System.out.println("4- Add administrator");
             	System.out.println("5- Add worker");
             	System.out.println("6- Add technician");
             	System.out.println("Please, enter your choice:");
                  
             	String line2 = in.nextLine();
                  
             	switch (line2) 
             	{
             	case "1":
             		
             		int id=0;
             		do
             		{
                      	boolean badNumber;
                      	do
                      	{
                 			System.out.println("Enter student's ID number");
                      		try
                      		{
                      			id = sc.nextInt(); 
                              	s.setIdNumber(id);
                      			badNumber = false;
                      		}
                      		catch(Exception e)
                      		{
                      			System.out.println("Please, enter a number");
                      			sc.nextLine();
                      			badNumber = true;
                      		}
                      	}
                      	while(badNumber);
             		}
             		while (id < 0);             		
                  	
                  	String fn;
                  	int count = 0;
                  	sc.nextLine();
                  	do 
                  	{
                  		count = 0;
                  		System.out.println("Enter student's quadrant name");
                  		fn = sc.nextLine();
                  		for(int i = 0; i < fn.length(); i++) 
                  		{
                  			if(Character.isWhitespace(fn.charAt(i))) count++;
                  		}	
                  		if (count < 3 || count > 4)
	                    {
                  			System.out.println("Please, enter student's quadrant name ");
	                      	System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
	                    }
                  	}
                  	while (count < 3 || count > 4 || fn.isBlank());
                     
                  	int age=0;
                  	do
                  	{
                  		boolean badNumber= false;
                  	    do
                  	    {
                  	    	System.out.println("Enter student's age");
                  	    	try
                  	    	{
	                  	    	age = sc.nextInt(); 
	                  	    	s.setAge(age);
	                  	        badNumber = false;
                  	    	}
                  	    	catch(Exception e)
                  	    	{
	                  	        System.out.println("Please, enter a number");
	                  	        sc.nextLine();
	                  	        badNumber = true;
                  	   	  	}
                  	    }
                  	    while(badNumber);
                  	}
                  	while (age <18 || age >80);
                      
                  	String gender = null;
                    int gen=0;
                    do
                    {
                    	boolean badNumber = false;

                        do
                        {
	                       	System.out.println("Enter student's gender");
	                       	System.out.println("1- Male \n2- Female");
	                       	try
	                       	{
	                          	gen = sc.nextInt();
	                            badNumber = false;
	                            if (gen == 1)
	                        	{
	                        		gender = "Male";
	                        	}
	                        	else if (gen == 2)
	                        	{
	                        		gender = "Female";
	                        	}
	                        	else 
	                        	{
	                        		System.out.println("Please, write \"1\" or \"2\" ");
	                        	}
	                       	}
	                       	catch(Exception e)
	                       	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
	                       	}
                        }
                        while(badNumber);
                    }
                    while (gen != 1 && gen != 2);
                     
                    String add;
                    sc.nextLine();
                    do
                    {
	                    System.out.println("Enter student's address");
	                    add = sc.nextLine();
                    }
                    while(add.isBlank());
                    
                    double grade=0.0;
                    do 
                    {
                        boolean badNumber =false;
                        do{
                        	System.out.println("Enter student's grade");
                        	try{
                        	grade = sc.nextDouble();
                        	s.setGrade(grade);
                            badNumber = false;
                          }
                          catch(Exception e){
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                          }
                        }while(badNumber);
                    }
                    while(grade < 0 || grade > 100);
                      
                    double gpa=0.0;
                    do
                    {
                    	boolean badNumber= false;
                        do
                        {
                        	System.out.println("Enter student's GPA");
                        	try
                        	{
	                          	gpa = sc.nextDouble();
	                        	s.setGpa(gpa);
	                            badNumber = false;
                        	}
                        	catch(Exception e)
                        	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
                        	}
                        }
                        while(badNumber);
                    }
                    while (gpa > 4|| gpa < 0);
                                      
                    Student st1 = new Student(fn,age,id,add,grade,gpa,gender);
                    st.add(st1);

                    System.out.println("Add Student Success!");

                    break;
                      
                    case "2":
                    	
                 		int idn=0;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter doctor's ID number");
                          		try
                          		{
                          			idn = sc.nextInt(); 
                                  	d.setIdNumber(idn);
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (idn < 0);  
                
                    fn=null;
                    count = 0;
                    sc.nextLine();
                    do 
                    {
                    	count = 0;
                    	System.out.println("Enter doctor's quadrant name");
                    	fn = sc.nextLine();
                    	for(int i = 0; i < fn.length(); i++) 
                    	{
                    		if(Character.isWhitespace(fn.charAt(i))) count++;
                    	}
                    	if (count < 3 || count > 4)
                    	{
                    		System.out.println("Please, enter doctor's quadrant name ");
                    		System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
                    	}
                    }
                    while (count < 3 || count > 4 || fn.isBlank());
            	
                    age=0;
                  	do
                  	{
                  		boolean badNumber= false;
                  	    do
                  	    {
                  	    	System.out.println("Enter doctor's age");
                  	    	try
                  	    	{
	                  	    	age = sc.nextInt(); 
	                  	    	d.setAge(age);
	                  	        badNumber = false;
                  	    	}
                  	    	catch(Exception e)
                  	    	{
	                  	        System.out.println("Please, enter a number");
	                  	        sc.nextLine();
	                  	        badNumber = true;
                  	    	}
                  	    }
                  	    while(badNumber);
                  	}
                  	while (age <18 || age >80);
                
                  	gender = null;
                    gen=0;
                    do
                    {
                    	boolean badNumber = false;

                        do
                        {
                        	System.out.println("Enter doctor's gender");
                        	System.out.println("1- Male \n2- Female");
                        	try
                        	{
                        		gen = sc.nextInt();
                        		badNumber = false;
                        		if (gen == 1)
                        		{
                        			gender = "Male";
                        		}
                        		else if (gen == 2)
	                        	{
	                        		gender = "Female";
	                        	}
	                        	else 
	                        	{
	                        		System.out.println("Please, write \"1\" or \"2\" ");
	                        	}
                        	}
                          catch(Exception e)
                        	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
                        	}
                        }
                        while(badNumber);
                    }
                    while (gen != 1 && gen != 2);
                
                    sc.nextLine();
                    do
                    {
	                    System.out.println("Enter doctor's address");
	                    add = sc.nextLine();
                    }
                    while(add.isBlank());
                    
                    String sub;
                    do
                    {
	                    System.out.println("Enter doctor's subject");
	                    sub=sc.nextLine();
                    }
                    while(sub.isBlank());
                    
                    double msl=0.0;
                    do
                    {
                    	boolean badNumber =false;
                    	
                        do
                        {
                        	System.out.println("Enter doctor's monthly salary by L.E");
                        	try
                        	{
                        		msl = sc.nextInt();
                        		d.setMonthlySalary(msl);
                        		badNumber = false;
                        	}
                        	catch(Exception e)
                        	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
                        	}	
                        }
                        while(badNumber);
                    }
                    while (msl < 0 ||msl > 50000);
                
                    double mb=0.0;
                    do
                    {
                    	boolean badNumber =false;
                    	
                        do
                        {
                        	System.out.println("Enter doctor's monthly bonus by L.E");
                        	try
                        	{
	                          	mb = sc.nextInt();
	                        	d.setMonthlyBonus(mb);
	                            badNumber = false;
                        	}
                        	catch(Exception e)
                        	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
                        	}
                        }
                        while(badNumber);
                    }
                    while (mb < 0 ||mb > 10000);
                                
                    Doctor D1 = new Doctor(fn,age,idn,add,sub,msl,mb,gender);
                    doc.add(D1);
                    
                    System.out.println("Add Doctor Success!");

                    break;
                
                    case "3":
                 		idn=0;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter instructor's ID number");
                          		try
                          		{
                          			idn = sc.nextInt(); 
                                  	ins.setIdNumber(idn);
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (idn < 0); 
                    	
                    	fn=null;
                    	count = 0;
                    	sc.nextLine();
                    	do 
                    	{
                    		count = 0;
                    		System.out.println("Enter instructor's quadrant name");
                    		fn = sc.nextLine();
                    		for(int i = 0; i < fn.length(); i++) {
                    		if(Character.isWhitespace(fn.charAt(i))) count++;
                    		}
                    		if (count < 3 || count > 4)
                    		{
                    			System.out.println("Please, Enter instructor's quadrant name ");
                    			System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
                    		}
                    	}
                    	while (count < 3 || count > 4 || fn.isBlank());
            	
                        age=0;
                      	do
                      	{
                      		boolean badNumber= false;
                      	    do
                      	    {
                      	    	System.out.println("Enter instructor's age");
                      	    	try
                      	    	{
	                      	    	age = sc.nextInt(); 
	                      	    	ins.setAge(age);
	                      	        badNumber = false;
                      	    	}
                      	    	catch(Exception e)
                      	    	{
	                      	        System.out.println("Please, enter a number");
	                      	        sc.nextLine();
	                      	        badNumber = true;
                      	    	}
                      	    }
                      	    while(badNumber);
                      	}
                      	while (age <18 || age >80);
                
                      	gender = null;
                        gen=0;
                        do
                        {
                        	boolean badNumber = false;

                            do
                            {
                            	System.out.println("Enter instructor's gender");
                            	System.out.println("1- Male \n2- Female");
                            	try
                            	{
                            		gen = sc.nextInt();
                            		badNumber = false;
                            		if (gen == 1)
                            		{
                            			gender = "Male";
                            		}
                            		else if (gen == 2)
    	                        	{
    	                        		gender = "Female";
    	                        	}
    	                        	else 
    	                        	{
    	                        		System.out.println("Please, write \"1\" or \"2\" ");
    	                        	}
                            	}
                              catch(Exception e)
                            	{
    	                            System.out.println("Please, enter a number");
    	                            sc.nextLine();
    	                            badNumber = true;
                            	}
                            }
                            while(badNumber);
                        }
                        while (gen != 1 && gen != 2);
                
                    	sc.nextLine();
                        do
                        {
	                    	System.out.println("Enter instructor's address");
	                    	add = sc.nextLine();
                        }
                        while(add.isBlank());
                        	
                        do
                        {
	                    	System.out.println("Enter instructor's subject");
	                    	sub=sc.nextLine();
                        }
                        while(sub.isBlank());
                        
                        String sec;
                        do
                        {
	                    	System.out.println("Enter instructor's section");
	                    	sec=sc.nextLine();
                        }
                        while(sec.isBlank());

                        msl=0.0;
                        do
                        {
                        	boolean badNumber =false;
                        	
                            do
                            {
                            	System.out.println("Enter instructor's monthly salary by L.E");
                            	try
                            	{
                            		msl = sc.nextInt();
                            		ins.setMonthlySalary(msl);
                            		badNumber = false;
                            	}
                            	catch(Exception e)
                            	{
    	                            System.out.println("Please, enter a number");
    	                            sc.nextLine();
    	                            badNumber = true;
                            	}	
                            }
                            while(badNumber);
                        }
                        while (msl < 0 ||msl > 50000);
                
                        mb=0.0;
                        do
                        {
                        	boolean badNumber =false;
                        	
                            do
                            {
                            	System.out.println("Enter instructor's monthly bonus by L.E");
                            	try
                            	{
    	                          	mb = sc.nextInt();
    	                        	ins.setMonthlyBonus(mb);
    	                            badNumber = false;
                            	}
                            	catch(Exception e)
                            	{
    	                            System.out.println("Please, enter a number");
    	                            sc.nextLine();
    	                            badNumber = true;
                            	}
                            }
                            while(badNumber);
                        }
                        while (mb < 0 ||mb > 10000);
                
                    	Instructors ins1=new Instructors(fn,age,idn,add,sub,msl,mb,sec,gender);
                    	inst.add(ins1);
                    	
                        System.out.println("Add Instructor Success!");
                    	
                    	break;
                
                    case "4":
                 		idn=0;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter administrator's ID number");
                          		try
                          		{
                          			idn = sc.nextInt(); 
                                  	a.setIdNumber(idn);
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (idn < 0);
	                
	             	fn=null;
	             	count = 0;
	                sc.nextLine();
	            	do 
	            	{
	            	count = 0;
	                System.out.println("Enter administrator's quadrant name");
	                fn = sc.nextLine();
	                	for(int i = 0; i < fn.length(); i++) 
	                	{
	                    if(Character.isWhitespace(fn.charAt(i))) count++;
	                	}
	                	if (count < 3 || count > 4)
	                	{
	                	System.out.println("Please, enter administrator's quadrant name ");
	                	System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
	                	}
	            	}
            	while (count < 3 || count > 4 || fn.isBlank());
            	
                    age=0;
                  	do
                  	{
                  		boolean badNumber= false;
                  	    do
                  	    {
                  	    	System.out.println("Enter administrator's age");
                  	    	try
                  	    	{
	                  	    	age = sc.nextInt(); 
	                  	    	a.setAge(age);
	                  	        badNumber = false;
                  	    	}
                  	    	catch(Exception e)
                  	    	{
	                  	        System.out.println("Please, enter a number");
	                  	        sc.nextLine();
	                  	        badNumber = true;
                  	    	}
                  	    }
                  	    while(badNumber);
                  	}
                  	while (age <18 || age >80);
                
                  	gender = null;
                    gen=0;
                    do
                    {
                    	boolean badNumber = false;

                        do
                        {
                        	System.out.println("Enter administrator's gender");
                        	System.out.println("1- Male \n2- Female");
                        	try
                        	{
                        		gen = sc.nextInt();
                        		badNumber = false;
                        		if (gen == 1)
                        		{
                        			gender = "Male";
                        		}
                        		else if (gen == 2)
	                        	{
	                        		gender = "Female";
	                        	}
	                        	else 
	                        	{
	                        		System.out.println("Please, write \"1\" or \"2\" ");
	                        	}
                        	}
                          catch(Exception e)
                        	{
	                            System.out.println("Please, enter a number");
	                            sc.nextLine();
	                            badNumber = true;
                        	}
                        }
                        while(badNumber);
                    }
                    while (gen != 1 && gen != 2);
                
                sc.nextLine();
                do
                {
	                System.out.println("Enter administrator's address");
	                add = sc.nextLine();
                }
                while(add.isBlank());
                	
                String jt;
                do
                {
	                System.out.println("Enter administrator's job title");
	                jt=sc.nextLine();
                }
                while(jt.isBlank());
                
                msl=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter administrator's monthly salary by L.E");
                    	try
                    	{
                    		msl = sc.nextInt();
                    		a.setMonthlySalary(msl);
                    		badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}	
                    }
                    while(badNumber);
                }
                while (msl < 0 ||msl > 50000);
                
                mb=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter administrator's monthly bonus by L.E");
                    	try
                    	{
                          	mb = sc.nextInt();
                        	a.setMonthlyBonus(mb);
                            badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}
                    }
                    while(badNumber);
                }
                while (mb < 0 ||mb > 10000);
                
                Adminstrators admn1=new Adminstrators(fn,age,idn,add,msl,mb, jt,gender);
                admin.add(admn1);
                
                System.out.println("Add Administrator Success!");
                
                break;
                
                case "5":
             		idn=0;
             		do
             		{
                      	boolean badNumber;
                      	do
                      	{
                 			System.out.println("Enter worker's ID number");
                      		try
                      		{
                      			idn = sc.nextInt(); 
                              	wor.setIdNumber(idn);
                      			badNumber = false;
                      		}
                      		catch(Exception e)
                      		{
                      			System.out.println("Please, enter a number");
                      			sc.nextLine();
                      			badNumber = true;
                      		}
                      	}
                      	while(badNumber);
             		}
             		while (idn < 0);

             	fn=null;
                count = 0;
                sc.nextLine();
            	do 
            	{
	            	count = 0;
	                System.out.println("Enter worker's quadrant name");
	                fn = sc.nextLine();
	                for(int i = 0; i < fn.length(); i++) 
	                {
	                     if(Character.isWhitespace(fn.charAt(i))) count++;
	                }
	                if (count < 3 || count > 4)
	                {
	                	System.out.println("Please, enter your quadrant name ");
	                	System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
	                }
            	}
            	while (count < 3 || count > 4 || fn.isBlank());
            	
                age=0;
              	do
              	{
              		boolean badNumber= false;
              	    do
              	    {
              	    	System.out.println("Enter worker's age");
              	    	try
              	    	{
              	    		age = sc.nextInt(); 
	              	    	wor.setAge(age);
	              	        badNumber = false;
              	    	}
              	    	catch(Exception e)
              	    	{
              	    		System.out.println("Please, enter a number");
              	    		sc.nextLine();
              	    		badNumber = true;
              	    	}
              	    }
              	    while(badNumber);
              	}
              	while (age <18 || age >80);
                
              	gender = null;
                gen=0;
                do
                {
                	boolean badNumber = false;

                    do
                    {
                    	System.out.println("Enter worker's gender");
                    	System.out.println("1- Male \n2- Female");
                    	try
                    	{
                    		gen = sc.nextInt();
                    		badNumber = false;
                    		if (gen == 1)
                    		{
                    			gender = "Male";
                    		}
                    		else if (gen == 2)
                        	{
                        		gender = "Female";
                        	}
                        	else 
                        	{
                        		System.out.println("Please, write \"1\" or \"2\" ");
                        	}
                    	}
                      catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}
                    }
                    while(badNumber);
                }
                while (gen != 1 && gen != 2);
                
                sc.nextLine();
                do
                {
	                System.out.println("Enter worker's address");
	                add = sc.nextLine();
                }
                while(add.isBlank());
                
                do
                {
	                System.out.println("Enter worker's job title");
	                jt=sc.nextLine();
                }
                while(jt.isBlank());
                
                String work = null;
                int wo=0;
                do
                {
                	boolean badNumber =false;
	                
	                do
	                {
	                	System.out.println("Enter worker's Work Type");
		                System.out.println("1- Full Time \n2- Half Time");
		                try
		                {
		                	wo = sc.nextInt();
		                	if (wo == 1)
		  	                {
		  	                	work = "Full Time";
		  	                }
		  	                else if (wo == 2)
		  	                {
		  	                	work = "Half Time";
		  	                }
		  	                else 
		  	                {
		  	                	System.out.println("Please, write \"1\" or \"2\" ");
		  	                }
		                	badNumber = false;
	                    }
	                    catch(Exception e)
		                {
		                      System.out.println("Please, enter a number");
		                      sc.next();
		                      badNumber = true;
	                    }
	                  }
	                while(badNumber);
                }
                while (wo != 1 && wo != 2);
                
                msl=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter worker's monthly salary by L.E");
                    	try
                    	{
                    		msl = sc.nextInt();
                    		wor.setMonthlySalary(msl);
                    		badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}	
                    }
                    while(badNumber);
                }
                while (msl < 0 ||msl > 50000);
                
                mb=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter worker's monthly bonus by L.E");
                    	try
                    	{
                          	mb = sc.nextInt();
                        	wor.setMonthlyBonus(mb);
                            badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}
                    }
                    while(badNumber);
                }
                while (mb < 0 ||mb > 10000);
                
                Worker w1=new Worker(fn,age,idn,add,msl,mb,jt,gender,work);
                wk.add(w1);
                
                System.out.println("Add Worker Success!");
                
                break;
                
                case "6":
                
             		idn=0;
             		do
             		{
                      	boolean badNumber;
                      	do
                      	{
                 			System.out.println("Enter technician's ID number");
                      		try
                      		{
                      			idn = sc.nextInt(); 
                              	tec.setIdNumber(idn);
                      			badNumber = false;
                      		}
                      		catch(Exception e)
                      		{
                      			System.out.println("Please, enter a number");
                      			sc.nextLine();
                      			badNumber = true;
                      		}
                      	}
                      	while(badNumber);
             		}
             		while (idn < 0);
                
             	fn=null;
                count = 0;
                sc.nextLine();
            	do 
            	{
	            	count = 0;
	                System.out.println("Enter technician's quadrant name");
	                fn = sc.nextLine();
	                for(int i = 0; i < fn.length(); i++) {
	                     if(Character.isWhitespace(fn.charAt(i))) count++;
	                }
	                if (count < 3 || count > 4)
	                {
	                	System.out.println("Please, enter technician's quadrant name ");
	                	System.out.println("EX: \"xxxx xxxx xxxx xxxx\"");
	                }
            	}
            	while (count < 3 || count > 4 || fn.isBlank());
            	
                age=0;
              	do
              	{
              		boolean badNumber= false;
              	    do
              	    {
              	    	System.out.println("Enter technician's age");
              	    	try
              	    	{
	              	    	age = sc.nextInt(); 
	              	    	tec.setAge(age);
	              	        badNumber = false;
              	    	}
              	    	catch(Exception e)
              	    	{
	              	        System.out.println("Please, enter a number");
	              	        sc.nextLine();
	              	        badNumber = true;
              	    	}
              	    }
              	    while(badNumber);
              	}
              	while (age <18 || age >80);
               
              	gender = null;
                gen=0;
                do
                {
                	boolean badNumber = false;

                    do
                    {
                    	System.out.println("Enter technician's gender");
                    	System.out.println("1- Male \n2- Female");
                    	try
                    	{
                    		gen = sc.nextInt();
                    		badNumber = false;
                    		if (gen == 1)
                    		{
                    			gender = "Male";
                    		}
                    		else if (gen == 2)
                        	{
                        		gender = "Female";
                        	}
                        	else 
                        	{
                        		System.out.println("Please, write \"1\" or \"2\" ");
                        	}
                    	}
                      catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}
                    }
                    while(badNumber);
                }
                while (gen != 1 && gen != 2);
                
                sc.nextLine();
                do
                {
	                System.out.println("Enter technician's address");
	                add = sc.nextLine();
                }
                while(add.isBlank());
                
                String lab;
                do
                {
	                System.out.println("Enter technician's lab");
	                lab=sc.nextLine();
                }
                while(lab.isBlank());
                
                msl=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter technician's monthly salary by L.E");
                    	try
                    	{
                    		msl = sc.nextInt();
                    		tec.setMonthlySalary(msl);
                    		badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}	
                    }
                    while(badNumber);
                }
                while (msl < 0 ||msl > 50000);
                
                mb=0.0;
                do
                {
                	boolean badNumber =false;
                	
                    do
                    {
                    	System.out.println("Enter technician's monthly bonus by L.E");
                    	try
                    	{
                          	mb = sc.nextInt();
                        	tec.setMonthlyBonus(mb);
                            badNumber = false;
                    	}
                    	catch(Exception e)
                    	{
                            System.out.println("Please, enter a number");
                            sc.nextLine();
                            badNumber = true;
                    	}
                    }
                    while(badNumber);
                }
                while (mb < 0 ||mb > 10000);
                                
                Technicians t1=new Technicians(fn,age,idn,add,msl,mb,lab,gender);
                tech.add(t1);
                
                System.out.println("Add Technician Success!");
                
                break;
                
                
                default :
                System.out.println("Please, enter right choice");
                break;
                                        
             	}
                  break;
                  
              case "2":
                  System.out.println("1- Disable students information");
                  System.out.println("2- Disable doctor information");
                  System.out.println("3- Disable instructor information");
                  System.out.println("4- Disable administrator information");
                  System.out.println("5- Disable worker information");
                  System.out.println("6- Disable technician information");
                  System.out.println("Please, enter your choice:");
                  
                  String line3 = in.nextLine();
                  
                  switch (line3) 
                  {
                  case "1":
                	  
                	  int id=0;
                      boolean exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter student's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  s.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Student i : st)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This student doesn't exist");
                   	 break;
                    
                    
                  case "2":
                	  
                	  id=0;
                      exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter doctor's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  d.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Doctor i : doc)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This doctor doesn't exist");
                   	 break;
                    
                  case "3":
                	  id=0;
                      exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter instructor's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  ins.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Instructors i : inst)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This instructor doesn't exist");
                   	 break;
                    
                  case "4":
                	  id=0;
                      exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter adminstrator's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  a.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Adminstrators i : admin)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This adminstrator doesn't exist");
                   	 break;
                    
                    case"5":
                  	  id=0;
                      exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter worker's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  wor.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Worker i : wk)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This worker doesn't exist");
                   	 break;
                    
                    case"6":
                  	  id=0;
                      exist = false;
                      do
                      {
                    	  boolean badNumber;
                    	  do
                    	  {
                    		  System.out.println("Enter technician's ID number");
                    		  try
                    		  {
                    			  id = sc.nextInt(); 
                    			  tec.setIdNumber(id);
                    			  badNumber = false;
                               	  exist = false;
                            	  for(Technicians i : tech)
                            	  {
                            		  if(i.getIdNumber() == id)
                            		  {
                            			  exist = true;
                            			  System.out.println(i.toString());
                            			  break;
                            		  }
                            	  }
                    		  }
                    		  catch(Exception e)
                    		  {
                    			  System.out.println("Please, enter a number");
                    			  sc.nextLine();
                    			  badNumber = true;
                    		  }
                    	  }
                    	  while(badNumber);
                      }
               		while (id < 0);
                      
                   	 if(!exist)
                		 System.out.println("This technician doesn't exist");
                   	 break;
                    
                    default :
                    	System.out.println("Please, enter right choice");
                    	break;
                  }
                  break;
                  
              case "3":
            	  System.out.println("1- Search for students");
            	  System.out.println("2- Search for doctor");
                  System.out.println("3- Search for instructor");
                  System.out.println("4- Search for administrator");
                  System.out.println("5- Search for worker");
                  System.out.println("6- Search for technician");
                  System.out.println("Please, enter your choice:");
                  
            
                  line3 = in.nextLine();

          			switch (line3) 
          			{
          			case "1":
    				
          				int id=0;
          				boolean exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter student's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	s.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Student i : st)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
          				
          			case "2":
          				id=0;
          			 	exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter docto's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	d.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Doctor i : doc)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
          				
          			case "3":
          				id=0;
          				exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter instructor's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	ins.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Instructors i : inst)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
          				
          			case "4":
          				id=0;
          				exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter adminstrator's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	a.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Adminstrators i : admin)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
          				
          			case "5":
          				id=0;
          				exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter worker's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	wor.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Worker i : wk)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
              	
          			case "6":
          				id=0;
          				exist = false;
                 		do
                 		{
                          	boolean badNumber;
                          	do
                          	{
                     			System.out.println("Enter Technician's ID number");
                          		try
                          		{
                          			id = sc.nextInt(); 
                                  	tec.setIdNumber(id);
                                  	
                      				exist = false;
                      				for(Technicians i : tech)
                      				{
                      					if(i.getIdNumber() == id)
                      					{
                      						exist = true;
                      						break;
                      					}
                      				}
                      				
                          			badNumber = false;
                          		}
                          		catch(Exception e)
                          		{
                          			System.out.println("Please, enter a number");
                          			sc.nextLine();
                          			badNumber = true;
                          		}
                          	}
                          	while(badNumber);
                 		}
                 		while (id < 0);

          				if(exist)
          					System.out.println("Found");
          				else
          					System.out.println("Not found");
              	
          				break;
          				
          			default :
          				System.out.println("Please, enter right choice");
          				break;
                  
          			}
          			break;
          			
              case "4":
                  System.out.println("1- Delete students");
                  System.out.println("2- Delete doctor");
                  System.out.println("3- Delete instructor");
                  System.out.println("4- Delete administrator");
                  System.out.println("5- Delete worker");
                  System.out.println("6- Delete technician");
                  System.out.println("Please, enter your choice:");
                  
                  String line4 = in.nextLine();

          		  switch (line4) {
                  case "1":
                	  
               		int id=0;
               		boolean exist = false;
               		
               		do
               		{
                        boolean badNumber;
                        do
                        {
                        	System.out.println("Enter student's ID number");
                        	try
                        	{
                        		id = sc.nextInt(); 
                        		s.setIdNumber(id);
                        		for(Student i : st)
		                        {
		                            if(i.getIdNumber() == id)
		                            {
		                            	exist = true;
		                              	st.remove(i);
		                              	System.out.println("Removed");
		                              	break;
		                            }
		                        }
	                        			badNumber = false;
	                        }
                        	catch(Exception e)
                        	{
                        		System.out.println("Please, enter a number");
                        		sc.nextLine();
                        		badNumber = true;
                        	}
                        }
                        while(badNumber);
               		}
               		while (id < 0);  

                	if(!exist)
                		  System.out.println("This student doesn't exist");
                  
                	break;
                	  
                  case "2":
                	  
                	  id=0;
                	  exist = false;
                 		
                	  do
                	  {
                          boolean badNumber;
                          do
                          {
                        	  System.out.println("Enter doctor's ID number");
                        	  try
                        	  {
                        		  id = sc.nextInt(); 
                        		  d.setIdNumber(id);
                        		  for(Doctor i : doc)
                        		  {
                        			  if(i.getIdNumber() == id)
                        			  {
                        				  exist = true;
                        				  doc.remove(i);
                        				  System.out.println("Removed");
                        				  break;
                        			  }
                        		  }
                        		  badNumber = false;
                        	  }
                        	  catch(Exception e)
                        	  {
                        		  System.out.println("Please, enter a number");
                        		  sc.nextLine();
                        		  badNumber = true;
                        	  }
                          }
                          while(badNumber);
                	  }
                	  while (id < 0);  

                	  if(!exist)
                		  System.out.println("This doctor doesn't exist");
                    
                	  break;
                	  
                  case "3":
                	  id=0;
                	  exist = false;
                 		
                	  do
                	  {
                          boolean badNumber;
                          do
                          {
                        	  System.out.println("Enter instructor's ID number");
                        	  try
                        	  {
                        		  id = sc.nextInt(); 
                        		  ins.setIdNumber(id);
                        		  for(Instructors i : inst)
                        		  {
                        			  if(i.getIdNumber() == id)
                        			  {
                        				  exist = true;
                        				  inst.remove(i);
                        				  System.out.println("Removed");
                        				  break;
                        			  }
                        		  }
                        		  badNumber = false;
                        	  }
                        	  catch(Exception e)
                        	  {
                        		  System.out.println("Please, enter a number");
                        		  sc.nextLine();
                        		  badNumber = true;
                        	  }
                          }
                          while(badNumber);
                	  }
                	  while (id < 0);  

                	  if(!exist)
                		  System.out.println("This instructor doesn't exist");
                	  
                  case "4":
                	  id=0;
                	  exist = false;
                 		
                	  do
                	  {
                          boolean badNumber;
                          do
                          {
                        	  System.out.println("Enter adminstrator's ID number");
                        	  try
                        	  {
                        		  id = sc.nextInt(); 
                        		  a.setIdNumber(id);
                        		  for(Adminstrators i : admin)
                        		  {
                        			  if(i.getIdNumber() == id)
                        			  {
                        				  exist = true;
                        				  admin.remove(i);
                        				  System.out.println("Removed");
                        				  break;
                        			  }
                        		  }
                        		  badNumber = false;
                        	  }
                        	  catch(Exception e)
                        	  {
                        		  System.out.println("Please, enter a number");
                        		  sc.nextLine();
                        		  badNumber = true;
                        	  }
                          }
                          while(badNumber);
                	  }
                	  while (id < 0);  

                	  if(!exist)
                		  System.out.println("This adminstrators doesn't exist");
                	  
                  case "5":
                	  id=0;
                	  exist = false;
                 		
                	  do
                	  {
                          boolean badNumber;
                          do
                          {
                        	  System.out.println("Enter worker's ID number");
                        	  try
                        	  {
                        		  id = sc.nextInt(); 
                        		  wor.setIdNumber(id);
                        		  for(Worker i : wk)
                        		  {
                        			  if(i.getIdNumber() == id)
                        			  {
                        				  exist = true;
                        				  wk.remove(i);
                        				  System.out.println("Removed");
                        				  break;
                        			  }
                        		  }
                        		  badNumber = false;
                        	  }
                        	  catch(Exception e)
                        	  {
                        		  System.out.println("Please, enter a number");
                        		  sc.nextLine();
                        		  badNumber = true;
                        	  }
                          }
                          while(badNumber);
                	  }
                	  while (id < 0);  

                	  if(!exist)
                		  System.out.println("This worker doesn't exist");
                	  
                  case "6":
                	  id=0;
                	  exist = false;
                 		
                	  do
                	  {
                          boolean badNumber;
                          do
                          {
                        	  System.out.println("Enter technician's ID number");
                        	  try
                        	  {
                        		  id = sc.nextInt(); 
                        		  tec.setIdNumber(id);
                        		  for(Technicians i : tech)
                        		  {
                        			  if(i.getIdNumber() == id)
                        			  {
                        				  exist = true;
                        				  tech.remove(i);
                        				  System.out.println("Removed");
                        				  break;
                        			  }
                        		  }
                        		  badNumber = false;
                        	  }
                        	  catch(Exception e)
                        	  {
                        		  System.out.println("Please, enter a number");
                        		  sc.nextLine();
                        		  badNumber = true;
                        	  }
                          }
                          while(badNumber);
                	  }
                	  while (id < 0);  

                	  if(!exist)
                		  System.out.println("This technician doesn't exist");
                  
                  default :
                	  System.out.println("Please, enter right choice");
                	  break;
          		  }
                  break;
                  
              case "5":
            	  System.out.println("Thank you for using!");
                  System.out.println("---Developed by---");
                  System.out.println("-Abanoub Merzik\n-Abdallah Ali\n-Abubakr Ahmed\n-Ahmed Abdelzaher\n-Ahmed ElSayed");
                  System.exit(0);
                  
                  default :
                	  System.out.println("Please, enter right choice");
                	  break;
    		}
    	}
		
	}
}