package JavaProblemsolving.Basics;

public class StaticVsInstance {
    
    static double deliveryFee=5.5;
    double price;
    int noOfItems;

    StaticVsInstance(double price, int noOfItems){
        this.noOfItems= noOfItems;
        this.price=price;
    }

    double totalAmount( ){
        return (noOfItems*price )+deliveryFee;
    }
    
    static void printdeliveryFee(){
        System.out.println("Delivery charge of"+deliveryFee+ " has been charged");
    }
    public static void main(String[] args) {
        StaticVsInstance order1 = new StaticVsInstance(10, 3); 
        StaticVsInstance order2 = new StaticVsInstance(20, 2);

        System.out.println("Total amount for order 1 is " + order1.totalAmount());
        System.out.println("Total amount for order 2 is " + order2.totalAmount());

        StaticVsInstance.printdeliveryFee();
    }

    }

