package com.salesianostriana.dam.FinalProject.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.salesianostriana.dam.FinalProject.model.Biometrics;
import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.repositories.ClientRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class ClientService 
	extends BaseServiceImp<Client, Long, ClientRepository>{
	
	public void createPDF() throws FileNotFoundException {
		String outputFolder = System.getProperty("user.home") + "/Downloads/" + File.separator + "planning.pdf";
		
		PdfWriter writer = new PdfWriter(outputFolder);
		PdfDocument pdfDoc = new PdfDocument(writer);
		Document doc = new Document(pdfDoc);
		
		Paragraph p1 = new Paragraph("PLANIFIACIÓN MENSUAL");
		float[] columnWidth = {300f, 300f, 300f, 300f, 300f};
		Table table = new Table(columnWidth);
		
		table.addHeaderCell("");
		for(int i = 0; i < 4; i++) 
			table.addHeaderCell("SEMANA " + (i+1));
		
		table.addHeaderCell("% PESO SEGÚN 1RM");
		for(int i = 6; i < 10; i++) 
			table.addHeaderCell( (i*10) +"%");
		
		table.addCell("");
		table.addCell("");
		table.addCell("LUNES");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Press Banca");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Press Banca Inclinado con Mancuernas");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Aperturas en Polea Alta");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Press Banca cerrado en Multipower");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Extensión de Triceps con cuerda");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("");
		table.addCell("");
		table.addCell("MARTES");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Remo con Barra");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Jalon al Pecho agarre amplio");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Remo unilateral con mancuerna");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Pull Over");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Curl de Biceps Alterno Con mancuerna");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("Curl de martillo con Mancuerna");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("");
		table.addCell("");
		table.addCell("MIERCOLES");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Sentadilla Libre Barra Alta");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Prensa puntas cerradas");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Extensión de Cuadriceps");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Jaca");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Gemelo de pie");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("");
		table.addCell("");
		table.addCell("JUEVES");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Press Militar con mancuerna");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Elevaciones Laterales con mancuerna");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Face Pull");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Elevaciones Frontales en Polea");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Deltoides posterior en polea alta");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("Elevaciones laterales en máquina");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("");
		table.addCell("");
		table.addCell("VIERNES");
		table.addCell("");
		table.addCell("");
		
		
		table.addCell("");
		table.addCell("");
		table.addCell("DESCANSO");
		table.addCell("");
		table.addCell("");
		
		table.addCell("");
		table.addCell("");
		table.addCell("SABADO");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Press Plano en Máquina");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Jalon Al Pecho agarre neutro cerrado");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Press Superior en maquina");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Remo en máquina");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Press Declinado");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("Jalon unilateral en polea alta");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		table.addCell("");
		table.addCell("");
		table.addCell("DOMINGO");
		table.addCell("");
		table.addCell("");
		
		table.addCell("Peso Muerto Rumano");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Hip Thrust");
		table.addCell("3x10-12");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		table.addCell("3x8-10");
		
		table.addCell("Curl Femoral De pie en polea");
		table.addCell("3x10-12");
		table.addCell("3x10");
		table.addCell("3x10");
		table.addCell("3x10");
		
		table.addCell("Empuje de cadera con polea");
		table.addCell("4x10-12");
		table.addCell("4x8-10");
		table.addCell("4x6-8");
		table.addCell("4x8-10");
		
		table.addCell("Abductor en maquina");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		table.addCell("4x10-12");
		
		
		doc.add(p1);
		doc.add(table);
		doc.close();
		
	}
	public double calculateIMC(Biometrics bio) {
		double heightM = (double)bio.getHeightCm()/100;
		return (double)bio.getBw()/Math.pow(heightM, 2);
	}
	public double calculateFatPercent(Biometrics bio) {
		
		int age = LocalDate.now()
				.minusYears(bio.getClienteF()
						.getBirthDate()
						.getYear())
				.getYear();
		switch (bio.getClienteF().getGender()) {
			case 'F':
				return (1.20 * calculateIMC(bio))+ (0.23 * age) - 5.4;
			case 'M':
				return (1.20 * calculateIMC(bio)) + (0.23 * age) - 16.2;
			default:
				return 0;
					
		}
		
	}

}
