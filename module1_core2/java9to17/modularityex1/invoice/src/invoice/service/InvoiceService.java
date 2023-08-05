package invoice.service;

import invoice.model.Invoice;

import java.util.List;

public class InvoiceService {

    public List<Invoice> getInvoiceList() {
        return List.of(new Invoice(569.00));
    }
}
