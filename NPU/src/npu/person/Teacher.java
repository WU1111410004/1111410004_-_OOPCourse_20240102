package npu.person;

public class Teacher {
	private String TeaName;

	public String getTeaName() {
		return TeaName;
	}

	public void setTeaName(String teaName) {
		TeaName = teaName;
	}
	public Teacher() {}
	public Teacher(String teaName) {
		this.TeaName = teaName;
	}

	@Override
	public String toString() {
		return "TeacherName :" + TeaName;
	}
	
}
