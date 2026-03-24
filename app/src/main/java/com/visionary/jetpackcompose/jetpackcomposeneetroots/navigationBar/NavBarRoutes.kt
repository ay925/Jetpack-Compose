package com.visionary.jetpackcompose.jetpackcomposeneetroots.navigationBar

import kotlinx.serialization.Serializable
@Serializable
sealed class NavBarRoutes {

    @Serializable
    object Home : NavBarRoutes()

    @Serializable
    object Search : NavBarRoutes()

    @Serializable
    object Notifications : NavBarRoutes()

    @Serializable
    object Profile : NavBarRoutes()
    }