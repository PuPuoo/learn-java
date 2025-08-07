package Chapter08;

import java.io.*;

public class Java03_IO_Copy {
    public static void main(String[] args) {
        // TODO 文件复制

        // 数据源文件对象
        File srcFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word.txt");
        // 数据目的地文件对象 自动生成
        File destFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word_copy.txt");

        // 文件输入流 管到对象
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            /*// 打开阀门，流转数据 输入
            int data = in.read();
            // 打开阀门，流转数据 输出
            out.write(data);*/

            // read 一个一个的读
            // 如果文件数据已经全部读取完毕后，再去读取数据，则读到的是-1
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭管道
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
