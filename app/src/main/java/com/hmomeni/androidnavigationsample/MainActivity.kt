package com.hmomeni.androidnavigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import io.reactivex.processors.PublishProcessor
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navEvents: PublishProcessor<NavEvent>

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).di.inject(this)

        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.mainNav)

        navEvents.subscribe {
            when(it){

            }
        }
    }
}
