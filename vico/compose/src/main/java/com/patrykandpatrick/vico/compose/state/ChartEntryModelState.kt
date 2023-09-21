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

package com.patrykandpatrick.vico.compose.state

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.patrykandpatrick.vico.core.entry.ChartEntryModel

internal class ChartEntryModelState<T : ChartEntryModel> : State<Pair<T?, T?>> {
    private var previousValue: T? = null

    override var value by mutableStateOf<Pair<T?, T?>>(null to null)
        private set

    fun set(value: T) {
        val currentChartEntryModel = this.value.first
        if (value.id != currentChartEntryModel?.id) previousValue = currentChartEntryModel
        this.value = value to previousValue
    }
}
