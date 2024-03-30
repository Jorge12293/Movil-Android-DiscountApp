package com.example.discountapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.discountapp.components.Alert
import com.example.discountapp.components.ContainerCards
import com.example.discountapp.components.MainButton
import com.example.discountapp.components.MainTextField
import com.example.discountapp.components.SpaceH
import com.example.discountapp.viewModels.CalculateViewModel3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView3(viewModel3: CalculateViewModel3){
    Scaffold {
        CenterAlignedTopAppBar(
            title = { Text(text = "Discount App",color = Color.White)},
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        )
        ContentHomeView3(it, viewModel3 = viewModel3)
    }
}

@Composable
fun ContentHomeView3(paddingValues: PaddingValues,viewModel3: CalculateViewModel3){
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val state = viewModel3.state;
        ContainerCards(
            title1 = "Total", value1 = state.totalDiscount,
            title2 = "Discount", value2 = state.priceDiscount)
        MainTextField(value = state.price, onValueChange =  {viewModel3.onValue(it,"price")}, label = "Price")
        SpaceH()
        MainTextField(value = state.discount, onValueChange =  {viewModel3.onValue(it,"discount")}, label = "Discount %")
        SpaceH(10.dp)
        MainButton(text = "Generate Discount") {
            viewModel3.calculate()
        }
        MainButton(text = "Clean",color=Color.Red) {
            viewModel3.clear()
        }
        if(state.showAlert){
            Alert(
                title = "Alert",
                message = "Write price and discount",
                confirmText = "Accept",
                onConfirmClick = {
                    viewModel3.cancelAlert()
                }
            ){}
        }
    }
}

