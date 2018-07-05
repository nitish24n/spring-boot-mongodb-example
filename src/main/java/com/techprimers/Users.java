package com.techprimers;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class Users {
	
	@Id
	private String userid;
	private String name;
	private String teamName;
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", name=" + name + ", teamName=" + teamName + ", salary=" + salary + "]";
	}

	private Long salary;
	
	public Users( String userid,String name, String teamName, Long salary) {
		super();
		this.userid=userid;
		this.name = name;
		this.teamName = teamName;
		this.salary = salary;
	}

	public String getId() {
		return userid;
	}

	public void setId(String id) {
		this.userid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
}
