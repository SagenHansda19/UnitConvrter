package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UnitConverter(innerPadding)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview () {
    UnitConverter(innerPadding = PaddingValues(8.dp))
}
@Composable
fun UnitConverter(innerPadding : PaddingValues){

    var inputValue by remember { mutableStateOf(" ") }
    var outputValue by remember { mutableStateOf(" ") }
    var inputUnit by remember { mutableStateOf("Centimeters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val conversionFactor = remember { mutableStateOf(0.01) }
    val oConversionFactor = remember { mutableStateOf(1.0) }


    Column {
        Text(text = "Unit Converter")
        OutlinedTextField(value = " ", onValueChange = {} )

        Text(text = "Result")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = inputValue , onValueChange = {inputValue = it})
        Text(text = "Result")


        Row {
            Box() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Dropdown")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /TODO/ }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Millimeters") }, onClick = { /TODO/ })
                }
            }

            Box(){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Dropdown")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /TODO/ }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = { /TODO/ })
                    DropdownMenuItem(text = { Text(text = "Millimeters") }, onClick = { /TODO/ })
                }
            }
//            val context = LocalContext.current //Output popup text
//            Button(onClick =  {
//              Toast.makeText(context, "Thanks for clicking the button", Toast.LENGTH_LONG).show()
//            })
//            {
//                Text(text = "Click !")
//            }
        }
    }
}