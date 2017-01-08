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

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Tests for the {@link ThreadInfo} class.
 *
 * @author Dieter Scholz
 * @since Jan 6, 2017
 */
public class ThreadInfoTest {

    /**
     * Test if number of processors is greater than 0.
     *
     * @throws Exception
     */
    @Test
    public void testGetNumberOfProcessors() throws Exception {
        assertThat("number of processors should be larger than 0", ThreadInfo.getNumberOfProcessors(),
                is(greaterThan(0)));
    }

    /**
     * Test getting the thread name.
     *
     * @throws Exception
     */
    @Test
    public void testGetCurrentThreadName() throws Exception {
        assertThat("thread name should be main", ThreadInfo.getCurrentThreadName(), is(equalTo("main")));
    }

    /**
     * Test valid thread priority.
     *
     * @throws Exception
     */
    @Test
    public void testGetCurrentThreadPriority() throws Exception {
        assertThat("test priority should be valid", ThreadInfo.getCurrentThreadPriority(),
                is(both(greaterThanOrEqualTo(Thread.MIN_PRIORITY)).and(lessThanOrEqualTo(Thread.MAX_PRIORITY))));
    }
}
