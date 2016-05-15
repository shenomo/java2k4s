package main.ilyazamkovoy.view;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zamkovoyilya on 12/05/16.
 */
public class PDFView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Table table = new Table(3);
        table.addCell("\t$" + "\n\t");
        table.addCell("\tExpenses" + "\n\t");
        table.addCell("\tValue" + "\n\t");
        table.addCell("\t1" + "\n\t");
        table.addCell("\tSalary" + "\n\t");
        table.addCell("\t" + model.get("salary").toString() + "\n\t");
        table.addCell("\t2" + "\n\t");
        table.addCell("\tRent" + "\n\t");
        table.addCell("\t" + model.get("rent").toString() + "\n\t");
        table.addCell("\t3" +"\n\t");
        table.addCell("\tSum" +"\n\t");
        table.addCell("\t" + model.get("sum").toString() + "\n\t");
        document.add(table);
    }

}
