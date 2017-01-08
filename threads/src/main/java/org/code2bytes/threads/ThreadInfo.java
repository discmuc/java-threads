//
// Copyright 2017 code2bytes.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package org.code2bytes.threads;

/**
 * This class helps to evaluate the runtime environment for threaded applications.
 *
 * @author Dieter Scholz
 * @since Jan 6, 2017
 */
public final class ThreadInfo {

    /**
     * Private constructor.
     */
    private ThreadInfo() {
        // empty
    }

    /**
     * Returns the number of processors.
     *
     * @return number of processors
     */
    public static int getNumberOfProcessors() {
        return Runtime.getRuntime().availableProcessors(); // NOPMD
    }

    /**
     * Returns the name of the current thread.
     *
     * @return threat name
     */
    public static String getCurrentThreadName() {
        return Thread.currentThread().getName(); // NOPMD
    }

    /**
     * Returns the priority of the current threat.
     *
     * @return threat priority
     */
    public static int getCurrentThreadPriority() {
        return Thread.currentThread().getPriority(); // NOPMD
    }
}
