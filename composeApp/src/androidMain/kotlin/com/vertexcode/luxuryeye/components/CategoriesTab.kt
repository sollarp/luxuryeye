package com.vertexcode.luxuryeye.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vertexcode.luxuryeye.presentation.ui.theme.BgLight
import com.vertexcode.luxuryeye.presentation.ui.theme.PrimaryColor


@Composable
fun CategoriesTab() {

    val listOfCategory = listOf("Men", "Women", "Kids", "Accessories", "Shoes", "Bags")
    var selectedTabIndex = rememberSaveable { mutableIntStateOf(0) }

    ScrollableTabRow(
    edgePadding = 0.dp,
    selectedTabIndex = selectedTabIndex.value,
    backgroundColor = Color.Transparent,
    divider = {},
    indicator = {}
    ) {
        listOfCategory.forEachIndexed { index, text ->
            Tab(
                selected = index == selectedTabIndex.value,
                onClick = {
                    selectedTabIndex.value = index
                }
            ) {
                if (index == selectedTabIndex.value) {

                    Box(
                        modifier = Modifier
                            .background(
                                color = PrimaryColor,
                                shape = CircleShape
                            )
                            .clip(
                                shape = CircleShape
                            )
                    ) {

                        Text(
                            text = text,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 22.dp, vertical = 8.dp)
                        )
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .background(
                                color = BgLight,
                                shape = CircleShape
                            )
                            .clip(
                                shape = CircleShape
                            )
                    ) {

                        Text(
                            text = text,
                            color = Color.Black,
                            modifier = Modifier.padding(horizontal = 22.dp, vertical = 8.dp)
                        )
                    }
                }
            }
        }
    }
}