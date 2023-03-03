package com.example.geektrust.model;
/**
 * @author Santanu Singha
 * @date 27/02/2023
 */

public class EachJourneyChargeNeeded {

	private Integer totalDiscountGiven;
	private Integer costOfOverallJourney;
	
	public Integer getTotalDiscount() {
		return totalDiscountGiven;
	}

	public void setTotalDiscount(Integer totalDiscountGiven) {
		this.totalDiscountGiven = totalDiscountGiven;
	}

	public Integer getCostOfOverallJourney() {
		return costOfOverallJourney;
	}

	public void setCostOfOverallJourney(Integer costOfOverallJourney) {
		this.costOfOverallJourney = costOfOverallJourney;
	}

	
	/**
	 * @param totalDiscount
	 * @param costOfTotalJourney
	 */
	public EachJourneyChargeNeeded(Integer totalDiscountGiven, Integer costOfTotalJourney) {
		super();
		this.totalDiscountGiven = totalDiscountGiven;
		this.costOfOverallJourney = costOfTotalJourney;
	}
	
}
