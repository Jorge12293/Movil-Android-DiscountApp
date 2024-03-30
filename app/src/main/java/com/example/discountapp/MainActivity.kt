package com.example.discountapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.discountapp.navigation.NavManager
import com.example.discountapp.ui.theme.DiscountAppTheme
import com.example.discountapp.viewModels.CalculateViewModel1
import com.example.discountapp.viewModels.CalculateViewModel2
import com.example.discountapp.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel1: CalculateViewModel1 by viewModels();
        val viewModel2: CalculateViewModel2 by viewModels();
        setContent {
            DiscountAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavManager(viewModel1=viewModel1,viewModel2=viewModel2)
                }
            }

        }
    }
}

