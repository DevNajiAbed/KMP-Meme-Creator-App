package com.naji.memecreator.di

import com.naji.memecreator.meme_editor.presentation.MemeEditorViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

expect val platformAppModule: Module

val appModule = module {
//    single {  }
    viewModelOf(::MemeEditorViewModel)
    includes(platformAppModule)
}