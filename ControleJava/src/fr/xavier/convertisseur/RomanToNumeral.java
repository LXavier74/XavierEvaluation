package fr.xavier.convertisseur;

import java.util.ArrayList;

public class RomanToNumeral {
	
public int getNumeral(String nombreRomain)
{
	int resultat=0;
	int nombre=0;
	boolean estUn= false;


for (int i =0;i<nombreRomain.length();i++)
	{		
	

	
		if (nombreRomain.charAt(i)=='M')
		{
			resultat += 1000;
		}
		if (nombreRomain.charAt(i)=='D')
		{
			resultat += 500;
			
		}
		if (nombreRomain.charAt(i)=='C')
		{
			resultat += 100;
		}
		if (nombreRomain.charAt(i)=='L')
		{
			resultat += 50;
		}
		if (nombreRomain.charAt(i)=='X')
		{
			if (estUn==false)
			{
			resultat += 10;
			}
			else if (estUn==true)
			{
				resultat += 8;
			}		}
		if (nombreRomain.charAt(i)=='I')
		{			
		  estUn= true;
			resultat += 1;
		}
		if (nombreRomain.charAt(i)=='V')
		{
			if (estUn==false)
			{
			resultat += 5;
			}
			else if (estUn==true)
			{
				resultat += 3;
			}
		}
	
		
		
	
	}
	return resultat;
}
}
