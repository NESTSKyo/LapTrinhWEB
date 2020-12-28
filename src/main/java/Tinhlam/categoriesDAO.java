package Tinhlam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class categoriesDAO {
	
		public List<categories> getAllP(){
			Connection con = null;
			PreparedStatement st = null;
			List<categories> ls = new ArrayList<categories>();
			ResultSet rs = null;
			try {
				String sql = "select * from categories where parent_id = 0";
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				rs = st.executeQuery();
				while(rs.next()) {
					categories cat = new categories();
					cat.setId(rs.getInt("id"));
					cat.setName(rs.getString("name"));
					cat.setParent_id(rs.getInt("parent_id"));
					cat.setCreated_at(rs.getTimestamp("created_at"));
					ls.add(cat);
				}
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
			return ls;
		}
		
		public List<categories> getAllC(){
			Connection con = null;
			PreparedStatement st = null;
			List<categories> ls = new ArrayList<categories>();
			ResultSet rs = null;
			try {
				String sql = "select * from categories where parent_id != 0";
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				rs = st.executeQuery();
				while(rs.next()) {
					categories cat = new categories();
					cat.setId(rs.getInt("id"));
					cat.setName(rs.getString("name"));
					cat.setParent_id(rs.getInt("parent_id"));
					cat.setCreated_at(rs.getTimestamp("created_at"));
					ls.add(cat);
				}
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
			return ls;
		}
		
		public categories findID (String id) {
			Connection con = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			int iD = Integer.parseInt(id);
			try {
				String sql = "select * from categories where id = ?";
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				st.setInt(1, iD);
				rs = st.executeQuery();
				while(rs.next()) {
				categories cat = new categories();
				cat.setId(rs.getInt("id"));
				cat.setName(rs.getString("name"));
				cat.setParent_id(rs.getInt("parent_id"));
				cat.setCreated_at(rs.getTimestamp("created_at"));
				return cat;
				}
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
			return null;
			}
		
		public void editOne(String id, String name, String parent_id){
			Connection con = null;
			PreparedStatement st = null;
			int iD = Integer.parseInt(id);
			int parent_iD = Integer.parseInt(parent_id);
			try {
				String sql = "update categories set name = '" +name + "', parent_id = '"+ parent_iD + "' where id = " +iD;
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				st.executeUpdate();
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
		}
		
		public void insertOne(String name, String parent_id){
			Connection con = null;
			PreparedStatement st = null;
			int parent_iD = Integer.parseInt(parent_id);
			try {
				String sql = "insert into categories(name,parent_id) values('" + name +"'," + parent_iD + ")";
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				st.executeUpdate();
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
		}
		
		public void deleteOne(String id){
			Connection con = null;
			PreparedStatement st = null;
			int iD = Integer.parseInt(id);
			try {
				String sql = "delete from categories where id = " + iD;
				con = dataBaseHelper.getMySQLConnection();
				st = con.prepareStatement(sql);
				st.executeUpdate(sql);
			} catch (Exception ex){
				System.out.println("error: " +ex.toString());
			}
		}
}
