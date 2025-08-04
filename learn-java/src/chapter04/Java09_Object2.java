package chapter04;

public class Java09_Object2 {
    OuterClass outerClass = new OuterClass();
    // 内部类，就当做外部类的属性使用即可
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
}

class OuterClass{
    public class InnerClass{

    }
}
