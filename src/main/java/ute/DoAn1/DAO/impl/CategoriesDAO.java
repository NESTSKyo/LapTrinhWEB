package ute.DoAn1.DAO.impl;

import java.util.List;
import ute.DoAn1.DAO.ICategoriesDAO;
import ute.DoAn1.mapper.CategoriesMapper;
import ute.DoAn1.mapper.UserMapper;
import ute.DoAn1.model.CategoriesModel;
import ute.DoAn1.model.UserModel;

public class CategoriesDAO extends AbstractDAO<CategoriesModel> implements ICategoriesDAO {

	@Override
	public List<CategoriesModel> findAllP() {
		String sql = "SELECT * FROM categories where parent_id = 0;";
		return query(sql, new CategoriesMapper());
	}

	@Override
	public List<CategoriesModel> findAllC(String category_id) {
		String sql = "SELECT * FROM categories where parent_id= ?;";
		return query(sql, new CategoriesMapper(), category_id);
	}

	@Override
	public CategoriesModel findOne(String id) {
		String sql = "SELECT * FROM categories where id =?";
		List<CategoriesModel> category = query(sql.toString(), new CategoriesMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

}
