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
 * Main class to execute the main method.
 *
 * @author Dieter Scholz
 * @since Jan 6, 2017
 */
public final class Main { // NOPMD

    /**
     * Private constructor.
     */
    private Main() {
        // empty
    }

    /**
     * Main method of the threads application.
     *
     * @param args
     *            command line parameters
     */
    public static void main(final String[] args) {
        System.out.println(ThreadInfo.getNumberOfProcessors()); // NOPMD
        System.out.println(ThreadInfo.getCurrentThreadName()); // NOPMD
        System.out.println(ThreadInfo.getCurrentThreadPriority()); // NOPMD
    }

}
