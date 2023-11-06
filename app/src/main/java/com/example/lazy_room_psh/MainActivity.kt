package com.example.lazy_room_psh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lazy_room_psh.databinding.ActivityMainBinding
import com.example.lazy_room_psh.RoomAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = RoomAdapter()
    //private nameIdList= listof()
    private var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.adapter= adapter
            buttonadd.setOnClickListener {
                val room = Rooms("Room $index" )
                adapter.addRoom(room)
                index++
            }
        }
    }
}