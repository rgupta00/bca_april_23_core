package delivery;

import invoice.model.Invoice;
import invoice.service.InvoiceService;

import java.util.List;

public class DeliveryService {

    private InvoiceService invoiceService=
            InvoiceService.getInvoiceService();

    public List<Invoice> delivery(){
       invoiceService.getInvoiceList().forEach(System.out::println);
       return invoiceService.getInvoiceList();
    }

}
