public class StaticClass {
    public static void main(String[] args) {
        System.out.println("csm1");
        Customers.CustomerMetrics csm1 = new Customers.CustomerMetrics();
        csm1.methodA();
        System.out.println(Customers.CustomerMetrics.getCount());
        Customers.CustomerMetrics.setCount(10);
        System.out.println(Customers.CustomerMetrics.getCount());

        System.out.println("\n cms2");
        Customers.CustomerMetrics csm2 = new Customers.CustomerMetrics();
        System.out.println(Customers.CustomerMetrics.getCount());
    }
}

class Customers {
    private int ciD;


    public Customers(int ciD) {
        this.ciD = ciD;
    }

    static class CustomerMetrics {
        static int count;
        int maxCount;

        public CustomerMetrics() {
            maxCount = 10;
            System.out.println("Customer Metric Constructor Called");
        }

        public CustomerMetrics(String a) {
            super();
            System.out.println("Customer Metric Constructor Called");
        }

        public CustomerMetrics(String a, int ab) {
            super();
            System.out.println("Customer Metric Constructor Called");
        }

        static {
            System.out.println("Customer Metric Static Block Called");
            count = 100;
            //NOT ALLOWED maxCount = 9999;
        }

        {
            System.out.println("Customer Metric Init Block 1 Called");
            maxCount = Integer.MAX_VALUE;
            count = 98;
            count++;
        }

        {
            System.out.println("Customer Metric Init Block 2 Called");
            count = 97;
        }

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            CustomerMetrics.count = count;
        }

        void methodA(){}

    }
}