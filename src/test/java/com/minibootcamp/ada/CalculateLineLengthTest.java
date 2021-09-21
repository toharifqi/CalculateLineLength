package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateLineLengthTest {
 @Test
 public void testCalculateZeroPoint() {
  CalculateLineLength calculate = new CalculateLineLength();
  double result = calculate.calculateLineLength(0, 0, 0, 0);

  assertEquals(0, result, 0.0);
 }
}
