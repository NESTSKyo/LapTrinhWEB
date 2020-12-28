package Tinhlam;

import java.sql.Timestamp;

public class categories {
	private int id;
	private String name;
	private int parent_id;
	private Timestamp created_at;
	
	public categories(int id, String name, int parent_id, Timestamp created_at) {
		super();
		this.id = id;
		this.name = name;
		this.parent_id = parent_id;
		this.created_at = created_at;
	}
	public categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
