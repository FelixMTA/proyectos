/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import entidades.Empleado;
import entidades.Pedido;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.Conexion;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author felix
 */
public class PDF {

    Conexion c = new Conexion();
    List<Pedido> pedidos = c.obtenerPedido();
    

    public void nuevoPDF(String inicio, String Fin, String Usuario) {

        try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();

                cont.setFont(PDType1Font.TIMES_ROMAN, 15);
                cont.setLeading(14.5f);

                cont.newLineAtOffset(25, 700);

                for (Pedido pedido : pedidos) {
                    System.out.println("pedido.getHoraInicio(): " + pedido.getHoraInicio());
                    System.out.println("inicio: " + inicio);
                    if (pedido.getHoraInicio() != null && inicio != null && !pedido.getHoraInicio().isEmpty() && !inicio.isEmpty()) {

                        String[] HoraInicio = pedido.getHoraInicio().replaceAll(" ", "").split(":");

                        String[] HoraInicioInput = inicio.replaceAll(" ", "").split(":");

                        if (Integer.valueOf(HoraInicio[0]) == Integer.valueOf(HoraInicioInput[0])
                                && Integer.valueOf(HoraInicio[1]) == Integer.valueOf(HoraInicioInput[1])
                                && Integer.valueOf(HoraInicio[2]) == Integer.valueOf(HoraInicioInput[2])) {
                            if (pedido.getNumeroEmpleado() == Integer.parseInt(Usuario)) {
                                String line1 = ("Estatus: " + pedido.getEstatus() + " INICIO " + pedido.getHoraInicio()
                                        + " FINAL:" + pedido.getHoraFinal() + " Empledado: " + pedido.getNumeroEmpleado());
                                cont.showText(line1 + "                                                   ");
                            }
                        }
                    }

                }

                cont.newLine();

                cont.endText();
            }

            doc.save("CREATED_PDF");
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pdfUsuario(String Usuario) throws IOException {

        try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();

                cont.setFont(PDType1Font.TIMES_ROMAN, 15);
                cont.setLeading(14.5f);

                cont.newLineAtOffset(25, 700);

                for (Pedido pedido : pedidos) {
                   
                      

                            if (pedido.getNumeroEmpleado() == Integer.parseInt(Usuario)) {
                                String line1 = ("Estatus: " + pedido.getEstatus() + " INICIO " + pedido.getHoraInicio()
                                        + " FINAL:" + pedido.getHoraFinal() + " Empledado: " + pedido.getNumeroEmpleado());
                                cont.showText(line1 + "                                                   ");
                                  cont.newLine();
                            }
                        }
                 cont.endText();
                    }

          
            doc.save("Usuario_PDF");
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void pdfTodo() throws IOException {

        try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();

                cont.setFont(PDType1Font.TIMES_ROMAN, 15);
                cont.setLeading(14.5f);

                cont.newLineAtOffset(25, 700);

                for (Pedido pedido : pedidos) {
                   
              
                           
                                String line1 = ("Estatus: " + pedido.getEstatus() + " INICIO " + pedido.getHoraInicio()
                                        + " FINAL:" + pedido.getHoraFinal() + " Empledado: " + pedido.getNumeroEmpleado());
                                cont.showText(line1 + "                                                   ");
                                  cont.newLine();
                            
                        }
                 cont.endText();
                    }

          
            doc.save("Todo_pdf");
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
