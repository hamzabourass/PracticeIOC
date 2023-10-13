package dao;

import java.util.ArrayList;
import java.util.List;

public class DaoStudent implements IDao {

	@Override
	public List<Double> getData() {
		List<Double> notes = new ArrayList<>();
		notes.add(15.5);
		notes.add(17.0);
		notes.add(10.0);
		notes.add(18.5);
		notes.add(11.5);

		return notes;
	}

}
