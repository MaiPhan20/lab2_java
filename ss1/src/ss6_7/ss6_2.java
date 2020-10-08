package ss6_7;

public class ss6_2 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changeCustomerAddress(String address) {
        customerAddress = address;
    }
    /**
     * Declares an instance method displayCustomerInformation is created to
     * display the details of the customer object
     */
    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
}

