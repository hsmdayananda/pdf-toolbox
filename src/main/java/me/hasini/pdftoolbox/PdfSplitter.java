package me.hasini.pdftoolbox;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class PdfSplitter {

    public void splitPdf(String filename, String extension) throws IOException {
        PDDocument source = PDDocument.load(new File(filename));


        for (int page = 0; page < source.getNumberOfPages(); page++) {

            PDDocument target=new PDDocument();
            target.addPage(source.getPage(0));
            target.save("src/main/resources/"+page);
        }
        source.close();
    }
}
