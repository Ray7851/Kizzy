/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * HomeItem.kt is part of Kizzy
 *  *  *  and can not be copied and/or distributed without the express
 *  *  * permission of yzziK(Vaibhav)
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class HomeFeatures(
    val title: String,
    @DrawableRes val icon: Int,
    val route: String? = null,
    val isChecked: Boolean = false,
    val onClick: (String) -> Unit = {},
    val onCheckedChange: (Boolean) -> Unit = {},
    val showSwitch: Boolean = true,
    val shape: RoundedCornerShape = RoundedCornerShape(0.dp)
)