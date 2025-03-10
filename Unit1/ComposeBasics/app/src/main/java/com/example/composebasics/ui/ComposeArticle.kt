package com.example.composebasics.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.R

@Composable
fun ComposeArticle(

) {
    ArticleCard(
        title = stringResource(R.string.jetpack_compose_tutorial),
        shortDescription = stringResource(R.string.short_expl_compose),
        longDescription = stringResource(R.string.long_expl_compose),
        imagePainter = painterResource(R.drawable.bg_compose_background),
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier =
            modifier.fillMaxSize()
                .background(Color.White),

        ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            )

        Text(
            text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp)
        )

        Text(
            text = shortDescription,
            fontSize = 18.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = longDescription,
            fontSize = 18.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }


}

@Preview
@Composable
fun ComposeArticlePreview() {
    ComposeArticle()
}