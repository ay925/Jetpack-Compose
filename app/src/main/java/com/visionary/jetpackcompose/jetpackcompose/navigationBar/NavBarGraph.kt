package com.visionary.jetpackcompose.jetpackcompose.navigationBar

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarGraph() {
    val navController= rememberNavController()


    NavHost(
        navController=navController,
        startDestination = NavBarRoutes.Home,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
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