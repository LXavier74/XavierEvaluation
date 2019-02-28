package fr.xavier.convertisseur;

public class NumeralToRoman {
	final String[] chiffreRomain={"M","D","C","L","X","V","I"};
public String getRoman(int entier)
{
	String resultat="";
	String s;
	
	switch(entier)
	{
		case 1:
		s="I";
		case 2:
			s="II";
		case 3:
			s="III";
		case 4:
			s="IV";
		case 5:
			s="V";
		case 6:
			s="VI";
		case 7:
			s="VII";
		case 8:
		   s="VIII";
		case 9:
			s="IX";
	}
	switch(entier)
	{
		case 10:
		s="X";
		case 20:
			s="XX";
		case 30:
			s="XXX";
		case 40:
			s="XL";
		case 50:
			s="L";
		case 60:
			s="LX";
		case 70:
			s="LXX";
		case 80:
		   s="LXXX";
		case 90:
			s="XC";
	}
	switch(entier)
	{
		case 100:
		s="C";
		case 200:
			s="CC";
		case 300:
			s="CCC";
		case 400:
			s="CD";
		case 500:
			s="D";
		case 600:
			s="DC";
		case 700:
			s="DCC";
		case 800:
		   s="DCCC";
		case 900:
			s="XM";
		case 1000:
			s="M";
	}
	
	
	
	
	return resultat;
	
}
}
