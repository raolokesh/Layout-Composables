package com.lokesh.layoutcomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lokesh.layoutcomposables.ui.theme.LayoutComposablesTheme
import java.util.ResourceBundle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutComposablesTheme {
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


@Composable
fun GreetingPreview() {
//Column (verticalArrangement = Arrangement.SpaceEvenly,
//    horizontalAlignment = Alignment.CenterHorizontally){
//    Text(text = "B", fontSize = 26.sp)
//    Text(text = "c", fontSize = 26.sp)
//    Text(text = "d", fontSize = 26.sp)
//    Text(text = "e", fontSize = 26.sp)
//}
//    Row(horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically){
//        Text(text = "B", fontSize = 26.sp)
//        Text(text = "c", fontSize = 26.sp)
//        Text(text = "d", fontSize = 26.sp)
//        Text(text = "e", fontSize = 26.sp)
//    }

    // Box is like as Frame layout
    Box(modifier = Modifier){
        Text(text = "B", fontSize = 26.sp)
        Text(text = "c", fontSize = 26.sp)
        Text(text = "d", fontSize = 26.sp)
        Text(text = "e", fontSize = 26.sp)
    }

}


@Composable
fun SampleDesign(imgId: Int,name: String,occupation: String){
    Row(Modifier.padding(8.dp)){
    Image(
        painter = painterResource(id = imgId),
        contentDescription ="",
        //contentScale = ContentScale.Fit,
        Modifier.size(40.dp))
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start) {
            Text(
                text = name,
                style = TextStyle(fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold)
            )
            Text(
                text = occupation,
                style = TextStyle(fontWeight = FontWeight.Thin)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SampleDesignPreview(){
    Column {
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "Lokesh Rao", occupation = "Software Engineer")
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "dva Rao", occupation = "asdv Engineer")
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "asd Rao", occupation = "asvdsav Engineer")
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "asdv Rao", occupation = "Software Engineer")
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "asv Rao", occupation = "Softwasvdare Engineer")
        SampleDesign(imgId = R.drawable.baseline_person_24, name = "asdv Rao", occupation = "Software Engineer")
    }
}