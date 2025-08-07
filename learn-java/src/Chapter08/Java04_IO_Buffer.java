package Chapter08;

import java.io.*;

public class Java04_IO_Buffer {
    public static void main(String[] args) {
        // TODO 缓冲流
        // 数据源文件对象
        File srcFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word.txt");
        // 数据目的地文件对象 自动生成
        File destFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word_copy.txt");

        // 文件输入流 管到对象
        FileInputStream in = null;
        FileOutputStream out = null;

        // 缓冲输入流 管到对象
        BufferedInputStream buffIn = null;
        BufferedOutputStream buffOut = null;

        // 缓冲区 水桶
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);


            int data;
            while ((data = buffIn.read(cache)) != -1) {
                buffOut.write(cache, 0, data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭管道
            if (buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
