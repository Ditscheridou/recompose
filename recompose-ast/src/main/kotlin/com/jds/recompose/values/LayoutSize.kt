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

package com.jds.recompose.values

import com.jds.recompose.attributes.Attribute

/**
 * Layout sizes that are used with `android:layout_width` or `android:layout_height`.
 */
sealed class LayoutSize : Attribute {
    object MatchParent : LayoutSize() {
        override fun toString(): String {
            return "MatchParent"
        }
    }

    object WrapContent : LayoutSize() {
        override fun toString(): String {
            return "WrapContent"
        }
    }

    data class Absolute(val size: Size) : LayoutSize()
}
