package com.example.itask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.itask.ui.theme.ITaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val supabaseURL = BuildConfig.SUPABASE_URL
        val supabaseKey = BuildConfig.SUPABASE_PUBLISHABLE_KEY


        setContent {
            ITaskTheme {


            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}