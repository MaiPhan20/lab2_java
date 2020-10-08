package ss6_7;

public class ss7_8 {
    public static void main(String[] args) {

        Employee objEmp = new Employee(1300,"Clara Smith");

        // Assign value to protected variable
        objEmp.empDesig="Receptionist";

        objEmp.setSSN("282-72-3873");

        // Invoke the public method
        objEmp.display();
    }

}

