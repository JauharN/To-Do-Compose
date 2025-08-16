package com.afin.todolistcompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.afin.todolistcompose.util.Constants
import com.afin.todolistcompose.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(Constants.LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ) {

    }
}