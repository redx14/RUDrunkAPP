package RUDRUNK;

import java.util.Scanner;

public class calculations{
	
	private double weightP = 0;
	private double time = 0.0;
	private double alcAmount = 0.0;
	private double amountD = 0.0;
	private double alcP = 0.0;
	
	public void calculations(){
	}
	
	public double getWeight(){
		return weightP;
	}
	
	public void setWeight(double weightP){
		this.weightP = weightP;
	}
	
	public double getTime(){
		return time;
	}
	
	public void setTime(double time){
		this.time = time;
	}
	
	public double getAlcAmount(){
		return alcAmount;
	}
	
	public void setAlcAmount(double alcAmount){
		this.alcAmount = alcAmount;
	}
	
	public double getAmountDrank(){
		return amountD;
	}
	
	public void setAmountDrank(int amountD){
		this.amountD = amountD;
	}
	
	public double getAlcPerc(){
		return alcP;
	}
	
	public void setAlcPerc(double alcP){
		this.alcP = alcP;
	}
	
	public static double getBAC(double Shots,double Beers,double Wine,double WeightP,double time,double alcP) {
		double FinalBAC = ((((Shots*1.5)+(Beers*12)+(Wine*5))*alcP*.0789)/WeightP)-(time*.015);
		return Math.round(FinalBAC*1000.0)/1000.0;
	}
	
}
