package com.example.recomposecoil

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import me.saket.telephoto.zoomable.rememberZoomableState
import me.saket.telephoto.zoomable.zoomable

import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter

@Composable
fun WorkingExample() {
    val zoomableState = rememberZoomableState()

    val imageLoader = ImageLoader.Builder(LocalContext.current).build()

    val painter = rememberAsyncImagePainter(
        model = R.drawable.ic_launcher_background,
        imageLoader = imageLoader
    )

    Box (
        modifier = Modifier
            .fillMaxSize()
            .zoomable(
                zoomableState
            )

    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}