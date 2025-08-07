package chapter07;

import java.util.ArrayList;

public class Java05_Collection {
    public static void main(String[] args) {
        // TODO 泛型
        ArrayList<User5> list = new ArrayList<>();
        list.add(new User5());

    }
}

class User5 {
    public void test() {
        System.out.println("user...");
    }
}