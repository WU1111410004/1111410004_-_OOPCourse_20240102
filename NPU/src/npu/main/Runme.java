package npu.main;
import npu.classroom.*;
import npu.course.*;
import npu.person.*;

public class Runme {

	public static void main(String[] args) {
		/*PcRoom E612 = new PcRoom(51,"Windows 11");
		System.out.printf("Pc Room E612 is :%s", E612.toString());*/
		
		Teacher Xteacher = new Teacher("Mark Chen");
		DepCourse Economics = new DepCourse("Economics",3,Xteacher);
		System.out.printf("Course is :%s", Economics.toString());
	}

}
