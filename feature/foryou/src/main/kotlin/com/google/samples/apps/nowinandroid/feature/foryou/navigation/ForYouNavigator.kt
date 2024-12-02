/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.feature.foryou.navigation

import androidx.navigation.NavGraphBuilder
import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.feature.foryou.navigation.ForYouNavigator.Actions
import kotlinx.serialization.Serializable

// Assume that this file lives in `:api` module

@Serializable
data object ForYouBaseRoute // route to base navigation graph

/**
 * Navigator for the ForYou feature.
 */
interface ForYouNavigator: NiaNavigator<ForYouBaseRoute, Actions, Unit> {
    /**
     * Actions & slots hoisted up from ForYou screen.
     * @property onTopicClick - Called when a topic is clicked, contains the ID of the topic
     * @property topicDestination - Destination for topic content
     */
    class Actions(
        val onTopicClick: (String) -> Unit,
        val topicDestination: (NavGraphBuilder) -> Unit,
    )
}