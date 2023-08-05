package main;

import delivery.DeliveryService;
import invoice.model.Invoice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService=new DeliveryService();
       List<Invoice>list= deliveryService.delivery();
    }
}