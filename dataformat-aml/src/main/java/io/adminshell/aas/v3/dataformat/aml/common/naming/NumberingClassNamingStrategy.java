/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package io.adminshell.aas.v3.dataformat.aml.common.naming;

import io.adminshell.aas.v3.dataformat.core.ReflectionHelper;
import java.util.HashMap;
import java.util.Map;

public class NumberingClassNamingStrategy extends AbstractClassNamingStrategy {

    private final Map<Class<?>, Integer> counter = new HashMap<>();

    public NumberingClassNamingStrategy() {
        super();
    }

    public NumberingClassNamingStrategy(boolean preferIdShort) {
        super(preferIdShort);
    }

    @Override
    protected String generateName(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> type = ReflectionHelper.getAasInterface(obj.getClass());
        if (!counter.containsKey(type)) {
            counter.put(type, 0);
        }
        counter.put(type, counter.get(type) + 1);
        return type.getSimpleName() + "_" + counter.get(type);
    }
}
