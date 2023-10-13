package metier;

import java.util.List;

import dao.IDao;

public class StudentImpl implements IStudent {
	IDao dao;

	@Override
	public double calculGrade() {
		double sum=0;
		List<Double> grades = dao.getData();
		for(double d : grades) {
			sum+=d;
		}
		
		return sum/grades.size();
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
