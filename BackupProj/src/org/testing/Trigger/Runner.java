package org.testing.Trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.google.common.collect.Table.Cell;
import java.io.File;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Runner {
	public static void main(String[] args) throws BadLocationException, IOException, BiffException {

		XmlSuite xS = new XmlSuite(); // suite object
		xS.setName("Suite1"); // name set

		XmlTest xT = new XmlTest(xS); // test object

		File f = new File("C:\\Users\\Abhishek\\Desktop\\InputTestCases.xls"); // excel file

		Workbook wk = Workbook.getWorkbook(f);

		Sheet s = wk.getSheet(0);

		int rows = s.getRows();

		ArrayList<XmlClass> al = new ArrayList<XmlClass>();

		for (int i = 1; i < rows; i++) {

			jxl.Cell c = s.getCell(4, i);
			if (c.getContents().equals("Y")) {
				jxl.Cell pkg = s.getCell(2, i);
				jxl.Cell class_name = s.getCell(3, i);

				String v = pkg.getContents() + "." + class_name.getContents();

				XmlClass c1 = new XmlClass(v); // xmlclass

				al.add(c1);

			}

		}

		System.out.println(al.size());

		xT.setClasses(al);

		ArrayList<XmlTest> al2 = new ArrayList<XmlTest>();

		al2.add(xT);

		xS.setTests(al2);

		ArrayList<XmlSuite> al3 = new ArrayList<XmlSuite>();
		al3.add(xS);

		TestNG t = new TestNG();
		t.setXmlSuites(al3);
		t.run();

	}


}
