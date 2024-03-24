
package com.example.discountapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.discountapp.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            HomeView()
        }
    }
}