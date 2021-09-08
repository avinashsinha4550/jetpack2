package com.example.myapplication2

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication2.ui.theme.MyApplication2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.onPrimary) {
                    Greeting(Message("12GB","snapdragon 888 procesor",
                    "40 MP Main Camera","20 MP front camera",
                    "Water Prooof","256GB SSd","RS 10000"))
                }
            }
        }
    }
}
data class Message(val RAM:String,
                   val Proccesor:String,
                   val Main_camera:String,
                   val Front_camera:String,
                   val Water_proff:String,
                   val SSD_space:String,val Price:String
)
@Composable
fun Greeting(msg:Message) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(360.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
                Text(text = "----------------------------------------------------------------------")
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.image4), modifier =
                        Modifier.size(210.dp).padding(start = 0.dp), contentDescription = ""
                    )
                    Column {
                        Text(
                            text = msg.RAM,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Proccesor,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Main_camera,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Front_camera,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Water_proff,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.SSD_space,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Price,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )


                    }


                }
                Column() {

                    Text(text = "-----------------------------------------------------------------------")

                    Row() {
                        Text(
                            text = "ADD to Compare", modifier = Modifier.padding(
                                top = 24.dp, start = 22.dp
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
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(10.dp).padding(top = 380.dp).fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(350.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
                Text(text = "----------------------------------------------------------------------")
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.image4), modifier =
                        Modifier.size(210.dp).padding(start = 0.dp), contentDescription = ""
                    )
                    Column {
                        Text(
                            text = msg.RAM,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Proccesor,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Main_camera,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Front_camera,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Water_proff,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.SSD_space,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = msg.Price,
                            modifier = Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )


                    }


                }
                Column() {

                    Text(text = "-----------------------------------------------------------------------")

                    Row() {
                        Text(
                            text = "ADD to Compare", modifier = Modifier.padding(
                                top = 24.dp, start = 22.dp
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


   








//