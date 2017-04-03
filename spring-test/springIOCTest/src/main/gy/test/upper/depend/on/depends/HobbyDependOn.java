package gy.test.upper.depend.on.depends;

/**
 * Created by yantao on 2017/3/24.
 */
public class HobbyDependOn {
    public HobbyDependOn() {
        System.out.println("HobbyDependOn init");
    }

    private String hobbyName;

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }
}
