package add.larionov.law

import add.larionov.law.databinding.ActivityRaschetPodrobBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment


class RaschetPodrob : AppCompatActivity() {
    private val dataModel: DataModeltwo by viewModels()
    lateinit var binding: ActivityRaschetPodrobBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaschetPodrobBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Расчет госпошлины"
        openFrag(MainRaschetFragment.newInstance(), R.id.fragmentContainerView)
    }

    private fun openFrag(f: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }

}