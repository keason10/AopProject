package gy.test.upper;

/**
 * Created by yantao on 2017/3/24.
 */
public abstract class AbstractFactory {
    private Student student;
    public void showStudentInfo(String show) {
        student = initStudent();
        System.out.println(show);
        System.out.println("before:"+student.toString());
        student.setId(555555L);
        student.setName("555555");
        System.out.println("end:"+student.toString());
    }

    public abstract Student initStudent();
}
