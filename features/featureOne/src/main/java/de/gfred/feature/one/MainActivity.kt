package de.gfred.feature.one

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.jakewharton.rxbinding2.view.RxView
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : MainActivityViewActions, AppCompatActivity() {


    @Inject


    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne = Button(this);
        buttonTwo = Button(this);

        // TODO LAYOUT PARAMS?!

        RxView.clicks(buttonTwo).subscribe { Toast.makeText(this, "Button from View Two clicked.", Toast.LENGTH_SHORT).show() }

        buttonContainer.addView(buttonOne)
        buttonContainer.addView(buttonTwo)
    }

    override fun onButtonOneClicked() = RxView.clicks(buttonOne)
}
