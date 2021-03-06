package cz.cas.mbu.cydataseries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * An interface for all data series whose data is floating-point numeric
 * @author Martin
 *
 * @param <INDEX>
 */
public interface DoubleDataSeries<INDEX> extends DataSeries<INDEX, Double>{
	/**
	 * First array index corresponds to the row and second to the columns (indices). 
	 * @return
	 */
	public double[][] getDataArray();
	
	default  Class<Double> getDataClass()
	{
		return Double.class;
	}
	
	default List<Double> getRowData(int row)
	{
		return DoubleStream.of(getDataArray()[row])
				.boxed()
				.collect(Collectors.toList()); 
	}

	default double[] getRowDataArray(int row)
	{
		return getDataArray()[row];
	}
}
