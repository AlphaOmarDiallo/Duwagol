package com.alphaomardiallo.duwagol.common.domain.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.alphaomardiallo.duwagol.R

sealed class MainNavigationItems(
    val route: String,
    @StringRes var title: Int,
    @DrawableRes val icon: Int,
) {
    object Home : MainNavigationItems(
        route = R.string.main_nav_item_home.toString(),
        title = R.string.main_nav_item_home,
        icon = R.drawable.muslim_prayer_svgrepo_com,
    )

    object Calendar : MainNavigationItems(
        route = R.string.main_nav_item_calendar.toString(),
        title = R.string.main_nav_item_calendar,
        icon = R.drawable.ic_round_calendar_month_24
    )
}