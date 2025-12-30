package com.naji.memecreator

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.naji.memecreator.core.presentation.NavigationRoot
import com.naji.memecreator.core.theme.MemeCreatorTheme
import com.naji.memecreator.core.theme.setStatusBarLightIcons
import com.naji.memecreator.meme_gallery.presentation.MemeGalleryScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import memecreator.composeapp.generated.resources.Res
import memecreator.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MemeCreatorTheme {
        setStatusBarLightIcons(false)
        NavigationRoot()
    }
}