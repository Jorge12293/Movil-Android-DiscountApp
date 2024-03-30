
package com.example.discountapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.discountapp.viewModels.CalculateViewModel1
import com.example.discountapp.views.HomeView

@Composable
fun NavManager(viewModel1: CalculateViewModel1){
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            HomeView(viewModel1= viewModel1)
        }
    }
}