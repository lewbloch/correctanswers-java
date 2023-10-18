package com.lewscanon.lessons.antipatterns;

public class FloatSunk {
 public static float futureBalance(
   final float currentBalance, final float interestAsFraction, final int periods) {
  final float growth = interestAsFraction + 1.0f;
  float futureBal = currentBalance;
  for (int period = 0; period < periods; ++period) {
   futureBal *= growth;
  }
  return futureBal;
 }

 public static float futureDirect(
   final float currentBalance, final float interestAsFraction, final int periods)
 {
  final float growth = interestAsFraction + 1.0f;
  @SuppressWarnings("UnnecessaryLocalVariable")
  final float futureBal = (float) Math.pow(growth, periods) * currentBalance;
  return futureBal;
 }

 record Data (float balance, float interest, int periods) {}

 static float futureBalance(Data data) {
  return futureBalance(data.balance, data.interest, data.periods);
 }

 static float futureDirect(Data data) {
  return futureDirect(data.balance, data.interest, data.periods);
 }

 public static void main(String[] args) {
  final String FMTF = "futureBalance(%s) -> %f%n";
  final String FMTD = " futureDirect(%s) -> %f%n";

  var scenario1 = new Data(821988.29f, 0.055f/365.25f, (int)(30 * 365.25f));
  System.out.printf(FMTF, scenario1, futureBalance(scenario1));
  System.out.printf(FMTD, scenario1, futureDirect(scenario1));
 }
}
