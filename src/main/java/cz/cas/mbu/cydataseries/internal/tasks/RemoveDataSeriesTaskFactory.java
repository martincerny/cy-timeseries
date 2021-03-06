package cz.cas.mbu.cydataseries.internal.tasks;

import org.cytoscape.work.AbstractTaskFactory;
import org.cytoscape.work.TaskIterator;

import cz.cas.mbu.cydataseries.DataSeriesManager;

public class RemoveDataSeriesTaskFactory extends AbstractTaskFactory {

	private final DataSeriesManager dataSeriesManager;

	public RemoveDataSeriesTaskFactory(DataSeriesManager dataSeriesManager) {
		super();
		this.dataSeriesManager = dataSeriesManager;
	}

	@Override
	public boolean isReady() {
		return !dataSeriesManager.getAllDataSeries().isEmpty();
	}

	@Override
	public TaskIterator createTaskIterator() {
		return new TaskIterator(new RemoveDataSeriesTask(dataSeriesManager));
	}
	
}
