package com.sithu.businesscard

import android.content.res.Resources
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sithu.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActivityLayout()
        }
    }
}



@Composable
fun AndroidLogo(modifier: Modifier = Modifier){
    var androidLogo = painterResource(R.drawable.android_logo)
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(top = 150.dp)
        .fillMaxWidth()){
        Box(modifier.background(color = Color.Blue)){
        Image(painter = androidLogo,
            contentDescription = null,
            Modifier.size(100.dp))
        }
        Text(text = "Aye Si Thu Aung",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(10.dp)
        )
        Text(text = "Android Developer Extraordinaire",
            color = Color.Cyan,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun ContactLayout(modifier: Modifier=Modifier){
    val phoneIcon = Icons.Rounded.Phone
    val shareIcon = Icons.Rounded.Share
    val emailIcon = Icons.Rounded.Email
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(90.dp),
        verticalArrangement = Arrangement.Bottom){
        Surface(modifier=modifier.padding(10.dp)) {
            Row() {
                Icon(imageVector = phoneIcon, contentDescription = "Phone")
                Text(text = "+66 (954) 083335",
                    fontSize = 15.sp,
                    modifier = modifier.padding(start = 15.dp))
            }
        }
        Surface(modifier=modifier.padding(10.dp)) {
            Row{
                Icon(imageVector = shareIcon, contentDescription = "Share")
                Text(text = "@ AndroidDev",
                    fontSize = 15.sp,
                    modifier = modifier.padding(start = 15.dp))
            }
        }
        Surface (modifier=modifier.padding(10.dp)) {
            Row {
                Icon(imageVector = emailIcon, contentDescription = "Email")
                Text(text = "joe.doe@gmail.com",
                    fontSize = 15.sp,
                    modifier = modifier.padding(start = 15.dp))
            }
        }
        
    }

}


@Composable
fun ActivityLayout(){
    BusinessCardTheme() {

        Box(Modifier.fillMaxSize()) {
            AndroidLogo()
            ContactLayout()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        ActivityLayout()
    }
}