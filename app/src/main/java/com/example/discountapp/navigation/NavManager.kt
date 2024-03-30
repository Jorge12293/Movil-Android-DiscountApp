
package com.example.discountapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.discountapp.viewModels.CalculateViewModel1
import com.example.discountapp.viewModels.CalculateViewModel2
import com.example.discountapp.viewModels.CalculateViewModel3
import com.example.discountapp.views.HomeView
import com.example.discountapp.views.HomeView2
import com.example.discountapp.views.HomeView3

@Composable
fun NavManager(viewModel1: CalculateViewModel1,viewModel2: CalculateViewModel2,viewModel3: CalculateViewModel3){
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            //HomeView(viewModel1= viewModel1)
            //HomeView2(viewModel2 = viewModel2)
            HomeView3(viewModel3 = viewModel3)
        }
    }
}