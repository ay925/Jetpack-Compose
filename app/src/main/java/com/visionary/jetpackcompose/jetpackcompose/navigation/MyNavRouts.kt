package com.visionary.jetpackcompose.jetpackcompose.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRouts{
    @Serializable
    object LoginScreen: MyNavRouts(){}
    @Serializable
    data class WelcomeScreen(val userName: String){}


    @Serializable
    object HomeScreen: MyNavRouts(){}
}