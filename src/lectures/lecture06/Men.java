package lectures.lecture06;

public class Men {
    String name;
    int code;
    public Men(){

    }

    @Override
    public boolean equals(Object obj) {
        Men men = (Men) obj;
        return code == men.code;
    }
}
