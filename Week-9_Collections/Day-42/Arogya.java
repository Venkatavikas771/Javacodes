import java.util.*;
class Patient 
{
private static int nextId =1;
private int id;
private String name; 
private int age;
private String guardianName;
private String gender;
private String address;
private String guardianAddress;
private String contactNumber;
private String city;
private String dateOfAdmission;
private String guardianContactNumber;
private String aadharCardNumber;

  
 Patient(String name, int age, String guardianName, String gender,String address, String guardianAdress,
String contactactNumber, String city, String dateOfAdmission, String guardianContactNumber, String aadharCardNumber) 
  {
this.id = nextId++;
this.name = name;
this.age = age;
this.gender = gender;
this.aadharCardNumber = aadharCardNumber;
this.contactNumber = contactNumber;
this.city = city;
this.address = address;
this.dateOfAdmission = dateOfAdmission;
this.guardianName = guardianName;
this.guardianAddress = guardianAddress;
this.guardianContactNumber = guardianContactNumber;

}


public void setId(int id) {
	this.id = id;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAadharCardNumber() {
	return aadharCardNumber;
}

public void setAadharCardNumber(String aadharCardNumber) {
	this.aadharCardNumber = aadharCardNumber;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDateOfAdmission() {
	return dateOfAdmission;
}

public void setDateOfAdmission(String dateOfAdmission) {
	this.dateOfAdmission = dateOfAdmission;
}

public String getGuardianName() {
	return guardianName;
}

public void setGuardianName(String guardianName) {
	this.guardianName = guardianName;
}

public String getGuardianAddress() {
	return guardianAddress;
}

public void setGuardianAddress(String guardianAddress) {
	this.guardianAddress = guardianAddress;
}

public String getGuardianContactNumber() {
	return guardianContactNumber;
}

public void setGuardianContactNumber(String guardianContactNumber) {
	this.guardianContactNumber = guardianContactNumber;
}
}

class Services
  {
  private HashMap<Integer,Patient> vikas=new HashMap();
   
    public void addPatient(Patient p)
    {
      vikas.put(p.getId(),p);
       System.out.println("New patient successfully");
      
    }
  public void  getPatientById(int id)
    {
      Patient p=vikas.get(id);
      if(p!=null)
      {
         System.out.println("The details are :");
        System.out.println("The name is :"+p.getName());
        System.out.println("The age is :"+p.getAge());
        System.out.println("The guardian name is :"+p.getGuardianName());
        System.out.println("The Gender is  :"+p.getGender());
        System.out.println("The ADDRESS is :"+p.getAddress());
         System.out.println("The guardianaddress is :"+p.getGuardianAddress());
        System.out.println("The contact number is :"+p.getContactNumber());
        System.out.println("The city  is :"+p.getCity());
        System.out.println("The date of admission is :"+p.getDateOfAdmission());
        System.out.println("The guardianContactNumber is :"+p.getGuardianContactNumber());
         System.out.println("The aadharCardNumber is :"+p.getAadharCardNumber());
     }
      else{
         System.out.println("No patient found with that id");
      }
  
  }
    public ArrayList<Patient> getPatientByCity(String city)
    {
      ArrayList <Patient> al=new ArrayList<Patient>();
      for(Patient o:vikas.values())
        {
          if(city.equalsIgnoreCase(o.getCity()))
          al.add(o);
        }
      return al;
  }
    public void deletePatient(int idtodel)
    {
      vikas.remove(idtodel);
      System.out.println("Id is deleted");
   
  }
   public ArrayList<Patient> getPatientByAge(int minAge,int maxAge)
    {
      ArrayList <Patient> al=new ArrayList<Patient>();
      for(Patient o:vikas.values())
        {
          if(o.getAge()>=minAge && o.getAge()<=maxAge)
          {
            al.add(o);
          }
        }
      return al;
  }
   public void getByName(String name1) 
    {
     for(Patient pn:vikas.values())
        {
          if(pn.getName().equalsIgnoreCase(name1))
          {
          System.out.println("The name is :"+pn.getName());
            System.out.println("The age is :"+pn.getAge());
        System.out.println("The guardian name is :"+pn.getGuardianName());
        System.out.println("The Gender is  :"+pn.getGender());
        System.out.println("The ADDRESS is :"+pn.getAddress());
         System.out.println("The guardianaddress is :"+pn.getGuardianAddress());
        System.out.println("The contact number is :"+pn.getContactNumber());
        System.out.println("The city  is :"+pn.getCity());
        System.out.println("The date of admission is :"+pn.getDateOfAdmission());
        System.out.println("The guardianContactNumber is :"+pn.getGuardianContactNumber());
         System.out.println("The aadharCardNumber is :"+pn.getAadharCardNumber());  
          }
        } 
    }
    public void allPatientDetails()
    {
      boolean check=vikas.isEmpty();
        if(check==false)
      {
      for(Patient pd:vikas.values())
        {
          System.out.println("The name is :"+pd.getName());
            System.out.println("The age is :"+pd.getAge());
        System.out.println("The guardian name is :"+pd.getGuardianName());
        System.out.println("The Gender is  :"+pd.getGender());
        System.out.println("The ADDRESS is :"+pd.getAddress());
         System.out.println("The guardianaddress is :"+pd.getGuardianAddress());
        System.out.println("The contact number is :"+pd.getContactNumber());
        System.out.println("The city  is :"+pd.getCity());
        System.out.println("The date of admission is :"+pd.getDateOfAdmission());
        System.out.println("The guardianContactNumber is :"+pd.getGuardianContactNumber());
         System.out.println("The aadharCardNumber is :"+pd.getAadharCardNumber());
      }
      }
      else
        {
        System.out.println("collection is empty");
        }
        }
    }
  
class Arogya
  {
    public static void main(String args[])
    {
      Services hospital=new Services();
      Scanner sc=new Scanner(System.in);
      int v=0;
while(v==0)
  {
      
      System.out.println("-----------------***--------------");
      System.out.println("Welcome to the Hospital management app");
      System.out.println("-----------------***--------------");
      System.out.println("1.Adding a patient\n2.Get the patient with unique id\n3.Get the patient by city\n4.List of patients\n5:Filtering the patients\n6:Get details with name\n7:Delete patient\n8:Exit");
      
  
      System.out.println("Enter the choice required");
      int choice=sc.nextInt();
           
      
        switch(choice)
          {
            case 1:
              System.out.println("Enter the patient name");
      String name=sc.next();
    sc.nextLine();
      System.out.println("Enter the patient age");
      int age=sc.nextInt();
      System.out.println("Enter the guardian name");
       String guardianName=sc.next();
       System.out.println("Enter the gender");
      String gender=sc.next();
      System.out.println("Enter the address");
       String address=sc.next();
      System.out.println("Enter the guardianaddress");
       String guardianAddress=sc.next();
      System.out.println("Enter the paient contact number");
      String contactNumber=sc.next();
       System.out.println("Enter the paient city");
      sc.nextLine();
       String city=sc.nextLine();
      System.out.println("Enter the patient dateOfAdmission");
      String dateOfAdmission=sc.next();
      System.out.println("Enter the guardian contact number");
      String guardianContactNumber=sc.next();
      System.out.println("Enter the patient aadharCardNumber");
      String aadharCardNumber=sc.next();
      
               Patient p1=new Patient(name,age,guardianName,gender,address,guardianAddress,contactNumber,city,dateOfAdmission, guardianContactNumber,aadharCardNumber);
      //Patient p2=new Patient("HARI",56,"Yogi","Male","Vijayawada","Hbd","3345656","Banglore","12-5-23","123456","3456");
               hospital.addPatient(p1);
              // hospital.addPatient(p2);
              break;
            case 2:
               System.out.println("Enter the patient id to search");
               int id=sc.nextInt();
                hospital.getPatientById(id);
               break;
            case 3:
              System.out.println("Enter the city to search patient");
              sc.nextLine();
              String city1=sc.nextLine();
              ArrayList<Patient> k=hospital.getPatientByCity(city1);
              for(Patient m:k)
          {
            if(k!=null)
            {
            
            System.out.println("The name is :"+m.getName());
            System.out.println("The age is :"+m.getAge());
        System.out.println("The guardian name is :"+m.getGuardianName());
        System.out.println("The Gender is  :"+m.getGender());
        System.out.println("The ADDRESS is :"+m.getAddress());
         System.out.println("The guardianaddress is :"+m.getGuardianAddress());
        System.out.println("The contact number is :"+m.getContactNumber());
        System.out.println("The city  is :"+m.getCity());
        System.out.println("The date of admission is :"+m.getDateOfAdmission());
        System.out.println("The guardianContactNumber is :"+m.getGuardianContactNumber());
         System.out.println("The aadharCardNumber is :"+m.getAadharCardNumber());
    }
            else{
              System.out.println("No patient found enter correct input");
            }
          }
               break;
            case 4:
            hospital.allPatientDetails(); 
               break;
            case 5:
        System.out.println("Search the people beween ages");
      System.out.println("Enter the  min age");
      int minAge=sc.nextInt();
      System.out.println("Enter the  max age");
      int maxAge=sc.nextInt();
      ArrayList<Patient> c=hospital.getPatientByAge(minAge,maxAge);
              for(Patient m:c)
                {
                 System.out.println("The name is :"+m.getName());
            System.out.println("The age is :"+m.getAge());
        System.out.println("The guardian name is :"+m.getGuardianName());
        System.out.println("The Gender is  :"+m.getGender());
        System.out.println("The ADDRESS is :"+m.getAddress());
         System.out.println("The guardianaddress is :"+m.getGuardianAddress());
        System.out.println("The contact number is :"+m.getContactNumber());
        System.out.println("The city  is :"+m.getCity());
        System.out.println("The date of admission is :"+m.getDateOfAdmission());
        System.out.println("The guardianContactNumber is :"+m.getGuardianContactNumber());
         System.out.println("The aadharCardNumber is :"+m.getAadharCardNumber());  
                }
               break;
            case 6:
              System.out.println("Enter the  patient name to get details");
               String name1=sc.next();
              hospital.getByName(name1);
               break;
            case 7:
        System.out.println("Enter the patient id to delete");
      int idtodel=sc.nextInt();
              hospital.deletePatient(idtodel);
               break;
               case 8:
              System.exit(0);
              break;
              default :
              System.out.println("Invalid input");
      
          }
  }
    
  }
  
  }



