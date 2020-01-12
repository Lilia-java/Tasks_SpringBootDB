package hw.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String storage;
    private int quentity;

    public Book() {
    }

    public Book(String name, double price, String storage, int quentity) {
        this.name = name;
        this.price = price;
        this.storage = storage;
        this.quentity = quentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", storage='" + storage + '\'' +
                ", quentity=" + quentity +
                '}';

    }
}