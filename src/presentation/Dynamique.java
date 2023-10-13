package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

import dao.IDao;
import metier.IStudent;

public class Dynamique {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("src/Config.txt"));
		
		String daoClassName = scanner.nextLine();
		Class cDao = Class.forName(daoClassName);
		IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
		List<Double> dataList = dao.getData();
		dataList.forEach(item -> {
		    System.out.println(item); // Affiche chaque élément de la liste
		});
		
		String metierClassName = scanner.nextLine();
		Class cMetier = Class.forName(metierClassName);
		IStudent metier = (IStudent) cMetier.getDeclaredConstructor().newInstance();
		
		Method method = cMetier.getMethod("setDao", IDao.class);
		
		method.invoke(metier, dao);
		System.out.println("Resultat="+metier.calculGrade());
		
				
				
	
		
		
		
		
		
		
		
		
		
	}

}
