package com.example.composebasics.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.R
import com.example.composebasics.ui.theme.columnComposableColor
import com.example.composebasics.ui.theme.imageComposableColor
import com.example.composebasics.ui.theme.rowComposableColor
import com.example.composebasics.ui.theme.textComposableColor

@Composable
fun ComposeQuadrant() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier.weight(1f) // Ekrandaki 2 row'u Parent yani Column'a göre eşit olarak bölmemizi sağlar.
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.text_title),
                description = stringResource(R.string.text_description),
                backgroundColor = textComposableColor,
                modifier = Modifier.weight(1f) // Ekrandaki 2 column'u Parent yani Row'a göre eşit olarak bölmemizi sağlar.
            )
            ComposableInfoCard(
                title = stringResource(R.string.image_title),
                description = stringResource(R.string.image_description),
                backgroundColor = imageComposableColor,
                modifier = Modifier.weight(1f)
            )

        }

        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.row_title),
                description = stringResource(R.string.row_description),
                backgroundColor = rowComposableColor,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.colum_title),
                description = stringResource(R.string.column_description),
                backgroundColor = columnComposableColor,
                modifier = Modifier.weight(1f)
            )
        }


    }

}

@Composable
fun ComposableInfoCard(
    title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description, fontSize = 16.sp, textAlign = TextAlign.Justify
        )

    }

}


@Preview
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrant()
}