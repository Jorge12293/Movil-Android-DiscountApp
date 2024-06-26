package com.example.discountapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContainerCards( title1: String, value1: Double, title2: String, value2: Double){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        MainCard(title = title1, value = value1, modifier = Modifier.padding(start = 30.dp).weight(1f))
        SpaceW(10.dp)
        MainCard(title = title2, value = value2, modifier = Modifier.padding(end = 30.dp).weight(1f))
    }
}

@Composable
fun MainCard(title:String,value: Double,modifier: Modifier= Modifier){
    Card (
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        )
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = title, color = Color.Black, fontSize = 20.sp)
            Text(text = "$$value", color = Color.Black, fontSize = 20.sp)
        }
    }
}