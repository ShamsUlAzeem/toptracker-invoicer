package io.blackpebble;

import com.itextpdf.html2pdf.HtmlConverter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        String filePath = "src/main/resources/sample-input.html";
        String outFile = "src/main/resources/sample-output.pdf";

        HtmlConverter.convertToPdf(new FileInputStream(filePath), new FileOutputStream(outFile));
    }
}

