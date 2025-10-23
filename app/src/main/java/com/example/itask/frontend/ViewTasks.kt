package com.example.itask.frontend

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.itask.backend.TasksViewModel

@Composable
fun ViewTasks(viewModel: TasksViewModel){

}

@Composable
fun ViewTasks(modifier: Modifier = Modifier){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        TaskItems()
    }
}


@Composable
fun TaskItems(modifier: Modifier = Modifier){
    Card (
        modifier = modifier
            .width(400.dp)
            .height(300.dp),
        shape = RoundedCornerShape(topStart = 20.dp, bottomEnd = 20.dp),


    ) {

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DisplayTasksView(){
    ViewTasks()
}