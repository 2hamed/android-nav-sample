package com.hmomeni.androidnavigationsample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.hmomeni.androidnavigationsample.nav.NavEvent
import io.reactivex.processors.PublishProcessor
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navEvents: PublishProcessor<NavEvent>

    private lateinit var navController: NavController

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).di.inject(this)

        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.mainNav)

        navEvents.subscribe {
            when (it.destination) {
                NavEvent.Destination.ONE -> navController.popBackStack(R.id.fragmentOne, false)
                NavEvent.Destination.TWO -> navController.navigate(R.id.action_fragmentOne_to_fragmentTwo)
                NavEvent.Destination.THREE -> when (navController.currentDestination!!.id) {
                    R.id.fragmentOne -> navController.navigate(R.id.action_fragmentOne_to_fragmentThree)
                    R.id.fragmentTwo -> navController.navigate(R.id.action_fragmentTwo_to_fragmentThree)
                }
                NavEvent.Destination.FOUR -> navController.navigate(R.id.action_fragmentTwo_to_fragmentFour)
            }
        }
    }
}
