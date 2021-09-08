package com.example.myapplication2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication2.ui.theme.MyApplication2Theme

class Design2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.onPrimary) {
                    Greeting1(Message1("12GB","snapdragon 888 procesor",
                        "40 MP Main Camera","20 MP front camera",
                        "Water Prooof","256GB SSd","RS 10000"))
                }
            }
        }
    }
}
data class Message1(val RAM:String,
                   val Proccesor:String,
                   val Main_camera:String,
                   val Front_camera:String,
                   val Water_proff:String,
                   val SSD_space:String,val Price:String
)
@Composable
fun Greeting1(msg:Message1) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(600.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
                Text(text = "----------------------------------------------------------------------")
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.image4), modifier =
                        Modifier.width(310.dp).height(210.dp), contentDescription = ""
                    )
                    Column {
                        Text(
                            text = msg.RAM,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.Proccesor,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.Main_camera,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.Front_camera,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.Water_proff,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.SSD_space,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            text = msg.Price,
                            modifier = Modifier.padding(top = 8.dp, start = 22.dp),
                            fontSize = 18.sp
                        )


                    }


                }
                Column() {

                    Text(text = "-----------------------------------------------------------------------")


                    Row(modifier = Modifier.padding(bottom = 0.dp)) {
                        Text(
                            text = "ADD to Compare", modifier = Modifier.padding(
                                top = 14.dp, start = 22.dp
                            )
                        )
                        val mRememberObserver = remember { mutableStateOf("") }

                        RadioButton(modifier = Modifier.padding(
                            top = 24.dp, start = 150.dp
                        ),
                            selected = mRememberObserver.value == "mText",
                            onClick = { mRememberObserver.value = "mText" })

                    }

                }
            }

        }

    }

}

