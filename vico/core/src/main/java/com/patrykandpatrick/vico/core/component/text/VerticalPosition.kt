/*
 * Copyright 2023 by Patryk Goworowski and Patrick Michalik.
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

package com.patrykandpatrick.vico.core.component.text

/**
 * Defines the vertical position of a drawn object relative to a given point.
 */
public enum class VerticalPosition {
    Top,
    Center,
    Bottom,
    ;

    /**
     * Returns the inverse of this [VerticalPosition].
     */
    public fun negative(): VerticalPosition =
        when (this) {
            Top -> Bottom
            Center -> Center
            Bottom -> Top
        }
}
