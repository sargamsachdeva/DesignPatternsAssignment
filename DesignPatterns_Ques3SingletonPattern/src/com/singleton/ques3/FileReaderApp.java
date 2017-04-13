package com.singleton.ques3;

import java.io.*;

public class FileReaderApp {

    private static FileReaderApp instance = null;
    private static Object mutex = new Object();


    private FileReaderApp() {}


    public static FileReaderApp getInstance() {

        if (instance == null) {
            synchronized (mutex) {
                if (instance == null) instance = new FileReaderApp();
            }
        }
        return instance;
    }

    public static void readFile() {

        try {
            FileReader fr = new FileReader("test.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        }

        catch (Exception e){}
    }

    public static void appendToFile(String data) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            File file = new File("test.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(data);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }
}
