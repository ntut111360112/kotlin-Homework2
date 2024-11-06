package com.example.kotlinla4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var tvMeal: TextView
    private lateinit var btnSelect: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMeal = findViewById(R.id.tv_meal)
        btnSelect = findViewById(R.id.btn_choice)

        // 註冊 Activity 的結果
        val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == 101) {
                val data = result.data?.extras
                val drink = data?.getString("drink")
                val sugar = data?.getString("sugar")
                val ice = data?.getString("ice")
                tvMeal.text = "飲料: $drink\n\n甜度: $sugar\n\n冰塊: $ice"
            }
        }

        // 設定按鈕的點擊事件
        btnSelect.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            resultLauncher.launch(intent)
        }
    }
}
