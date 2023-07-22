package com.main;

import com.delivery.DeleveryService;
import com.model.Invoice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeleveryService deleveryService=new DeleveryService();
      List<Invoice> invoices= deleveryService.processDelivery();
    }
}