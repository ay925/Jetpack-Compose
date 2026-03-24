package com.visionary.jetpackcompose.jetpackcomposeneetroots.navigationBar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
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
        modifier = Modifier.fillMaxWidth().padding(20.dp).clip(shape = CircleShape).size(70.dp),


    ) { navItem.forEach {items ->

        NavigationBarItem(
            modifier = Modifier.fillMaxSize().padding(top = 25.dp),
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
                unselectedIconColor = Color.DarkGray,

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