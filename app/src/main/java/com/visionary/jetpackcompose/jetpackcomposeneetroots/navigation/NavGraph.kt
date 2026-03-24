package com.visionary.jetpackcompose.jetpackcomposeneetroots.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Preview(showSystemUi = true)
@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController= rememberNavController()

    NavHost(
        navController=navController,
        startDestination = MyNavRouts.LoginScreen
    ){
        composable <MyNavRouts.LoginScreen>{
            LoginScreenUI(navController)
        }
        composable <MyNavRouts.HomeScreen> {
            HomeScreenUI(navController)
        }
        composable<MyNavRouts.WelcomeScreen> {backStackEntry->
            val data=backStackEntry.toRoute<MyNavRouts.WelcomeScreen>()
            WelcomeScreenUI(data.userName,navController)
        }

    }
}