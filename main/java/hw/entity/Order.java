package hw.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dateOrd;
    private int seller;
    private int customer;
    private int book;
    private int quentity;
    private int sum;


    public Order() {
    }

    public Order(String dateOrd, int seller, int customer, int book, int quentity, int sum) {
        this.dateOrd = dateOrd;
        this.seller = seller;
        this.customer = customer;
        this.book = book;
        this.quentity = quentity;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOrd() {
        return dateOrd;
    }

    public void setDateOrd(String dateOrd) {
        this.dateOrd = dateOrd;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", date ord='" + dateOrd + '\'' +
                ", seller='" + seller + '\'' +
                ", customer='" + customer + '\'' +
                ", book='" + book + '\'' +
                ", quentity='" + quentity + '\'' +
                ", sum=" + sum +
                '}';

    }
}
