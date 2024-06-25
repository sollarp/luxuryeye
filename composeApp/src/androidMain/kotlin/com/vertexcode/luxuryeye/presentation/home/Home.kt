package com.vertexcode.luxuryeye.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vertexcode.luxuryeye.R
import com.vertexcode.luxuryeye.components.CategoriesTab
import com.vertexcode.luxuryeye.utiles.listOfData
import com.vertexcode.luxuryeye.presentation.ui.theme.BgLight
import com.vertexcode.luxuryeye.presentation.ui.theme.HintColor
import com.vertexcode.luxuryeye.presentation.ui.theme.PrimaryColor


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Home() {

    var query = rememberSaveable { mutableStateOf("") }
    val padding = Modifier.padding(8.dp)

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(16.dp),
                backgroundColor = Color.Transparent,
                elevation = 0.dp,
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "logo",
                        modifier = Modifier
                            .width(300.dp)
                            .height(50.dp)
                    )
                },

                actions = {

                    Box(
                        modifier = Modifier
                            .background(
                                color = PrimaryColor,
                                shape = CircleShape
                            )
                            .requiredSize(50.dp)
                            .clip(
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bag_icon),
                            contentDescription = "Bag Icon",
                            modifier = Modifier.size(28.dp)
                        )
                    }

                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            TextField(
                value = query.value, onValueChange = {
                    query.value = it
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = BgLight,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.search_icon),
                        contentDescription = "Search Icon",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(start = 8.dp)
                    )
                },
                placeholder = {
                    Text(text = "Search")
                },
                shape = CircleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(padding)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = PrimaryColor)
            ) {
                Text(
                    text = "FREE UK SHIPPING ON ORDERS OVER £80! FREE OUT OF UK shipping on orders over £250!",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }

            Spacer(padding)

            Text(
                text = "Categories",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(padding)

            CategoriesTab()

            Spacer(padding)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Top Selling",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )

                Text(
                    text = "See All",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }

            Spacer(Modifier.height(8.dp))

            val dataList = listOfData().dataList
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 8.dp),
            content =  {
                items(dataList) {
                    ShowEchProductCart(
                        image = it.image,
                        discount = it.discount,
                        name = it.name,
                        price = it.price,
                        noPrice = it.noPrice,
                        getOffer = it.getOffer
                        )
                }
            }
            )
        }

    }

}


@Composable
fun ShowEchProductCart(
    image: Int,
    discount: String,
    name: String,
    price: String,
    noPrice: String,
    getOffer: String
) {

    Column(
        modifier = Modifier

            .padding(horizontal = 8.dp, vertical = 8.dp)
            .width(170.dp)
            .height(285.dp)
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(8.dp)
            )
            .background(
                color = BgLight,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Product Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .background(color = PrimaryColor, shape = CircleShape)
                        .height(16.dp)
                        .width(48.dp)
                        .clip(
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = discount,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        ),

                        color = Color.White
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Heart Icon",
                )
            }


        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textDecoration = TextDecoration.Underline
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(Modifier.height(4.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = noPrice,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textDecoration = TextDecoration.LineThrough
                    ),
                    color = HintColor
                )

                Text(
                    text = price,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Spacer(Modifier.height(4.dp))

            Text(
                text = getOffer,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                ),
                color = PrimaryColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}