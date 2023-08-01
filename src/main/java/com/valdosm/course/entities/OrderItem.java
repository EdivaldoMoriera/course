package com.valdosm.course.entities;

import java.io.Serializable;

import com.valdosm.course.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    @EmbeddedId
    private OrderItemPK id;
    private Integer qauntity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer qauntity, Double price) {
        id.setOder(order);
        id.setProduct(product);
        this.qauntity = qauntity;
        this.price = price;
    }
    public Order getOrder(){
        return id.getOder();
    }
    public void setOrder(Order order){
        id.setOder(order);
    }
     public Product gerProduct(){
        return id.getProduct();
    }
    public void setProduct(Product product){
        id.setProduct(product);
    }


    public Integer getQauntity() {
        return qauntity;
    }

    public void setQauntity(Integer qauntity) {
        this.qauntity = qauntity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    public double subTotal(){
        return price + qauntity;
    }

}