package fi.oamk.iconlecturedemo.component


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun OutlinedTextFieldWithIcon(label: String,icon: ImageVector, cDescription: String = "") {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {Text(label)},
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            Icon(icon, contentDescription = "cDescription")
        }
    )
}