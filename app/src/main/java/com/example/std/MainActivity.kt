package com.example.std

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.std.ui.theme.StdTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)
        }

    }

    fun buttonClick1(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.one)
        }
    }
    fun buttonClick2(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.two)
        }
    }
    fun buttonClick3(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.three)
        }
    }

    fun buttonClick4(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.four)
        }
    }

    fun buttonClick5(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.five)
        }
    }

    fun buttonClick6(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.six)
        }
    }

    fun buttonClick7(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.seven)
        }
    }

    fun buttonClick8(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.eight)
        }
    }

    fun buttonClick9(view: View) {
        findViewById<TextView>(R.id.tv3).apply {
            ;
            text = context.getString(R.string.nine)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StdTheme {
        Greeting("Android")
    }
}
