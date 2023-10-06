package com.example.schedbuddy

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.schedbuddy.ui.theme.SchedbuddyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)
            val button1: Button = findViewById(R.id.button1)
            val button2: Button = findViewById(R.id.button2)
            val button3: Button = findViewById(R.id.button3)
            val button4: Button = findViewById(R.id.button4)
            button1.setOnClickListener { // Add your code here for Button 1 click
                Toast.makeText(this@MainActivity, "Button 1 Clicked", Toast.LENGTH_SHORT).show()
            }
            button2.setOnClickListener { // Add your code here for Button 2 click
                Toast.makeText(this@MainActivity, "Button 2 Clicked", Toast.LENGTH_SHORT).show()
            }
            button3.setOnClickListener { // Add your code here for Button 3 click
                Toast.makeText(this@MainActivity, "Button 3 Clicked", Toast.LENGTH_SHORT).show()
            }
            button4.setOnClickListener { // Add your code here for Button 4 click
                Toast.makeText(this@MainActivity, "Button 4 Clicked", Toast.LENGTH_SHORT).show()
            }
            SchedbuddyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SchedbuddyTheme {
        Greeting("Android")
    }
}