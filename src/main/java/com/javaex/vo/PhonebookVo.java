package com.javaex.vo;

public class PhonebookVo {
	//필드
	private String person_id;
	private String name;
	private String hp;
	private String company;
	
	//생성자
	public PhonebookVo() {
		super();
	}

	public PhonebookVo(String person_id, String name, String hp, String company) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	//메소드-gs
	public String getPerson_id() {
		return person_id;
	}
	
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	
	//메소드-일반
	@Override
	public String toString() {
		return "PhonebookVo [person_id=" + person_id + ", name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	

}
