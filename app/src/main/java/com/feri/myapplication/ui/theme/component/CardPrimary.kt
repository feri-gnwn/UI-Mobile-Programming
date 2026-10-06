package com.feri.myapplication.ui.theme.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.feri.myapplication.R
import com.feri.myapplication.ui.theme.BluePrimary
import com.feri.myapplication.ui.theme.PrakpmTheme

@Composable
fun CardPrimary(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(BluePrimary)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Welcome back", fontSize = 12.sp,
                    color = Color.White.copy(alpha = 0.8f),
                    lineHeight = 16.sp)
                Text("Build your first app", fontSize = 24.sp, color = Color.White, fontWeight = FontWeight.SemiBold,
                    lineHeight = 28.sp)
            }
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(99.dp))
                    .background(Color.White.copy(alpha = 0.18f))
                    .padding(horizontal = 10.dp, vertical = 6.dp)
            ) {
                Text("New", fontSize = 12.sp, color = Color.White, fontWeight = FontWeight.Medium, lineHeight = 16.sp)
            }
        }
        Text(
            text = stringResource(R.string.content_desc),
            fontSize = 16.sp,
            color = Color.White.copy(alpha = 0.8f),
            lineHeight = 20.sp
        )
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(
                onClick = { },
                modifier = Modifier.weight(1.5f).height(42.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = BluePrimary)
            ) {
                Icon(painterResource(R.drawable.ic_play_arrow), contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(12.dp))
                Text("Start lesson", fontWeight = FontWeight.SemiBold, lineHeight = 16.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.weight(1f).height(42.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White.copy(alpha = 0.18f),
                    contentColor = Color.White
                )
            ) {
                Icon(painterResource(R.drawable.ic_menu_book), contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(12.dp))
                Text("Notes", fontWeight = FontWeight.SemiBold,lineHeight = 16.sp)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 390)
@Composable
private fun CardPrimaryPreview() {
    PrakpmTheme {
        Box(Modifier.padding(24.dp)) {
            CardPrimary()
        }
    }
}