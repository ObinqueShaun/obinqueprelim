package setaobinque;

import java.util.Scanner;

public class SetAobinque {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float price;
        int quantity;
        
        System.out.println("Enter price of item: ");
        price = input.nextFloat();
        
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();
        
        float total_amount = price * quantity;
        
        System.out.printf("Total Amount: %.2f\n", total_amount);
        
    }
    
}
