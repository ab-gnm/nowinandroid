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

package com.google.samples.apps.nowinandroid.feature.bookmarks.di

import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigatorImpl
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigator
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksRoute
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
internal interface BookmarksSingletonModule {
    companion object {
        @Provides
        @IntoMap @ClassKey(BookmarksRoute::class)
        fun provideBookmarksNavigator(): BookmarksNavigator = BookmarksNavigatorImpl()
    }
}