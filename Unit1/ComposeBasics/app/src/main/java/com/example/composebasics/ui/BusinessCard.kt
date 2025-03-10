package com.example.composebasics.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.R
import com.example.composebasics.ui.theme.backgroundColor
import com.example.composebasics.ui.theme.nameColor
import com.example.composebasics.ui.theme.strokeColor
import com.example.composebasics.ui.theme.titleColor

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.profile_image),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(150.dp)
                .border(3.dp, strokeColor, CircleShape)
        )

        Text(
            text = "Arda Işıtan",
            modifier = Modifier.padding(top = 16.dp),
            color = nameColor,
            fontSize = 34.sp,
            textAlign = TextAlign.Justify,
            style = TextStyle(letterSpacing = 3.sp)
        )


        Text(
            text = "Android Developer",
            modifier = Modifier.padding(top = 16.dp),
            color = titleColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(200.dp))

        Column {
            ContactInfo(
                icon = R.drawable.linkedin,
                text = "/ardaisitan",
            )

            ContactInfo(
                icon = R.drawable.github,
                text = "/ArdaIstn",
            )


            ContactInfo(
                icon = R.drawable.email,
                text = "ardaaisitan@gmail.com",
            )

        }


    }
}


@Composable
fun ContactInfo(
    icon: Int,
    text: String,
) {

    Row(
        modifier = Modifier.padding(12.dp)

    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = titleColor,
        )
        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 12.dp),
            textAlign = TextAlign.Center
        )

    }


}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}


