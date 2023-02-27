package com.example.geektrust.model;
/**
 * @author Santanu Singha
 * @date 27/02/2023
 */

public class EachJourneyChargeNeeded {

	private Integer totalDiscount;
	private Integer costOfOverallJourney;
	
	public Integer getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Integer totalDiscount) {
		this.totalDiscount = totalDiscount;
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
	public EachJourneyChargeNeeded(Integer totalDiscount, Integer costOfTotalJourney) {
		super();
		this.totalDiscount = totalDiscount;
		this.costOfOverallJourney = costOfTotalJourney;
	}
	
}
