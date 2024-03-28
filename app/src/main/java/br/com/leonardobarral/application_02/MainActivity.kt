package br.com.leonardobarral.application_02
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.leonardobarral.application_02.ui.theme.Application_02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application_02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}



@Composable
fun LayoutScreen(){

    val jogadas = remember {
        mutableStateListOf("e3", "f5", "d2", "f1", "e7")
    }

    Column (
        modifier = Modifier.fillMaxWidth()

    ){
        Row(
            modifier = Modifier
                .height(50.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_menu_24),
                    contentDescription = "Icone",
                    modifier = Modifier.clickable(
                        onClick = {
                            jogadas.add("gg4")
                        }
                    )
                )
            }

//            Spacer(modifier = Modifier.width(100.dp))
            Column (
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Column {
                        Icon(painter = painterResource(id = R.drawable.baseline_search_24), contentDescription = "Icone")
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Icon(painter = painterResource(id = R.drawable.baseline_notifications_none_24), contentDescription = "Icone")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(text = "User01")
                    }
                }
            }
        }
        fun string(teste:List<String>): String {
            var textox = ""
            teste.toList().map{ t-> textox += " $t"}
            return textox
        }
        Row(
            modifier = Modifier
                .height(40.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column (
                modifier = Modifier
                    .defaultMinSize(24.dp)
                    .weight(0.1f),
                horizontalAlignment = Alignment.Start
            ){
                Icon(painter = painterResource(id = R.drawable.baseline_skip_previous_24), contentDescription = "Icone")
            }
            Column (
                modifier = Modifier
                    .weight(0.8f)
            ){
                Row (
                    modifier = Modifier
                        .background(color = Color.LightGray)
                        .border(
                            1.dp,
                            color = Color.Gray
                        )
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ){

//

                    Text(
                        text = string(jogadas),
                        fontSize = 18.sp
                    )
                }
            }

            Column (
                modifier = Modifier
                    .defaultMinSize(24.dp)
                    .weight(0.1f),
                horizontalAlignment = Alignment.End

            ){
                Icon(painter = painterResource(id = R.drawable.baseline_skip_next_24), contentDescription = "Icone")
            }

        }
        Row(
            modifier = Modifier
                .height(40.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
//                .padding(top = 10.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column (
                modifier = Modifier
                    .minimumInteractiveComponentSize()
            ){
                Row (
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier.height(20.dp)
                ){

                    val teste = true
                    if (teste){
                        Icon(painter = painterResource(id = R.drawable.baseline_circle_green_24), contentDescription = "Icone")
                    }else{
                        Icon(painter = painterResource(id = R.drawable.baseline_circle_24), contentDescription = "Icone")
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(text = "Dvk120L")

                    Spacer(modifier = Modifier.width(10.dp))

                    val teste2 = true
                    val numero = 1850
                    if (teste2){
                        Icon(painter = painterResource(id = R.drawable.baseline_signal_cellular_green_24), contentDescription = "Icone")
                    }else{
                        Icon(painter = painterResource(id = R.drawable.baseline_signal_cellular_gray_24), contentDescription = "Icone")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "$numero")
                }
            }
            Column (
                modifier = Modifier
                    .minimumInteractiveComponentSize()
                    .background(color = Color.White)
                    .padding(
                        top = 2.5.dp,
                        end = 10.dp,
                        bottom = 2.5.dp,
                        start = 10.dp
                    )
            ){
//                Icon(painter = painterResource(id = R.drawable.baseline_skip_next_24), contentDescription = "Icone")
                Text(
                    text = "02:00",
                    fontSize = 20.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }

        }
        Row(
            modifier = Modifier
                .height(372.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .width(372.dp)
                    .background(
                        color = Color.Green
                    )
            ) {
                for(i in 1 .. 8 ){
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(46.5.dp)
                    ){
                        for (j in 1..8){

                            Column (
                                modifier = Modifier
                                    .width(46.5.dp)
                                    .height(46.5.dp)
                                    .background(
                                        color = Color(
                                            if (i % 2 == 0) {
                                                if (j % 2 == 0) {
                                                    0xFF009bc76
                                                } else {
                                                    0xF0FFFFFF
                                                }
                                            } else {
                                                if (j % 2 == 0) {
                                                    0xF0FFFFFF
                                                } else {
                                                    0xFF009bc76
                                                }
                                            }
                                        )
                                    ),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center

                            ) {
                                Text(
                                    text = "",
                                )
                            }
                        }
                    }
                }
            }
        }



        Row(
            modifier = Modifier
                .height(40.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
//                .padding(top = 10.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column (
                modifier = Modifier
                    .minimumInteractiveComponentSize()
            ){
                Row (
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier.height(20.dp)
                ){

                    val teste = true
                    if (teste){
                        Icon(painter = painterResource(id = R.drawable.baseline_circle_green_24), contentDescription = "Icone")
                    }else{
                        Icon(painter = painterResource(id = R.drawable.baseline_circle_24), contentDescription = "Icone")
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(text = "LeoMba")

                    Spacer(modifier = Modifier.width(10.dp))

                    val numero = 1374

                    Text(text = "$numero")
                }
            }
            Column (
                modifier = Modifier
                    .minimumInteractiveComponentSize()
                    .background(color = Color(0xD2738A74))
                    .padding(
                        top = 2.5.dp,
                        end = 10.dp,
                        bottom = 2.5.dp,
                        start = 10.dp
                    )
            ){
//                Icon(painter = painterResource(id = R.drawable.baseline_skip_next_24), contentDescription = "Icone")
                Text(
                    text = "01:48",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }

        }
        Row(
            modifier = Modifier
                .height(60.dp)
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(painter = painterResource(id = R.drawable.baseline_reply_24), contentDescription = "Icone")
            Icon(painter = painterResource(id = R.drawable.baseline_handshake_24), contentDescription = "Icone")
            Icon(painter = painterResource(id = R.drawable.baseline_outlined_flag_24), contentDescription = "Icone")
            Icon(painter = painterResource(id = R.drawable.baseline_menu_24), contentDescription = "Icone")

        }



    }

}




@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}




