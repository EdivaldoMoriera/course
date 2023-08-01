package com.valdosm.course.entities.pk;

import java.io.Serializable;

import com.valdosm.course.entities.Order;
import com.valdosm.course.entities.Product;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class OrderItemPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order oder; 

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOder() {
        return oder;
    }
    public void setOder(Order oder) {
        this.oder = oder;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((oder == null) ? 0 : oder.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
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
        OrderItemPK other = (OrderItemPK) obj;
        if (oder == null) {
            if (other.oder != null)
                return false;
        } else if (!oder.equals(other.oder))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }
    
    
}
