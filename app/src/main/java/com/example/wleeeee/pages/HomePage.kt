package com.example.wleeeee.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home

import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wleeeee.FileItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage( navController: NavController ,modifier: Modifier = Modifier) {
    val fileItemsList = listOf(
        FileItems("Catatan MTK", "Dibuka pada tanggal 17 Agustus 2024"),
        FileItems("Jetpack Compose", "Dibuka pada tanggal 12 Januari 2024"),
        FileItems("Bejalar HTML ", "Dibuka pada tanggal 3 Maret 2024"),
        FileItems("Foto Bang Rehan", "Dibuka pada tanggal 21 April 2024"),
        FileItems("Menjadi Fans MU", "Dibuka pada tanggal 5 Mei 2024"),
        FileItems("Materi ReactJS", "Dibuka pada tanggal 9 Juni 2024"),
        FileItems("Bagi WDP Pls", "Dibuka pada tanggal 14 Juli 2024"),
        FileItems("Tutorial Ganteng", "Dibuka pada tanggal 22 Agustus 2024"),
        FileItems("Skin Terizla Epic", "Dibuka pada tanggal 7 September 2024"),
        FileItems("GG MU vs Barca", "Dibuka pada tanggal 19 Oktober 2024"),
        FileItems("Bang capek", "Dibuka pada tanggal 19 Oktober 2024"),)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Selamat Datang di Beranda!",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFB221CB),
                    titleContentColor = Color.White
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFF3EDF7))
                .padding(innerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier.fillMaxSize()

                ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Diakses baru-baru ini",
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        color = Color.Black
                    )


                    LazyRow(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(fileItemsList) { item ->
                            Card(

                                modifier = Modifier
                                    .padding(8.dp)
                                    .size(120.dp)
                                    .clickable {
                                        navController.navigate("detail_page")
                                    },


                                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF)),

                                ) {

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Email,
                                        contentDescription = "Icon",
                                        tint = Color(0xFFB221CB),
                                        modifier = Modifier.size(52.dp)
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = item.label,
                                        fontSize = 12.sp,
                                        color = Color.Black,
                                        modifier = Modifier.padding(horizontal = 4.dp)
                                    )


                                }
                            }
                        }
                    }
                    Text(
                        text = "Daftar File",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                    // LazyColumn
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth() //
                    ) {
                        items(fileItemsList) { item ->
                            Card(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth(),
                                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF)),

                                ) {
                                Row(
                                    modifier = Modifier.padding(
                                        start = 16.dp,
                                        end = 16.dp,
                                        top = 6.dp,
                                        bottom = 6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Email,
                                        contentDescription = "Icon",
                                        tint = Color(0xFFB221CB),
                                        modifier = Modifier.size(32.dp) //
                                    )



                                    Box(
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier.padding(16.dp)
                                    ) {
                                        Column {
                                            Text(
                                                text = item.label,
                                                fontSize = 16.sp,
                                                color = Color.Black
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                            Text(
                                                text = item.caption,
                                                fontSize = 12.sp,
                                                color = Color.Gray
                                            )

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


