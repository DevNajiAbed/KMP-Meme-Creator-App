package com.naji.memecreator.core.theme

import androidx.activity.compose.LocalActivity
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

@Composable
actual fun setStatusBarLightIcons(light: Boolean) {
    val activity = LocalActivity.current ?: return
    val window = activity.window
    WindowCompat.setDecorFitsSystemWindows(window, false)
    WindowInsetsControllerCompat(window, window.decorView).apply {
        isAppearanceLightStatusBars = light
        isAppearanceLightNavigationBars = light
    }
}