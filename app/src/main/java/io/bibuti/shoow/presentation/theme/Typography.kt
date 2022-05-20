package io.bibuti.shoow.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.bibuti.shoow.R

private val poppinsFamily = FontFamily(
    fonts = listOf(
        Font(
            R.font.poppins_regular,
            weight = FontWeight.W400,
        ),
        Font(
            R.font.poppins_light,
            weight = FontWeight.W300,
        ),
        Font(
            R.font.poppins_medium,
            weight = FontWeight.W500
        ),
        Font(
            R.font.poppins_bold,
            weight = FontWeight.W600
        ),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    displayMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp
    ),
    displaySmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    titleMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    titleSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp
    ),
    bodySmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp
    ),
    labelSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
)