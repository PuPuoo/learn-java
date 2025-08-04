package chapter04;

/*
    ✅ TODO JavaBean 的核心规范有三个：
    类必须是 public 的，并且有一个无参构造函数

    所有属性必须是 private 的

    通过 getXxx() 和 setXxx() 方法来访问和设置属性
 */

public class Java15_Object {
    public static void main(String[] args) {
        // TODO bean规范

    }
}

class Person15 {
    private String name;
    private int age;

    // 必须有一个无参构造器
    public Person15() {}

    // Getter 和 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}





