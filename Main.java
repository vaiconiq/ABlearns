import Package1.MyClass;

public class Main {
    public static void main(String[] args) {
        Employee engineer = new Employee("AB",21);
        Employee engineer2 = new Employee();

//        MyClass myClass = new MyClass();
//        myClass.print();


//        System.out.println(engineer.getEmpId());
//        System.out.println(engineer.getPh());
//        System.out.println(engineer.getName());

        System.out.println(engineer2.getPh());
        System.out.println(engineer2.getName());

        engineer2.setName("Karan");
        engineer2.setPh(1000);
        System.out.println(engineer2.getPh());
        System.out.println(engineer2.getName());  //encapsulation end-------------



        //ABSTRACTION

//        Bank bk = new Bank();
        SBIread SBIread = new SBIread();
        SBIread.write();

    }
}

