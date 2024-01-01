package com.debug.test

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun Test() {
    Column {
        //works fine (same as vector_c but changed in Inkscape)
        Icon(
            painterResource(R.drawable.vector_a),
            ""
        )

        //works fine
        Icon(
            painterResource(R.drawable.vector_b),
            ""
        )

        //is distorted on version higher than 1.4.3
        Icon(
            painterResource(R.drawable.vector_c),
            ""
        )
    }
}