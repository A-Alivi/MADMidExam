package com.example.madmidexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.madmidexam.ui.theme.MADMidExamTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADMidExamTheme {
                var navController = rememberNavController()
                // A surface container using the 'background' color from the theme
NavHost(navController = navController, startDestination = "Splash Screen") {
    composable("splash"){ SplashScreen()}
    composable("cityselection"){ CitySelectionScreen()}
    composable("weatherdetail"){ WeatherDetailScreen()}

}


            }
        }
    }
}



//val weatherInfo: List<String> = run {
//
//    val resourceId = resources.getIdentifier("weather_info_${cityName.lowercase()}", "array", context.packageName)
//
//    if (resourceId != 0) resources.getStringArray(resourceId).toList() else listOf("Info not available")
//
//}

@Composable
fun MyWeatherApp()
{
    SplashScreen()
    CitySelectionScreen()
    WeatherDetailScreen()
}



@Composable
fun SplashScreen()
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo")
        Text(text = "Sky Sight")
    }
}
@Composable
fun CitySelectionScreen(navController: NavController)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(.7f)
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            modifier = Modifier.fillMaxSize(.7f)

            )

        TextField(value = "Enter City Name", onValueChange = {})
        Button(onClick = { }) {
            Text(text = "Show Weather")
            
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WeatherDetailScreen()
{


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Text(
            text = "City Name: Karachi",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
            )


        Row {
            Image(painter = painterResource(id = R.drawable.baseline_device_thermostat_24), contentDescription = "thermostate" )
            Column {
                Text(text = "Temperature")
                Text(text = "32")
            }
        }
        Row {
            Image(painter = painterResource(id = R.drawable.baseline_wind_power_24), contentDescription ="wind" )
            Column {
                Text(text = "Humidity")
                Text(text = "32")
            }
        }
        Row {
            Image(painter = painterResource(id = R.drawable.baseline_sunny_24), contentDescription = "sunny")
            Column {
                Text(text = "Condition")
                Text(text = "32")
            }
        }


    }
}

@Composable
fun TempDetails()
{
    Row {
        Column {
            Text(text = "Humidity")
            Text(text = "32")
        }
    }
}








