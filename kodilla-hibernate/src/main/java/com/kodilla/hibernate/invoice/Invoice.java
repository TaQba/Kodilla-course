//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
////@Entity
////@Table(name = "INVOICE")
//public class Invoice {
//    private int id;
//    private String number;
////    private List<Item> items = new ArrayList<>();
////
//    public Invoice(String number) {
//        this.number = number;
//    }
//
//    public Invoice() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getNumber() {
//        return number;
//    }
////
////    @OneToMany(
////            targetEntity = Item.class,
////            mappedBy = "invoice",
////            cascade = CascadeType.ALL,
////            fetch = FetchType.LAZY
////    )
////    public List<Item> getItems() {
////        return items;
////    }
////
////    public void setNumber(String number) {
////        this.number = number;
////    }
////
////    public void setItems(List<Item> items) {
////        this.items = items;
////    }
////
//    public void setId(int id) {
//        this.id = id;
//    }
//}
