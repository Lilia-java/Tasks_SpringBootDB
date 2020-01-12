package hw.entity;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String district;
        private double discount;

        public Customer() {
        }

    public Customer(String name, String district, double discount) {
        this.name = name;
        this.district = district;
        this.discount = discount;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", discount=" + discount +
                '}';

    }
}
