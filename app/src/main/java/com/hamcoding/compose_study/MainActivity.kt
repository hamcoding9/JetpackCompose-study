package com.hamcoding.compose_study

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hamcoding.compose_study.ui.theme.ComposestudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposestudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // Basic
    //Text(text = "Hello $name")

    // 스텝 1: 색상을 지정하기 위해 color 파라미터에 Color.Red를 전달
    //Text(color = Color.Red, text = "Hello $name")

    // 스텝 2: Color 객체를 이용해서 해쉬값으로 색상을 전달 (ARGB 순서)
    //Text(color = Color(0xffff9944), text = "Hello $name")

    // 스텝 3: fontSize 파라미터에 30.sp를 전달
    //Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp)

    // 스텝 4: fontWeight에 FontWeight.Bold를 전달
    //Text(color = Color.Red, text = "Hello $name", fontWeight = FontWeight.Bold)

    // 스텝 5: fontFamily에 fontFamily.Cursive 전달
//    Text(
//        color = Color.Red,
//        text = "Hello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive
//    )

    // 스텝 6: letterSpacing에 2.sp 지정
//    Text(
//        color = Color.Red,
//        text = "Hello $name",
//        letterSpacing = 2.sp
//    )
    
    // 스텝 7: maxLines를 2로 지정하고 문자열을 더 추가해보자
//    Text(
//        color = Color.Red,
//        text = "Hello $name\nHello $name\nHello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        maxLines = 2,
//    )

    // 스텝 8: textDecoration에 TextDecoration.Underline을 추가해보자
//    Text(
//        color = Color.Red,
//        text = "Hello $name\nHello $name\nHello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        maxLines = 2,
//        textDecoration = TextDecoration.Underline,
//    )

    // 스텝 9: textAlign을 TextAlign.Center로 지정해보자
    // Preview에서는 텍스트 사이즈만큼 보여주기 때문에
    // modifier = Modifier.width(200.dp)나
    // modifier = Modifier.size(200.dp)를 설정해서 충분히 넓혀둔다.
    Text(
        modifier = Modifier.width(200.dp),
        color = Color.Red,
        text = "Hello $name\nHello $name\nHello $name",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        maxLines = 2,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposestudyTheme {
        Greeting("Android")
    }
}