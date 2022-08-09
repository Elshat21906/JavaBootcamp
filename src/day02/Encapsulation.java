package day02;

class Employee{

    private String name;
    private double salary;
    private String id;

    public String getName() { // Read ONLY
        if(name == null){
            throw new RuntimeException("Employee name has not be set");
        }
        return name;
    }

    public void setName(String name) { //Write Only
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Employee name can not be empty");
        }
        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                throw new RuntimeException("Employee name can not contain digits");
            }

            if(!Character.isLetterOrDigit(each)){
                if(each != ' '){
                    throw new RuntimeException("Employee name can not contain special characters");
                }
            }

        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Employee employee = new Employee();

      //  employee.name = "          ";
      //  System.out.println(employee.name);

        employee.setName("Daniel@");
        System.out.println(employee.getName());


    }

}
