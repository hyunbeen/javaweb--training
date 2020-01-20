package info;

public class Info {
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		String gender = "";
		char sung = id.charAt(7);
		if(sung == '1' || sung=='3' || sung=='9') gender = "남정네";
		else gender = "여편네";
		return gender;
	}
}
