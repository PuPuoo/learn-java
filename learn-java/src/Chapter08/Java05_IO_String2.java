package Chapter08;

import java.io.*;

public class Java05_IO_String2 {
    public static void main(String[] args) {
        // TODO 字符流

        // 数据源文件对象
        File srcFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word.txt");
        // 数据目的地文件对象 自动生成
        File destFile = new File("D:\\PuPu\\Code\\learn-java\\data\\word_copy.txt");

        // 文件输入流 管到对象
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

            String line = null;

            StringBuilder ss = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }

            // 刷写数据
            writer.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭管道
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (writer != null) {
                writer.close();
            }
        }

    }
}
