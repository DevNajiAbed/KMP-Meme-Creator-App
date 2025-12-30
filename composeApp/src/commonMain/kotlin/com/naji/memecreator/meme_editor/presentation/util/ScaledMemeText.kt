package com.naji.memecreator.meme_editor.presentation.util

import androidx.compose.ui.geometry.Offset
import com.naji.memecreator.meme_editor.presentation.MemeText

data class ScaledMemeText(
    val text: String,
    val scaledOffset: Offset,
    val scaledFontSizePx: Float,
    val strokeWidth: Float,
    val constraintsWidth: Int,
    val textPaddingX: Float,
    val textPaddingY: Float,
    val rotation: Float,
    val scale: Float,
    val originalText: MemeText
)
