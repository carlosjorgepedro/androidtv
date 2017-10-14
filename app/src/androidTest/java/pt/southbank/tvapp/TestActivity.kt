package pt.southbank.tvapp

import android.os.Bundle
import android.support.v4.app.FragmentActivity

/**
 * carlosjpedro : 08/10/2017.
 */

class TestActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity)
    }
}