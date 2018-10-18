package com.offer;

import javax.xml.bind.annotation.XmlElement;

public class Offer {

	private String name;
	
	private double originalPrice;
	
	private int discount;
	
	private String description;
	
	private int offerTimeLength;
	
	private boolean activeOffer;
	
	public Offer() {}
	
	public Offer(String theName, double theOriginalPrice, int theDiscount, String theDescription,
			int theOfferTimeLength, boolean theActiveOffer){
		this.name = theName;
		this.originalPrice = theOriginalPrice;
		this.discount = theDiscount;
		this.description = theDescription;
		this.offerTimeLength = theOfferTimeLength;
		this.activeOffer = theActiveOffer;	
		
	}
	

	public String getName() {
		return name;
	}

	@XmlElement 
	public void setName(String theName) {
		this.name = theName;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	@XmlElement 
	public void setOrriginalPrice(double theOriginalPrice) {
		this.originalPrice = theOriginalPrice;
	}

	public int getDiscount() {
		return discount;
	}

	@XmlElement 
	public void setDiscount(int theDiscount) {
		this.discount = theDiscount;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement 
	public void setDescription(String theDescription) {
		this.description = theDescription;
	}

	public int getOfferTimeLength() {
		return offerTimeLength;
	}

	@XmlElement 
	public void setOfferTimeLength(int theOfferTimeLength) {
		this.offerTimeLength = theOfferTimeLength;
	}

	public boolean isActiveOffer() {
		return activeOffer;
	}

	@XmlElement 
	public void setActiveOffer(boolean theActiveOffer) {
		this.activeOffer = theActiveOffer;
	}	
	
}
