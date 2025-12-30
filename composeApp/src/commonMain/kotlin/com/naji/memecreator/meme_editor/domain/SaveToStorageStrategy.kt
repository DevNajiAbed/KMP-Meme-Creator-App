package com.naji.memecreator.meme_editor.domain

interface SaveToStorageStrategy {
    fun getFilePath(fileName: String): String
}