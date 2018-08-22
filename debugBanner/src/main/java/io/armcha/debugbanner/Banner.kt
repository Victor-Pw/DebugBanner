package io.armcha.debugbanner

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class Banner(@ColorRes val bannerColor: Int = android.R.color.holo_red_dark,
                  @ColorRes val textColor: Int = android.R.color.white,
                  val bannerText: String = "DEBUG")