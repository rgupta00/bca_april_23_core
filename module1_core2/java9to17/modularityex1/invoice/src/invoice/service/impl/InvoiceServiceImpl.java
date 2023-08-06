package invoice.service.impl;

import invoice.model.Invoice;
import invoice.service.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    public List<Invoice> getInvoiceList() {
        return List.of(new Invoice(569.00));
    }
}
