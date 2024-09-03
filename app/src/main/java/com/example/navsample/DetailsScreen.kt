package com.example.navsample

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun DetailsScreen(navController: NavHostController) {
    Column {
        Text("This is the Details Screen")
        Button(onClick = {
            navController.popBackStack()
            // or
            // navController.navigate("home")
        }) {
            Text("Back to Home")
        }
    }
}