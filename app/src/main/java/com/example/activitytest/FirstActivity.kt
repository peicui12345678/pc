package com.example.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.activitytest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = FirstLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener{
            val data ="hello SecondActivity"
            val intent =Intent(this,SecondActivity::class.java)
            intent.putExtra("extra_data",data)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"you clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"you clicked Remove",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}