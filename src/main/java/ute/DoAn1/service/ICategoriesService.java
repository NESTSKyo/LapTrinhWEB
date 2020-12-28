package ute.DoAn1.service;

import java.util.List;

import ute.DoAn1.model.CategoriesModel;

public interface ICategoriesService {
	List<CategoriesModel> findAllP();
	List<CategoriesModel> findAllC(String category_id);
	CategoriesModel findOne(String id);
}
