 module invoiceapp {
//
    opens com.invoiceapp;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.fasterxml.jackson.databind;

    requires java.annotation;
    requires spring.beans;
    requires spring.context;
}