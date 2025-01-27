package fi.oamk.iconlecturedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fi.oamk.iconlecturedemo.component.OutlinedTextFieldWithIcon
import fi.oamk.iconlecturedemo.ui.theme.IconLectureDemoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IconLectureDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DemoApp(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.padding(all = 16.dp)
    ){
        Text(
            text = "Login",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        OutlinedTextFieldWithIcon("User", Icons.Filled.Person, "Person icon")
        OutlinedTextFieldWithIcon("Password",Icons.Filled.Lock)
    /*    OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text("User")},
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                Icon(Icons.Filled.Person, contentDescription = "Person icon")
            }
        )*/
        Button(
            onClick = { /* Add your onClick logic here */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Blue
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                "Submit",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DemoAppPreview(){
    IconLectureDemoTheme {
        DemoApp()
    }
}
