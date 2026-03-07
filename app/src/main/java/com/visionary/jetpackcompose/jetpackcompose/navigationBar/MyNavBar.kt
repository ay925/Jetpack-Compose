package com.visionary.jetpackcompose.jetpackcompose.navigationBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun MyNavBar(navController: NavHostController,key: String) {
    val navItem=listOf(
        NavItems("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItems("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItems("Notifications", Icons.Default.Notifications,NavBarRoutes.Notifications ),
        NavItems("Profile", Icons.Default.Person, NavBarRoutes.Profile),
    )
    NavigationBar(

    ) { navItem.forEach {items ->

        NavigationBarItem(
            onClick = {navController.navigate(items.routes){
                popUpTo(navController.graph.startDestinationId){
                    saveState=true
                }
                launchSingleTop=true
                restoreState=true
            } },
            selected = items.title==key,
            icon = {
                Icon(imageVector = items.icon,contentDescription = null)
            },
            label = { Text(items.title) },
            alwaysShowLabel = true,
            colors= NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Blue,
                selectedTextColor = Color.Blue,
                unselectedIconColor = Color.DarkGray

            )
        )
    }

    }
}

data class NavItems(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes
)