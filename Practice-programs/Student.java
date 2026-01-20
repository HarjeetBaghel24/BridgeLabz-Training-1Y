class Student {
    int id;
    int age;
    String name;

      void displayDetails()
	  {
        String status = "Active"; 
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Status: " +status);
    }
    public static void main(String[] args)
	{
        Student sc = new Student();
        sc.id = 31;
        sc.age = 18;
        sc.name = "Harjeet";
        
        sc.displayDetails(); 
    }
}