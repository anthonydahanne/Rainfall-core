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

package io.rainfall.statistics;

/**
 * An Function that defines the Operation task that can be measured.
 *
 * This type of function is not thread-safe, it is instantiated once per Operation, the logic
 * executed inside of the apply() method should account for this when using the parameters.
 *
 * @author Aurelien Broszniowski
 */

public abstract class OperationFunction<E extends Enum<E>> {

  protected FunctionExecutor<E> functionExecutor = new FunctionExecutor<E>(this);

  public abstract E apply() throws Exception;
}
