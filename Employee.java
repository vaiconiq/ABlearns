/*for encapsulation*/

class Employee{
    private int empId = 2;
    private int ph = 0;
    private String name;
    private int basicSal = 20000;
    private int incentive = 200;

    public Employee(String empName, int phoneNo) {
        ph=phoneNo;
        name=empName;
    }

    Employee() {
        ph=2222;
        name="Raj";
    }

    private void countSalaries(){
        System.out.println(basicSal + incentive);
    }
    int getPh(){
        return ph;
    }
    int getEmpId(){
        return empId;
    }
    String getName(){
        return name;
    }
    void setPh(int phone){
        ph=phone;
    }

    void setName(String name){
        this.name=name;
    }

}