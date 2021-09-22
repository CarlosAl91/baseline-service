package com.tis.mx.application.service;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import java.util.List;



/**
 * The Interface CompoundInterestCalculator.
 */
public interface CompoundInterestCalculator {
  
  /**
   * Creates the revenue grid.
   *
   * @param initialInvestment the initial investment
   * @return the list
   */
  List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment);

  /**
   * Validate input.
   *
   * @param initialInvestment the initial investment
   * @return true, if successful
   */
  boolean validateInput(InitialInvestmentDto initialInvestment);
}
