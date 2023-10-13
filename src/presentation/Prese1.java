package presentation;

import metier.*;
import dao.*;

public class Prese1 {
	public static void main(String[] args) {
		
		//injection de dependance statique
		
		StudentImpl metier = new StudentImpl();
		IDao dao = new DaoStudent();
		
		metier.setDao(dao);
		 System.out.println("Resultat final : "+metier.calculGrade());
		
		
		
	}

}
