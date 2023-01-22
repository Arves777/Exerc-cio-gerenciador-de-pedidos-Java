package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    private String moment; 
    private OrderStatus status;
    private Client client;
    private List <OrderItem> orderList = new ArrayList<>();
    DateTimeFormatter fmoment = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:mm:ss");
    
    public Order(){
        
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = fmoment.format(moment);
        this.status = status;
        this.client = client;
    }

    

    

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    
    public void addItem(OrderItem orderItem){
        orderList.add(orderItem);
    }
    
    public void removeItem(OrderItem orderItem){
        orderList.remove(orderItem);
    }
    
    public Double total(){
        Double sum = 0.0;
        for (OrderItem x : orderList){
            sum += x.subTotal();
        }
        return sum;
    }

    public List <OrderItem> getOrderList() {
        return orderList;
    }
            
}
