package pojo;

public class Team {
	private Integer no_of_players;
	private String name;
	
	public void plays() {
		System.out.println("plays");
	}
	
	public Integer getNo_of_players() {
		return no_of_players;
	}
	public void setNo_of_players(Integer no_of_players) {
		this.no_of_players = no_of_players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
