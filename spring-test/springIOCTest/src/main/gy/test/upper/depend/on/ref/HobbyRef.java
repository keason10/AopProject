package gy.test.upper.depend.on.ref;

/**
 * Created by yantao on 2017/3/24.
 */
public class HobbyRef {
    public HobbyRef() {
        System.out.println("HobbyRef init");
    }

    private String hobbyName;

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }
}
