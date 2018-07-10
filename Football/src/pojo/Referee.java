package pojo;

public class Referee {
	private String rname;
	private Integer age;
	
	public void gives_fouls() {
		System.out.println("gives_fouls");
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
