package npu.course;
import npu.person.*;

public class DepCourse {
	private String _CourseName;
	private int _CourseCredit;
	Teacher tea01;
	
	public String get_CourseName() {
		return _CourseName;
	}
	public void set_CourseName(String _CourseName) {
		this._CourseName = _CourseName;
	}
	public int get_CourseCredit() {
		return _CourseCredit;
	}
	public void set_CourseCredit(int _CourseCredit) {
		this._CourseCredit = _CourseCredit;
	}
	public Teacher getTea01() {
		return tea01;
	}
	public void setTea01(Teacher tea01) {
		this.tea01 = tea01;
	}
	public DepCourse() {}
	public DepCourse(String _CourseName, int _CourseCredit, Teacher tea01) {
		this._CourseName = _CourseName;
		this._CourseCredit = _CourseCredit;
		this.tea01 = tea01;
	}
	@Override
	public String toString() {
		return "DepCourse [CourseName=" + _CourseName + ", CourseCredit=" + _CourseCredit + ", Teacher=" + tea01.toString() + "]";
	}
	
}
