package Chapter08;

import java.io.File;
import java.io.IOException;

public class Java02_IO {
    public static void main(String[] args) {
        // TODO 文件流

        // TODO File: 文件类型
        // 创建文件对象，使用文件路径关联系统文件
        String filePath = "D:\\PuPu\\Code\\learn-java\\data";
        File file = new File(filePath);
        System.out.println(file);

        // TODO 文件对象的操作
        // 判断当前文件对象是否为文件
        System.out.println(file.isFile());
        // 判断是否为文件夹
        System.out.println(file.isDirectory());
        // 判断文件对象是否存在关联
        System.out.println(file.exists());

        if (file.exists()) {
            // 文件对象存在
            if (file.isFile()) {
                // 文件对象关联的是文件
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                // 文件对象关联的是文件夹
                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());

                // 返回
                String[] list = file.list();
                System.out.println("文件夹中的文件");
                for (String s : list) {
                    System.out.println(s);
                }

                System.out.println("文件夹中的文件对象");
                File[] files = file.listFiles();
                for (File ss : files) {
                    System.out.println(ss);
                }
            }
        }else {
            // 文件对象不存在
            // 创建多级目录
//            file.mkdirs();

            // 创建文件
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
