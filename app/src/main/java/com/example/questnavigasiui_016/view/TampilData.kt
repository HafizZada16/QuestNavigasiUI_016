package com.example.questnavigasiui_016.view

import com.example.questnavigasiui_016.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "Isinya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(id = R.string.Tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.teal_200))
            )
        }){}
}