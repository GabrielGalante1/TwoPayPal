package com.example.cartaovisital


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.cartaovisital.ui.theme.CartaovisitalTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaovisitalTheme {
                BusinessCardScreen()
            }
        }
    }
}
@Composable
fun BusinessCardScreen() {
    val backgroundColor = Color(0xFFD8EECF)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Logotipo do Android
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier.size(100.dp)
            )
            // Nome e cargo
            Text(
                text = "José",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Desenvolvedor em Java",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2E7D32)
            )
            Spacer(modifier = Modifier.height(16.dp))
            ContactInfo(icon = Icons.Default.Phone, text = "+55 (11) 942889981")
            ContactInfo(icon = Icons.Default.Share, text = "@AndroidDev")
            ContactInfo(icon = Icons.Default.Email, text = "jose_@android.com")
        }
    }
}

@Composable
fun ContactInfo(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF2E7D32),
            modifier = Modifier.size(20.dp)
        )
        Text(text = text, fontSize = 14.sp, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCardScreen()
}