package tw.edu.pu.csim.s1075446.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var counter:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AddOne(v: View){
        counter++
        txv.text=counter.toString()
    }
    fun AddTwo(v: View){
        counter++
        counter++
        txv.text=counter.toString()
    }
}