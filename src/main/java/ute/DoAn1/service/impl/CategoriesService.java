package ute.DoAn1.service.impl;

import java.util.List;

import javax.inject.Inject;

import ute.DoAn1.DAO.ICategoriesDAO;
import ute.DoAn1.model.CategoriesModel;
import ute.DoAn1.service.ICategoriesService;

public class CategoriesService implements ICategoriesService {

	@Inject
	private ICategoriesDAO categoryDao;

	@Override
	public List<CategoriesModel> findAllP() {
		return categoryDao.findAllP();
	}

	@Override
	public List<CategoriesModel> findAllC(String category_id) {
		return categoryDao.findAllC(category_id);
	}

	@Override
	public CategoriesModel findOne(String id) {
		return categoryDao.findOne(id);
	}

}
