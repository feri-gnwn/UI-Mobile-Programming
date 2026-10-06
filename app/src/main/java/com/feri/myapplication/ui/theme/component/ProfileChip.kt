package com.feri.myapplication.ui.theme.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.feri.myapplication.ui.theme.BluePrimary
import com.feri.myapplication.ui.theme.BorderLight
import com.feri.myapplication.ui.theme.PrakpmTheme
import com.feri.myapplication.ui.theme.TextPrimary
import com.feri.myapplication.ui.theme.TextSecondary

@Composable
fun ProfileChip(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .border(1.dp, BorderLight, RoundedCornerShape(20.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(36.dp).clip(CircleShape).background(BluePrimary),
            contentAlignment = Alignment.Center
        ) {
            Text("JD", color = Color.White, fontWeight = FontWeight.Bold)
        }
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text("Jane Doe", fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 16.sp,
                color = TextPrimary)
            Text("Android Dev Class", fontSize = 12.sp,
                lineHeight = 16.sp,
                color = TextSecondary)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileChipPreview() {
    PrakpmTheme {
        Box(Modifier.padding(24.dp)) {
            ProfileChip()
        }
    }
}