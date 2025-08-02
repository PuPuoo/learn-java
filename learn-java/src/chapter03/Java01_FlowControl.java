package chapter03;

public class Java01_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制
        // 1. 顺序执行
        int i = 10;
        int j = 20;
        System.out.println(i + j);

        // 2. 分支执行
        // 单分支
        int k = 40;
        if (k == 20) {
            System.out.println("分支");
        }
        System.out.println("最后一步");

        // 双分支
        if (k == 10) {
            System.out.println("分支1");
        } else {
            System.out.println("分支2");
        }

        // 多分支
        if (k == 20){
            System.out.println("分支1");
        } else if (k == 10){
            System.out.println("分支2");
        } else {
            System.out.println("分支3");
        }

        // 特殊多分支
        switch (k) {
            case 10:
                System.out.println("分支1");
            case 20:
                System.out.println("分支2");
                break;
            case 30:
                System.out.println("分支3");
            default:
                System.out.println("其他分支");
        }
    }
}
