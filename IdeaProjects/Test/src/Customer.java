import java.util.HashSet;
import java.util.Set;

public class Customer{
    private int ciD;
    private  Address homeAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        return ciD == customer.ciD;
    }

    @Override
    public int hashCode() {
        return ciD;
    }

    public Customer(int ciD, Address homeAddress) {
        this.ciD = ciD;
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ciD=" + ciD +
                ", homeAddress=" + homeAddress +
                '}';
    }
}

class Address{
    private String homeNo;
    private String streetNo;

    private int pinCode;

    public Address(String homeNo, String streetNo, int pinCode) {
        super();
        this.homeNo = homeNo;
        this.streetNo = streetNo;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

class CustomerRunner{
    public static void main(String[] args) {
        Customer c1 = new Customer(1, new Address("115","G Street", 1234));
        Customer c2 = new Customer(1, new Address("0","0", 0));
        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println(customerSet);


//        Customer.CustomerStaticClass cc = new Customer.CustomerStaticClass();
//        cc.methodA();
//        Customer.CustomerStaticClass.methodB();
    }
}

class Shape{
    private String shapeId;

    protected Shape(){
        this.shapeId = null;
    }
    public Shape(String shapeId) {
        this.shapeId = shapeId;
    }
}

class Rectangle extends Shape{

    public Rectangle(String shapeId) {
        super(shapeId);
    }
    public Rectangle(){
        super();
    }
}

class A{
    private String a;

    public A(String a) {
        this.a = a;
    }

    public void methodA(){}
}

class B extends A{
    public B(String a) {
        super(a);
    }
}


