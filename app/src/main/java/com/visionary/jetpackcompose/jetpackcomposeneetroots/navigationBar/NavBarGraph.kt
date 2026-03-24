package com.visionary.jetpackcompose.jetpackcomposeneetroots.navigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarGraph() {
    val navController= rememberNavController()


    NavHost(
        navController=navController,
        startDestination = NavBarRoutes.Home,
    ){
        composable<NavBarRoutes.Home> {
            NavHomeScreen(navController)
        }
        composable<NavBarRoutes.Search> {
            NavSearchScreen(navController)
        }
        composable<NavBarRoutes.Notifications> {
            NavNotificationScreen(navController)
        }
        composable<NavBarRoutes.Profile> {
            NavProfileScreen(navController)

        }

    }
}