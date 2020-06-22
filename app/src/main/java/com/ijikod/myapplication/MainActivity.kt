package com.ijikod.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.res.stringResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.ijikod.myapplication.ui.MyApplicationTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }





    @Composable
    fun Greeting(name: String){
        Text("Hello $name!")
    }

    @Preview
    @Composable
    fun previewGreeting(){
        Greeting("Android")
    }



    @Composable
    fun NewsStory(){
        val image = imageResource(R.drawable.header)
        val imageModifier = Modifier.preferredHeight(180.dp).fillMaxHeight().clip(RoundedCornerShape(4.dp))

        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(modifier = Modifier.padding(16.dp)) {
                Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Today is Saturday in June", style = typography.h6, maxLines = 2, overflow = TextOverflow.Ellipsis)
                Text("I hope to go on a walk soon", style = typography.body2)
                Text("Yes it has been a very interesting week, I give thanks to God almighty.", style = typography.body2)
            }
        }


    }


    @Preview
    @Composable
    fun previewNewsStory(){
        NewsStory()
    }



}
