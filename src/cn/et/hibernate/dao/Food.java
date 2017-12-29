package cn.et.hibernate.dao;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */

public class Food implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double price;
	private String imagepath;

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** full constructor */
	public Food(String foodname, Double price, String imagepath) {
		this.foodname = foodname;
		this.price = price;
		this.imagepath = imagepath;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImagepath() {
		return this.imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

}