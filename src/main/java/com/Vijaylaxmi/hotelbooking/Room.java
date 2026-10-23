
package com.Vijaylaxmi.hotelbooking;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    private int id;
    private String type;
    private int price;
    private boolean available;
     private  int days;
     private  int hours;

    public Room() {
    }

    public Room(int id, String type, int price, boolean available) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.available = available;
        this.days = days;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
