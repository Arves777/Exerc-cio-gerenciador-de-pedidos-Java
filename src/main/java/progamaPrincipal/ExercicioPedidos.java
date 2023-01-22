
package progamaPrincipal;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.time.LocalDateTime;

import java.util.Scanner;

public class ExercicioPedidos {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth Date (DD/MM/YYYY)");
        String clientBirthDate = sc.next();
        
        Client client = new Client(clientName, clientEmail, clientBirthDate);
        
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        LocalDateTime ldt = LocalDateTime.now();
        Order order = new Order(ldt, status, client);
        
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        
        for (int i=1; i<n+1; i++){
            System.out.println("--------------------------------------------");
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            
            Product p = new Product(productName, productPrice);
            OrderItem oi = new OrderItem(quantity, productPrice, p);
            
            order.addItem(oi);
        }
        System.out.println("");
        
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client);
        System.out.println("Order items: ");
        for (OrderItem x: order.getOrderList()){
            System.out.println(x);
        }
        System.out.println("Total price: $" + order.total());
    }
}
