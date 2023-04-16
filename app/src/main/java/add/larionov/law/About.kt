package add.larionov.law

import add.larionov.law.databinding.ActivityAboutBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class About : AppCompatActivity() {
    lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "О программе"
    }

}