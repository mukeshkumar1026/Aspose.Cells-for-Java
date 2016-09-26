package com.aspose.cells.examples.RowsColumns;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class AutoFitRowsinaRangeofCells {

	public static void main(String[] args) throws Exception {
		// ExStart:AutoFitRowsinaRangeofCells
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AutoFitRowsinaRangeofCells.class) + "RowsColumns/";

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "workbook.xls");

		// Accessing the first worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Auto-fitting the 3rd row of the worksheet
		worksheet.autoFitRow(1, 0, 5);

		// Saving the modified Excel file in default (that is Excel 2003) format
		workbook.save(dataDir + "AutoFitRowsinaRangeofCells_out.xls");

		// Print message
		System.out.println("Row auto fit successfully.");
		// ExEnd:AutoFitRowsinaRangeofCells
	}
}