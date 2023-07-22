package com.invoice.impl;

import com.invoice.InvoiceService;
import com.model.Invoice;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {
    public List<Invoice> getAll(){
        return List.of(new Invoice(1,"java training"));
    }
}