package com.example.musicplayer.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(){

    val scaffoldState:ScaffoldState = rememberScaffoldState()
    val scope:CoroutineScope = rememberCoroutineScope()


    Scaffold(
        topBar =
        {
            TopAppBar(
                title = { Text(text = "Home")},
                navigationIcon =
                {
                    IconButton(
                        onClick =
                        {
                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        }
                    )
                    {
                        Icon(imageVector =Icons.Default.AccountCircle ,
                            contentDescription = "null")
                    }
                }
            )
        }
    )
    {

        Text(text = "", modifier = Modifier.padding(it))
    }

}

@Composable
fun DrawerItem()
{

}

