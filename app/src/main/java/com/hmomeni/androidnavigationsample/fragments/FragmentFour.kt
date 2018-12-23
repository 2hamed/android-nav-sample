package com.hmomeni.androidnavigationsample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hmomeni.androidnavigationsample.App
import com.hmomeni.androidnavigationsample.R
import com.hmomeni.androidnavigationsample.nav.NavEvent
import io.reactivex.processors.PublishProcessor
import kotlinx.android.synthetic.main.fragment_one.*
import javax.inject.Inject

class FragmentFour : Fragment() {
    @Inject
    lateinit var navEvents: PublishProcessor<NavEvent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (context!!.applicationContext as App).di.inject(this)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_foure, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            navEvents.onNext(NavEvent(NavEvent.Destination.ONE))
        }
    }

}