package com.offer;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/offers") 

public class OfferService {
	
	OfferDataAccessObject offerDao = new OfferDataAccessObject();  
	   @GET 
	   @Path("/getOffers") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Offer> getUsers(){ 
	      return offerDao.getActiveOffers(); 
	   }  

}
