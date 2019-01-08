package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;

    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;
    private Rachunek rachunek;
//    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }


    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name = "RACHUNEK_ID")
    public Rachunek getRachunek() {
        return rachunek;
    }

    public void setRachunek(Rachunek rachunek) {
        this.rachunek = rachunek;
    }
    //    @ManyToOne
//    @JoinColumn(name = "INVOICE_ID")
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
}
