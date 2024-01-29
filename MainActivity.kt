package com.example.orangeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.orangeapp.ui.theme.OrangeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Orange()
        }
    }
}

@Composable
fun Orange(modifier: Modifier = Modifier.fillMaxSize()) {

    Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "The Orange APP",
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )

        var result by remember{mutableStateOf(1)}
        var OrangeId = when(result){
            1->R.drawable.orange_tree
            2->R.drawable.orange_fruit
            3->R.drawable.orange_drink_full
            else->R.drawable.orange_drink_empty
        }

        Spacer(modifier = Modifier.height(60.dp))


            Button(onClick = {
                if (result == 1)
                {
                    result++
                }

                else if (result == 2)
                {
                    result++
                }

                else if (result == 3)
                {
                    result++
                }

                else {
                    result == 1
                }
            })
            {
                Image(
                    painter = painterResource(id = OrangeId),
                    contentDescription = "orange tree",
                    Modifier.size(150.dp),
                    Alignment.Center
                )
            }

            Text(text = "Tap the orange bee to select an orange")

            Text (text="Game Count: ")

    }
}



@Preview(showBackground = true)
@Composable
fun OrangePreview() {
    Orange()
}