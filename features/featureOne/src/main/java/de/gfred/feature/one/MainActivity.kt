package de.gfred.feature.one

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jakewharton.rxbinding2.view.RxView
import de.gfred.feature.one.view.two.ViewTwoButton
import de.gfred.featureoneviewone.ViewOneButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MainActivityViewActions, AppCompatActivity() {
    lateinit var buttonOne: ViewOneButton
    lateinit var buttonTwo: ViewTwoButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne = ViewOneButton(this);
        buttonTwo = ViewTwoButton(this);

        // TODO LAYOUT PARAMS?!

        RxView.clicks(buttonTwo).subscribe { Toast.makeText(this, "Button from View Two clicked.", Toast.LENGTH_SHORT).show() }

        buttonContainer.addView(buttonOne)
        buttonContainer.addView(buttonTwo)
    }

    override fun onButtonOneClicked() = RxView.clicks(buttonOne)
}
