package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
 
/**
 * The Class InitialInvestmentDto.
 */
@Getter
@Setter
@ToString
public class InitialInvestmentDto {

  /** The initial investment. */
  private Float initialInvestment;
  
  /** The yearly input. */
  private Float yearlyInput;
  
  /** The yearly input increment. */
  private Integer yearlyInputIncrement;
  
  /** The investment yield. */
  private Float investmentYield;
  
  /** The investment years. */
  private Integer investmentYears;
}
