package com.naji.memecreator.core.theme

import androidx.compose.runtime.Composable
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyle
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue

@Composable
actual fun setStatusBarLightIcons(light: Boolean) {
    dispatch_async(dispatch_get_main_queue()) {
        val style: UIStatusBarStyle = if (light)
            UIStatusBarStyleDarkContent
        else
            UIStatusBarStyleLightContent
        UIApplication.sharedApplication.setStatusBarStyle(style, animated = true)
    }
}