package sa.myapartment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        property.setOnClickListener {

        }
        helpdesk.setOnClickListener {

        }
        events.setOnClickListener {

        }
        accounts.setOnClickListener {

        }
        visitors.setOnClickListener {

        }
        facilities.setOnClickListener {

        }
    }
}