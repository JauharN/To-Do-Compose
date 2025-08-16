package com.afin.todolistcompose.ui.theme

import androidx.compose.ui.graphics.Color
import com.afin.todolistcompose.data.models.Priority

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFFF4646)
val NonePriorityColor = Color(0xFFFFFFFF)

fun Priority.color(): Color = when (this) {
    Priority.HIGH -> HighPriorityColor
    Priority.MEDIUM -> MediumPriorityColor
    Priority.LOW -> LowPriorityColor
    Priority.NONE -> NonePriorityColor
}
