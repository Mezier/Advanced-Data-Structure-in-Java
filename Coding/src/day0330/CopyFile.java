package day0330;

import java.io.*;

public class CopyFile {
    public static void copy(String path1, String path2) throws Exception {
        File src = new File(path1);
        if (!(src.exists() && src.isDirectory())) {
            throw new Exception("the file path isn't exist");
        }
        File[] files = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });
        File des = new File(path2);
        if (!des.exists()) {
            des.mkdir();
        }
        for (File f : files) {
            FileInputStream fi = new FileInputStream(f);
            String desFile = f.getName().replaceAll("\\.txt$", ".doc");
            FileOutputStream fo = new FileOutputStream(new File(des, desFile));
            copyFile(fi, fo);
            fi.close();
            fo.close();
        }
    }

    public static void copyFile(InputStream fi, OutputStream fo) throws IOException {
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = fi.read(buf)) != -1) {
            fo.write(buf, 0, len);
        }
    }

    public static void main(String[] args) throws Exception {
        copy("F:\\javaStudy", "F:\\javaStudy\\test");
    }
}
