package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CatagoryDAO;
import net.kzn.shoppingbackend.dto.Catagory;

@Repository("catagoryDAO")
public class CatagoryDAOImpl implements CatagoryDAO {

	private static List<Catagory> catagories = new ArrayList<Catagory>();
	static {
		Catagory catagory = new Catagory();
		// first catagory
		catagory.setId(1);
		catagory.setName("Television");
		catagory.setDescription("This is some description for television!");
		catagory.setImageURL("CAT_1.jpg");
		catagories.add(catagory);

		// second catagory
		catagory = new Catagory();
		catagory.setId(2);
		catagory.setName("Mobile");
		catagory.setDescription("This is some description for mobile!");
		catagory.setImageURL("CAT_2.jpg");
		catagories.add(catagory);

		// third catagory
		catagory = new Catagory();
		catagory.setId(3);
		catagory.setName("Laptop");
		catagory.setDescription("This is some description for laptop!");
		catagory.setImageURL("CAT_3.jpg");
		catagories.add(catagory);

	}

	@Override 
	public List<Catagory> list() {
		return catagories;
	}

	@Override
	public Catagory get(int id) {
		
		// enhanced for loop
		for(Catagory catagory : catagories) {
			if(catagory.getId() == id)
				return catagory;
		}
		return null;
			
	}

}