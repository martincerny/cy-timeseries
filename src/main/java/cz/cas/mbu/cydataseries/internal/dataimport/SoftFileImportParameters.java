package cz.cas.mbu.cydataseries.internal.dataimport;

import cz.cas.mbu.cydataseries.internal.dataimport.SoftFile.SoftTable;

public class SoftFileImportParameters {
	private SoftTable selectedTable;
	private DataSeriesImportParameters dataSeriesImportParameters;		
		
	
	
	public SoftTable getSelectedTable() {
		return selectedTable;
	}
	public void setSelectedTable(SoftTable selectedTable) {
		this.selectedTable = selectedTable;
	}
	public DataSeriesImportParameters getDataSeriesImportParameters() {
		return dataSeriesImportParameters;
	}
	public void setDataSeriesImportParameters(DataSeriesImportParameters dataSeriesImportParameters) {
		this.dataSeriesImportParameters = dataSeriesImportParameters;
	}
	
	
}
