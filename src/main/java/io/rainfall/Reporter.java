/*
 * Copyright 2014 Aurélien Broszniowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rainfall;

import io.rainfall.statistics.StatisticsHolder;
import io.rainfall.statistics.StatisticsPeekHolder;

import java.util.List;

/**
 * A reporter is a class that will send the metrics to some output (text, file, etc.)
 *
 * @author Aurelien Broszniowski
 */

public abstract class Reporter<E extends Enum<E>> {

  public abstract void header(final List<String> description);

  public abstract void report(final StatisticsPeekHolder<E> statisticsHolder);

  public abstract void summarize(final StatisticsHolder<E> statisticsHolder);

}
