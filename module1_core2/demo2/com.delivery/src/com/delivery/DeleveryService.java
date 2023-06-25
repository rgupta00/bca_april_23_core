package com.delivery;

import com.invoice.InvoiceService;
import com.model.Invoice;

import java.util.List;

public class DeleveryService {

    private InvoiceService invoiceService=InvoiceService.getInvoiceService();

    public List<Invoice> processDelivery(){
        List<Invoice> invoices= invoiceService.getAll();
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
        return invoices;
    }

}
