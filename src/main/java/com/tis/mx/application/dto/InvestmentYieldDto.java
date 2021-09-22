package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class InvestmentYieldDto.
 */
@Getter
@Setter
@NoArgsConstructor
public class InvestmentYieldDto {
  
  /** The investment year. */
  private Integer investmentYear;
  
  /** The initial investment. */
  private Float initialInvestment;
  
  /** The yearly input. */
  private Float yearlyInput;
  
  /** The investment yield. */
  private Float investmentYield;
  
  /** The final balance. */
  private Float finalBalance;
}
