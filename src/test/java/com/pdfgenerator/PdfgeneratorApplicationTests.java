package com.pdfgenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfgenerator.util.PDFGenerator;

@SpringBootTest
class PdfgeneratorApplicationTests {

	@Test
	void contextLoads() {
		PDFGenerator pdf = new PDFGenerator();
		pdf.writeUsingIText();
	}

}
