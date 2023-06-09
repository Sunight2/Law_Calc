package add.larionov.law

import add.larionov.law.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Юридический калькулятор"
    }
    fun onClickGoRaschet(view : View){
        val intent = Intent(this, Raschet::class.java)
        startActivity(intent)
    }
    fun onClickGoRaschetNeystoiki(view : View){
        val intent = Intent(this, Neystoika::class.java)
        startActivity(intent)
    }
    fun onClickGoAbout(view : View){
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }
    fun onClickGoRaschetPodrob(view : View){
        val intent = Intent(this, RaschetPodrob::class.java)
        startActivity(intent)
    }
}