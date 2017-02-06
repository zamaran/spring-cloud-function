/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function.compiler.proxy;

import java.util.function.Supplier;

import org.springframework.cloud.function.compiler.SupplierCompiler;
import org.springframework.core.io.Resource;

/**
 * @author Mark Fisher
 */
public class LambdaCompilingSupplier<T> extends AbstractLambdaCompilingProxy<Supplier<T>> implements Supplier<T> {

	public LambdaCompilingSupplier(Resource resource, SupplierCompiler<T> compiler) {
		super(resource, compiler);
	}

	@Override
	public T get() {
		return this.getTarget().get();
	}
}
