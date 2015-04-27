package io.rainfall.statistics;

import io.rainfall.TestException;

import org.HdrHistogram.Histogram;

import java.util.Set;

/**
 * @author Aurelien Broszniowski
 */
public class InitStatisticsHolder<E extends Enum<E>> implements StatisticsHolder<E> {

  private RuntimeStatisticsHolder<E> statisticsHolder;

  public InitStatisticsHolder(RuntimeStatisticsHolder<E> statisticsHolder) {
    this.statisticsHolder = statisticsHolder;
  }

  @Override
  public Enum<E>[] getResultsReported() {
    throw new UnsupportedOperationException("Should not be implemented");
  }

  @Override
  public Set<String> getStatisticsKeys() {
    throw new UnsupportedOperationException("Should not be implemented");
  }

  @Override
  public Statistics<E> getStatistics(final String name) {
    throw new UnsupportedOperationException("Should not be implemented");
  }

  @Override
  public Histogram getHistogram(final Enum<E> result) {
    throw new UnsupportedOperationException("Should not be implemented");
  }

  @Override
  public void measure(final String name, final FunctionExecutor functionExecutor) throws TestException {
    statisticsHolder.addStatistics(name, new Statistics<E>(name, statisticsHolder.getResultsReported()));
  }
}
