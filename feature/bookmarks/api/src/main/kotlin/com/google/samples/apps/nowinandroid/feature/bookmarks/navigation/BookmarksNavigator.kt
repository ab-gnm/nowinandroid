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

package com.google.samples.apps.nowinandroid.feature.bookmarks.navigation

import androidx.compose.runtime.Stable
import com.google.samples.apps.nowinandroid.core.navigation.NiaBaseNavigator
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigator.Actions

/**
 * Navigator for the bookmarks feature.
 */
interface BookmarksNavigator: NiaBaseNavigator<BookmarksRoute, Actions, Unit> {
    /**
     * Actions hoisted up from Bookmarks screen.
     */
    class Actions(
        val onTopicClick: (String) -> Unit,
        val onShowSnackbar: suspend (String, String?) -> Boolean,
    )
}