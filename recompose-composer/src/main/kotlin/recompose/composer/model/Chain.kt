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

package recompose.composer.model

import com.jds.recompose.nodes.ViewNode
import com.jds.recompose.values.Constraints


/**
 * Data class holding information about a chain of a `ConstraintLayout`.
 */
internal data class Chain(
    val direction: Direction,
    val head: ViewNode,
    val elements: Set<ViewNode>,
    val style: Constraints.Chain.Style? = null
) {
    enum class Direction {
        HORIZONTAL,
        VERTICAL
    }
}
