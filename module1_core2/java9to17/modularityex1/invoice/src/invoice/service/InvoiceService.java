package invoice.service;

import invoice.model.Invoice;
import invoice.service.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {
    public static InvoiceService getInvoiceService(){
        return new InvoiceServiceImpl();
    }
    public List<Invoice> getInvoiceList() ;
}
