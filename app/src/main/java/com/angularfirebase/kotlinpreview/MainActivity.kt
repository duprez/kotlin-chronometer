package com.angularfirebase.kotlinpreview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Chronometer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var on: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<Chronometer>(R.id.counter) as Chronometer
        val playText = findViewById<TextView>(R.id.play) as TextView

        val play = findViewById<Button>(R.id.play) as Button
        play.setOnClickListener {
            if (this.on) {
                stopCounter(counter)
                playText.setText("PLAY")
                Toast.makeText(this@MainActivity, "Stopping", Toast.LENGTH_SHORT).show()
            } else {
                playCounter(counter)
                playText.setText("STOP")
                Toast.makeText(this@MainActivity, "Playing", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun playCounter(counter: Chronometer) {
        this.on = true
        counter.start()
    }

    fun stopCounter(counter: Chronometer) {
        this.on = false
        counter.stop()
    }

}
