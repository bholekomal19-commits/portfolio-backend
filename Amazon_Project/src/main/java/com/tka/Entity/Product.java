package com.tka.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
    private String brand;
    private int rating;


	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Cart> carts;

	private boolean active;
    
    // Getters & Setters
    public int getId() 
    {
    	return id;
    }
    public void setId(int id)
    { 
    	this.id = id;
    }

    public String getName()
    { 
    	return name; 
    }
    public void setName(String name)
    {
    	this.name = name;
    }

    public String getDescription()
    {
    	return description;
    }
    public void setDescription(String description)
    {
    	this.description = description;
    }

    public double getPrice()
    {
    	return price;
    }
    public void setPrice(double price)
    {
    	this.price = price; 
    }

    public String getImageUrl()
    {
    	return imageUrl;
    }
    public void setImageUrl(String imageUrl)
    {
    	this.imageUrl = imageUrl;
    }

    public String getCategory()
    {
    	return category;
    }
    public void setCategory(String category)
    {
    	this.category = category;
    }
	
    public void setActive(boolean active)
    {
    	this.active=active;
	}
    public boolean getActive()
    {
        return active;
    }
    public String getBrand()
    {
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public List<Cart> getCarts() 
	{
		return carts;
	}
	public void setCarts(List<Cart> carts)
	{
		this.carts = carts;
	}
	public int getRating() {
	    return rating;
	}

	public void setRating(int rating) {
	    this.rating = rating;
	}
}