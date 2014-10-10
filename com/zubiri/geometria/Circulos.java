/*
	Radio
*/
package com.zubiri.geometria;
public class Circulos 
{
	private double area;
	private double circunferencia = 0;
	private double radio;

	public Circulos (double valorRadio)
	{
		this.radio = valorRadio;
	}

	//Metodo para calcular el radio
	public void setRadio (double rad) 
	{
		this.radio = rad;
		//this.area = 3.1416f * (radio * radio);
		//this.circunferencia = 2 * 3.1416f * radio;
	}

	public double Area()
	{
		area = 3.14f * radio * radio;
		return area;
	}

	public double Circunferencia()
	{
		circunferencia = 2 * 3.14f * radio;
		return circunferencia;
	}

	public double getArea()
	{
		return area;
	}

	public double getCircunferencia()
	{
		return circunferencia;
	}

}
