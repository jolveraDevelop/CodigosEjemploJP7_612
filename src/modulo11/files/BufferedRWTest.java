/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo11.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Humberto Banuelos
 */
public class BufferedRWTest {

    public static void main(String[] args) {
        String source = "home/foo/bar/index.html";
        String dest = "home/foo/index.html";

        try (
            BufferedReader br = Files.newBufferedReader(Paths.get(source), Charset.forName("UTF-8"));
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(dest), Charset.forName("UTF-8"));) {
            String record;
            while (((record = br.readLine()) != null)) {
                bw.write(record);
                //bw.write("\r\n");
                bw.newLine();
            }
            //Files.delete(Paths.get(source));

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
