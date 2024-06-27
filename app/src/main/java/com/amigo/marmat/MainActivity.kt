package com.amigo.marmat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1. 화면이 클릭되었다는 것을 알아야 한다(프로그램이): Toast 메시지 띄우기
        val image1 = findViewById<ImageView>(R.id.BTSImage1) // ID는 activity_main.xml에서 지정했다.
        val image2 = findViewById<ImageView>(R.id.BTSImage2)
        val image3 = findViewById<ImageView>(R.id.BTSImage3)
        val image4 = findViewById<ImageView>(R.id.BTSImage4)
        val image5 = findViewById<ImageView>(R.id.BTSImage5)
        val image6 = findViewById<ImageView>(R.id.BTSImage6)
        val image7 = findViewById<ImageView>(R.id.BTSImage7)


        image1.setOnClickListener {
            // Toast는 메시지창을 띄우는 기능이다.
            // Toast.LENGTH_LONG는 3.5초 메시지 띄우기, Toast.LENGTH_SHORT는 2초 메시지 띄우기
            
            // this라는 건 image1에 대해서 어떻게 할 거냐는 거다.
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!!
            // this라는 건 image1에 대해서 어떻게 할 거냐는 거다.
            val intent = Intent(this, BTS1Activity::class.java)
            startActivity(intent)
        }


        image2.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()
            
            // 화면 넘기기
            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }


        image3.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 화면 넘기기
            val intent = Intent(this, BTS3Activity::class.java)
            startActivity(intent)
        }


        image4.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 화면 넘기기
            val intent = Intent(this, BTS4Activity::class.java)
            startActivity(intent)
        }


        image5.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 화면 넘기기
            val intent = Intent(this, BTS5Activity::class.java)
            startActivity(intent)
        }


        image6.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 화면 넘기기
            val intent = Intent(this, BTS6Activity::class.java)
            startActivity(intent)
        }


        image7.setOnClickListener {
            // 메시지 출력
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 화면 넘기기
            val intent = Intent(this, BTS7Activity::class.java)
            startActivity(intent)
        }


    }
}