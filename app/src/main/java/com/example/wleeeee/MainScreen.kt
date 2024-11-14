package com.example.wleeeee

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.input.pointer.motionEventSpy
import com.example.wleeeee.pages.AccountPage
import com.example.wleeeee.pages.HomePage
import com.example.wleeeee.pages.ListPage

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

      val navItemList = listOf(
        NavItem("Beranda", Icons.Rounded.Home ),
        NavItem("Jelajahi", Icons.Rounded.List ),
        NavItem("Akun", Icons.Rounded.Person),
    )

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed {index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                        },
                        icon = {
                            Icon(imageVector = navItem.Icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        })
                }
            }
        }
    ) { innerPadding ->
        ContentScreen(modifier = modifier.padding(innerPadding),selectedIndex)

    }
}

@Composable
fun ContentScreen (modifier: Modifier = Modifier, selectedIndex : Int) {
    when(selectedIndex){
        0-> HomePage()
        1-> ListPage()
        2-> AccountPage()
    }
}










