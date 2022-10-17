package lesson_3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        /*File dir = new File("dirs");
        File file = new File("dirs/somefile.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*File file = new File("dirs");
        String[] list = file.list();
        for (String n: list){
            System.out.println(n);
        }*/

        /*File file = new File("dirs");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("s");
            }
        });

        for (String n: list){
            System.out.println(n);
        }*/

        /*File file = new File("dirs/gofile.txt");
        System.out.println(file.renameTo(new File("dirs/abc.txt")));*/

        /*InputStream inputStream = new FileInputStream("dirs/file.txt");

        InputStream url = new URL("http://google.com").openStream();

        InputStream array = new ByteArrayInputStream(new byte[]{90, 52, 73, 75, 81, 90});

        *//*while(true){
//            int read = inputStream.read();
//            int read = url.read();
            int read = array.read();
            if (read != -1){
                System.out.print((char)read);
            } else break;
        }*//*

        long time = System.currentTimeMillis();
        byte[] buffer = new byte[500];

        while(true){
//            int read = inputStream.read(buffer);
//
//            if (read != -1){
//                System.out.println("read = " + read + "   buffer= " + Arrays.toString(buffer) + " str = " + new String(buffer, 0, read, StandardCharsets.UTF_8));
//            } else break;
            int read = inputStream.read(buffer);
            if (read != -1){
                System.out.println(new String(buffer, 0, read, StandardCharsets.UTF_8));
            } else break;
        }*/


        /*BufferedReader bufferedReader = null;
        FileReader fr = null;

        fr = new FileReader("dirs/file.txt");
        bufferedReader = new BufferedReader(fr);

        String currentLine;

        while((currentLine = bufferedReader.readLine()) != null){
            System.out.println(currentLine);
        }

        bufferedReader.close();
        fr.close();*/


        /*RandomAccessFile randomAccessFile = new RandomAccessFile("dirs/file.txt", "rw");
        randomAccessFile.seek(100);
        System.out.println((char) randomAccessFile.read());*/

        ArrayList<InputStream> inputStreamArrayList = new ArrayList<>();
        inputStreamArrayList.add(new FileInputStream("dirs/abc.txt"));
        inputStreamArrayList.add(new FileInputStream("dirs/file.txt"));

        SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(inputStreamArrayList));
        int x;
        while((x = sequenceInputStream.read()) != -1){
            System.out.print((char) x);
        }

        sequenceInputStream.close();
    }
}
