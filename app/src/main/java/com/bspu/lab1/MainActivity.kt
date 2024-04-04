package com.bspu.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    TextField(value = "", onValueChange = {})
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "C")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "⏎")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "%")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "/")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "7")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "8")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "9")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "*")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "4")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "5")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "6")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "-")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "1")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "2")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "3")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "+")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "0")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = ",")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 50.dp, height = 50.dp)
                    ) {
                        Text(text = "=")
                    }
                }
            }
        }
    }
}
