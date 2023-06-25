package com.invoice;

import com.invoice.impl.InvoiceServiceImpl;
import com.model.Invoice;

import java.util.List;

public interface InvoiceService {
    public List<Invoice> getAll();
    public static InvoiceService getInvoiceService(){
        return new InvoiceServiceImpl();
    }
}