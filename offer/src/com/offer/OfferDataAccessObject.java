package com.offer;

import java.util.ArrayList;
import java.util.List;

public class OfferDataAccessObject {

	// List of active offers
	private List<Offer> activeOfferList = new ArrayList<Offer>();

	// List of all expired offers
	private List<Offer> expiredOfferList = new ArrayList<Offer>();

	public OfferDataAccessObject() {
		// Constructor do nothing
	}

	/**
	 * Get all the offers that have been added.
	 * 
	 * @return - a list of offers
	 */
	public List<Offer> getActiveOffers() {

		return activeOfferList;
	}

	/**
	 * Add an offer to the offer list.
	 */
	public void addOffer() {

		for (int i = 1; i < 4; i++) {
			Offer offer = new Offer("Phone" + i, 20.00, 10 + i,
					"This is a new phone, chaper than apple, but thats not hard is it?", 5, true);
			//Thread timer = new Thread(new MyTimer(offer));
			//timer.start();

			activeOfferList.add(offer);
		}

	}

	// TODO: decide on if i remove or deactivate offer.

	/**
	 * Loop through the offers that have been stored and remove by the offer name
	 * provided.
	 * 
	 * @param offerToRemove - Name of the offer to remove
	 */
	public List<Offer> removeOfferByName(String offerToRemove) {

		for (Offer offer : this.getActiveOffers()) {
			if (offer.getName().equalsIgnoreCase(offerToRemove)) {
				activeOfferList.remove(offer);
			}
		}
		
		return activeOfferList;
	}

	/**
	 * Pass in an expired offer
	 * 
	 * @param offerToDeactivate - The offer to remove
	 */
	public void expiredOffer(Offer offer) {
		expiredOfferList.add(offer);
		
		// TODO: should i just remove the offer?
		// activeOfferList.remove(offer);

	}

	public class MyTimer implements Runnable {

		private Offer newOffer;

		public MyTimer(Offer offer) {
			newOffer = offer;
		}

		@Override
		public void run() {
			this.runTimerCountDown();

		}

		private void runTimerCountDown() {
			int offerTimeLength = newOffer.getOfferTimeLength();
			while (offerTimeLength > 0) {
				System.out.println("Remaining: " + offerTimeLength + " seconds");
				offerTimeLength--;
				try {
					Thread.sleep(1000L); // 1000L = 1000ms = 1 second
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			newOffer.setActiveOffer(false);
			OfferDataAccessObject.this.expiredOffer(newOffer);
		}

	}

}
