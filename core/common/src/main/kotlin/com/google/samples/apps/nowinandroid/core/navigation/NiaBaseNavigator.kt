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

package com.google.samples.apps.nowinandroid.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions

/**
 * Generic interface for a route destination.
 *
 * @param Route Generic type representing the class for the route
 * @param Actions Generic type representing the class for the actions/callbacks that may need
 * hoisting from the destination.
 * @param Properties Generic type representing the class for the properties that may need to be
 * passed down to the destination.
 */
interface NiaBaseNavigator<Route, Actions, Properties> {
    /**
     * Navigates to the [route] with the given [navOptions].
     */
    fun navigateToRoute(
        navController: NavController,
        route: Route,
        navOptions: NavOptions?,
    )

    /**
     * Creates the destination component/subgraph. Callbacks/slots are hoisted as part of [actions],
     * and properties are passed down as part of [properties].
     */
    fun screen(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        actions: Actions,
        properties: Properties
    )
}