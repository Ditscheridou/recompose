/*
 * Copyright 2020 Sebastian Kaspari
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

package recompose.test.utils

import org.junit.Assert.assertEquals
import recompose.composer.Composer
import recompose.parser.ParserImpl

internal fun assertComposing(
    fileName: String,
    expected: String
) {
    val parser = ParserImpl()
    val layout = parser.parse(TestData.load(fileName))

    val composer = Composer()
    val result = composer.compose(layout)

    assertEquals(expected, result)
}
