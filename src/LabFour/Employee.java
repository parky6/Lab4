package LabFour;

/**
 * This class is in order to store employee's information. It implements Rules interface.
 *
 * CSIT 150 Lab 4
 * @author Yoonsuk, Park
 * @since 02/11/2018
 */
public class Employee implements Rules {
    protected String name;
    protected int salary; // 혹시 테이터 타입 아니면 수정할것

    /**
     * This default constructor will not work for this program but there is instruction to write this.
     */
    public Employee(){
        name = "default";
        salary = 0;
        //default constructor

    }

    /**
     * This is the other default constructor, it includes two parameters, and changes name and salary.
     * @param newName
     * @param newSalary
     */
    public Employee(String newName, int newSalary){
        name=newName;
        salary=newSalary;
    }

    /**
     * Because of protected accessor, this method are needed to get name.
     * @return String name.
     */
    public String getName(){return name;}

    /**
     * Because of protected accessor, this method are needed to get the amount of salary.
     * @return Integer the number of salary.
     */
    public int getSalary(){return salary;}

    /**
     * Because of protected accessor, this method are needed to change name.
     * @param name
     */
    public void setName(String name){this.name=name;}

    /**
     * Because of protected accessor, this method are needed to change the number of salary.
     * @param salary
     */
    public void setSalary(int salary){this.salary=salary;}

    /**
     * When print Employee class, it returns this method's string and the return value becomes output.
     * @return a String of Employee's information.
     */
    public String toString(){
        String infoE = String.format("Employee name: %s, Employee salary: %s",name,salary);

        return infoE;
    }

}
