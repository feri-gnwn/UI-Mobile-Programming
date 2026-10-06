package com.feri.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.feri.myapplication.ui.theme.AppBackground
import com.feri.myapplication.ui.theme.BluePrimary
import com.feri.myapplication.ui.theme.BorderLight
import com.feri.myapplication.ui.theme.FocusItem
import com.feri.myapplication.ui.theme.PrakpmTheme
import com.feri.myapplication.ui.theme.TextPrimary
import com.feri.myapplication.ui.theme.TopicCard
import com.feri.myapplication.ui.theme.component.CardPrimary
import com.feri.myapplication.ui.theme.component.ProfileChip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakpmTheme {
                BerandaScreen()
            }
        }
    }
}

@Composable
fun BerandaScreen() {
    var selected by remember { mutableIntStateOf(0) }
    val tabs = listOf(
        "Home" to R.drawable.ic_home,
        "Lessons" to R.drawable.ic_book,
        "Class" to R.drawable.ic_group,
        "Profile" to R.drawable.ic_person
    )
    Scaffold(
        containerColor = AppBackground,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = CircleShape,
                containerColor = BluePrimary,
                contentColor = Color.White
            ) {
                Icon(painterResource(R.drawable.ic_add), contentDescription = "Add")
            }
        },
        bottomBar = {
            Column() {
                HorizontalDivider(thickness = 1.dp, color = BorderLight)
                NavigationBar(containerColor = Color.White) {
                    tabs.forEachIndexed { i, (label, icon) ->
                        NavigationBarItem(
                            selected = selected == i,
                            onClick = { selected = i },
                            icon = { Icon(painterResource(icon), contentDescription = label) },
                            label = { Text(label) }
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Beranda(Modifier.padding(innerPadding))
    }
}

@Composable
fun Beranda(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AppBackground)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileChip()
            OutlinedIconButton(
                onClick = {},
                border = BorderStroke(1.dp, BorderLight),
                colors = IconButtonDefaults.outlinedIconButtonColors(containerColor = Color.White)
            ) {
                Icon(painterResource(R.drawable.ic_search), contentDescription = "Search")
            }
        }

        CardPrimary()

        Row(
            modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            TopicCard(
                icon = R.drawable.ic_code, iconTint = BluePrimary, iconBg = Color(0xFFEFF6FF),
                title = "Compose", description = "UI, state, and layout patterns.",
                modifier = Modifier.weight(1f).fillMaxHeight()
            )
            TopicCard(
                icon = R.drawable.ic_layers,
                iconTint = Color(0xFF10B981),
                iconBg = Color(0xFFECFDF5),
                title = "Architecture",
                description = "MVVM, data flow, and clean layers.",
                modifier = Modifier.weight(1f).fillMaxHeight()
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Today's focus",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = TextPrimary
            )
            Text("View all", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = BluePrimary)
        }

        Column (verticalArrangement = Arrangement.spacedBy(12.dp)) {
            FocusItem(
                R.drawable.ic_dashbboard, BluePrimary, Color(0xFFEFF6FF),
                "Compose layout patterns",
                "Learn Row, Column, LazyColumn, and how to structure a simple homepage."
            )
            FocusItem(
                R.drawable.ic_storage, Color(0xFF10B981), Color(0xFFECFDF5),
                "Room persistence",
                "Store data locally with entities, DAOs, and a simple offline-first flow."
            )
            FocusItem(
                R.drawable.ic_shield, Color(0xFFF97316), Color(0xFFFFF7ED),
                "Security basics",
                "Permissions, secure storage, and best practices for a production-ready app."
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BerandaPreview() {
    PrakpmTheme {
        BerandaScreen()
    }
}















