package com.hamcoding.compose_study

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                ButtonExample(onButtonClicked = {
                    Toast.makeText(this, "Send clicked.", Toast.LENGTH_SHORT).show()
                    Log.d("btn", "button clicked")
                })
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
//    Text(
//        modifier = Modifier.width(200.dp),
//        color = Color.Red,
//        text = "Hello $name\nHello $name\nHello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        maxLines = 2,
//        textAlign = TextAlign.Center
//    )

/**
 * surface 학습 (23.06.13)
 */
/*    Surface(
        modifier = Modifier.padding(5.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }*/

    // 스텝 1: Surface에 elevation을 설정합시다.
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        elevation = 10.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 2: border의 값을 설정해봅시다.
//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 5.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 3: Surface의 shape도 설정해봅시다.
//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 5.dp,
//        shape = CircleShape
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 4: color를 지정합시다.
    // MaterialTheme.colors에서 primary, error,
    // background, surface, secondary 등을 지정해봅시다.
    // contentColor가 자동으로 선택됩니다.
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta
        ),
        modifier = Modifier.padding(5.dp),
        elevation = 5.dp,
        shape = CircleShape,
        color = MaterialTheme.colors.error,
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposestudyTheme {
        Greeting("Android")
    }
}

/**
 * Button 학습
 */

@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
    // 스텝 1: Button을 클릭했을 때 Toast를 출력하게 만들어봅시다.
//    Button(onClick = onButtonClicked) {
//        Text(text = "Send")
//    }

    // 스텝 2: Icon을 Text 앞에 추가시켜봅시다.
    // imageVector에는 Icons.Filled.Send를 넣고
    // contentDescription에는 null을 넣어봅시다.
//    Button(onClick = onButtonClicked) {
//        Icon(
//          imageVector = Icons.Filled.Send,
//          contentDescription = null,
//        )
//        Text(text = "Send")
//    }

    // 스텝 3: 아이콘과 텍스트 사이에 Spacer를 넣어봅시다.
    // modifier에 Modifier.size를 넣고 사이즈를
    // ButtonDefaults.IconSpacing을 지정합시다.

//    Button(onClick = onButtonClicked) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(text = "Send")
//    }

    // 스텝 4: enabled를 false로 바꾸어 봅시다.
//        Button(
//            onClick = onButtonClicked,
//            enabled = false
//        ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(text = "Send")
//    }

    // 스텝 5: border에 BorderStroke를 설정합시다.
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(text = "Send")
//    }

    // 스텝 6: shape를 CircleShape로 지정합시다.
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta),
//        shape = CircleShape,
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(text = "Send")
//    }

    // 스텝 7: contentPadding에 PaddingValues를 설정합시다.
    Button(
        onClick = onButtonClicked,
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text(text = "Send")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewButton() {
    ComposestudyTheme {
        ButtonExample(onButtonClicked = {})
    }
}

/**
 * Modifier 학습
 */

@Composable
fun ModifierEx() {
    // 스텝 1: modifier에 Modifier.fillMaxSize()를 사용해봅시다.
/*    Button(
        onClick = {},
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 2: fillMaxSize 대신 Modifier.height를 설정해봅시다.
/*        Button(
        onClick = {},
        modifier = Modifier.height(100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 3: modifier에 height와 width를 같이 설정해봅시다.
/*    Button(
        onClick = {},
        modifier = Modifier
            .height(100.dp)
            .width(150.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 4: size에 width와 height를 인자로 넣을 수도 있다.
/*    Button(
        onClick = {},
        modifier = Modifier.size(200.dp, 100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 5: background를 설정해 봅시다. (버튼에서는 되지 않음.)
    // colors 파라미터에 ButtonDefaults.buttonColors를 넣어 보세요.
    // backgroundColor와 contentColor 프로퍼티를 설정하세요.
/*    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = Color.Cyan,
        ),
        onClick = {},
        modifier = Modifier.size(200.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 7: Button의 modifier에 padding을 추가해봅시다.
/*    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = Color.Cyan,
        ),
        onClick = {},
        modifier = Modifier.padding(100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }*/

    // 스텝 8: Button의 enabled를 false로 설정하고, Text의
    // modifier에 clickable을 넣어봅시다.
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color.Magenta,
//            contentColor = Color.Cyan,
//        ),
//        onClick = {},
//        enabled = false,
//        modifier = Modifier.size(200.dp).padding(30.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(
//            "Search",
//            modifier = Modifier.clickable { }
//        )
//    }

    // 스텝 9: Text의 modifier에 offset을 설정하고 x 파라미터를
    // 설정합니다.
    // 또한, offset을 눈으로 확인하기 위해 background color를 설정해봅니다.
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = Color.Cyan,
        ),
        onClick = {},
        modifier = Modifier
            .size(200.dp)
            .padding(30.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(
            modifier = Modifier
                .size(ButtonDefaults.IconSpacing)
                .background(Color.Blue)
        )
        Text(
            "Search",
            modifier = Modifier
                .offset(x = 10.dp)
                .background(Color.Blue)
        )
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreviewModifier() {
    ComposestudyTheme {
        ModifierEx()
    }
}

/**
 * BOX 실습
 */
@Composable
fun BoxEx() {
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.Center))
//    }

    // 스텝 1: Text 두 개를 Box 안에 배치해봅시다.
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
//        Text(text = "Jetpack", modifier = Modifier.align(Alignment.CenterEnd))
//    }

    // 스텝 2: 2개의 Box를 Box 안에 배치하고 사이즈를 70dp, 색상을 각기 다르게 해봅시다.
//    Box(modifier = Modifier.size(100.dp)) {
//        Box(modifier = Modifier.size(70.dp).background(Color.Cyan).align(Alignment.CenterStart))
//        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.BottomEnd))
//    }
    
    // 스텝 3: 부모 Box에 modifier 설정을 제거해서 컨텐트 사이즈만큼 보여주게 합시다.
    // 그리고 첫 번째 자식 Box의 사이즈를 matchParentSize()로 설정해봅시다.
    // 다음에는 fillMaxSize()로 설정해봅시다.
    Box {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .align(Alignment.CenterStart))
        Box(modifier = Modifier
            .size(70.dp)
            .background(Color.Yellow)
            .align(Alignment.Center))
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreviewBox() {
    ComposestudyTheme {
        BoxEx()
    }
}

/**
 * Row 학습
 */
@Composable
fun RowEx() {
//    Row(modifier = Modifier.height(40.dp)) {
//        Text(text = "첫 번째!")
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }

    // 스텝 1: 각 Text의 modifier에 align을 설정합시다.
    // Alignment.Top, CenterVertically, Bottom을 지정해봅시다.
    // Row의 기본 방향은 horizontally하고, Modifier로 지정할 수 있는 방향은 Vertically하다.
//    Row(modifier = Modifier.height(40.dp)) {
//        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
//        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
//        Text(text = "세 번째!", modifier = Modifier.align(Alignment.Bottom))
//    }

    // 스텝 2: Row에 verticalAlignment를 설정해봅시다.
    // 자식 Component에 동일한 Alignment를 주고 싶을 때!
//    Row(
//        modifier = Modifier.height(40.dp),
//        verticalAlignment = Alignment.Bottom
//    ) {
//        Text(text = "첫 번째!")
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }

    // 스텝 3: Row의 width를 200dp로 설정합시다.
    // Row에 horizontalArrangement에 Arrangment.Center를
    // 설정해봅시다. Start, End, SpaceAround, SpaceBetween
    // SpaceEvenly를 설정해봅시다.
//    Row(
//        verticalAlignment = Alignment.Bottom,
//        modifier = Modifier.height(40.dp).width(200.dp),
//        horizontalArrangement = Arrangement.Center
//    ) {
//        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }

    // 스텝 4: horizontalArrangement를 제거하고 각 Text에
    // Modifier.weight를 설정합시다. 각 항목의 weight 값을 바꾸어 보세요.
//    Row(
//        verticalAlignment = Alignment.Bottom,
//        modifier = Modifier
//            .height(40.dp)
//            .width(200.dp)
//    ) {
//        Text(text = "첫 번째!",
//            modifier = Modifier.weight(3f)
//        )
//        Text(
//            text = "두 번째!",
//            modifier = Modifier.weight(3f)
//        )
//        Text(
//            text = "세 번째!",
//            modifier = Modifier.weight(3f)
//        )}

    // 스텝 5: Text 대신 Icon을 하나 넣어봅시다.
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(text = "첫 번째!",
            modifier = Modifier.weight(3f)
        )
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "추가",
            modifier = Modifier.weight(1f)
                .background(Color.Cyan)
        )
        Text(
            text = "세 번째!",
            modifier = Modifier.weight(3f)
        )}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewRow() {
    ComposestudyTheme{
        RowEx()
    }
}