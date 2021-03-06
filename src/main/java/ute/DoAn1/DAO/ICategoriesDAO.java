package ute.DoAn1.DAO;

import java.util.List;

import ute.DoAn1.model.CategoriesModel;

public interface ICategoriesDAO extends GenericDAO<CategoriesModel> {
	List<CategoriesModel> findAllP();
	List<CategoriesModel> findAllC(String category_id);
	CategoriesModel findOne(String id);
}
