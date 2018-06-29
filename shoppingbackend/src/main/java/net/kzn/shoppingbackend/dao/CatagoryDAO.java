package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Catagory;

public interface CatagoryDAO {
	List<Catagory> list();

	Catagory get(int id);

}
