package com.example.wleeeee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wleeeee.pages.AccountPage
import com.example.wleeeee.pages.DetailPage
import com.example.wleeeee.pages.HomePage
import com.example.wleeeee.pages.ListPage
import com.example.wleeeee.ui.theme.WleeeeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination ="main_screen" , builder =   {
                composable("main_screen",) {
                    MainScreen(navController)
                }
                composable("home_page",) {
                    HomePage(navController)
                }
                composable("detail_page",) {
                    DetailPage(navController)
                }
                composable("list_page",) {
                    ListPage()
                }
                composable("account_page",) {
                    AccountPage()
                }

            })

        }
    }
}

