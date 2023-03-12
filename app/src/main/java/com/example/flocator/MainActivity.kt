package com.example.flocator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flocator.fragments.main.MainFragment
import com.yandex.mapkit.MapKitFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("fd3ecdab-a39c-4b8b-a215-44a8458a84bf")
        MapKitFactory.initialize(this) // TODO: remove from onCreate
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, MainFragment())
            .commit()
    }
}