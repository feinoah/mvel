
/**
 * MVEL (The MVFLEX Expression Language)
 *
 * Copyright (C) 2007 Christopher Brock, MVFLEX/Valhalla Project and the Codehaus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.mvel.optimizers;

public class OptimizationNotSupported extends RuntimeException {

    public OptimizationNotSupported() {
        super();
    }

    public OptimizationNotSupported(String message) {
        super(message);
    }

    public OptimizationNotSupported(String message, Throwable cause) {
        super(message, cause);
    }

    public OptimizationNotSupported(Throwable cause) {
        super(cause);
    }
}
