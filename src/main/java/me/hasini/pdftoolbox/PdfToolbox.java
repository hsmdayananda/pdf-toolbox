package me.hasini.pdftoolbox;

import java.io.IOException;

public class PdfToolbox {


    public static void main(String[] args) throws IOException {


        PdfSplitter pdfSplitter =new PdfSplitter();
        pdfSplitter.splitPdf("/Users/kdinesh/Downloads/ER-00003.pdf","pdf");
    }
}
