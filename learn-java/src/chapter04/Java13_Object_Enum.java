package chapter04;

public class Java13_Object_Enum {
    public static void main(String[] args) {
        // TODO 枚举 enum
        // 枚举是一个特殊的类，其中包含了一组特定的对象，这些对象不会发生改变
        System.out.println(City.WUHAN.name);

    }
}

enum City {
    // 对象
    BEIJING("北京", 1001), SHANGHAI("上海", 1002), WUHAN("武汉", 1003);

    public  String name;
    public  int code;

    City(String name, int code) {
        this.name = name;
        this.code = code;
    }

}
