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
    fun onClickGoRaschet(v:View) {
        val intent = Intent(this, Raschet::class.java)
        startActivity(intent)
    }
    fun onClickGoRaschetNeystoiki(v: View){
        val intent = Intent(this, Neystoika::class.java)
        startActivity(intent)
    }
    fun onClickGoAbout(v: View){
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }
    fun onClickGoRaschetPodrob(v: View){
        val intent = Intent(this, RaschetPodrob::class.java)
        startActivity(intent)
    }
}
//для добавления меню кнопок
/*
class ExampleActivity : ComponentActivity(R.layout.activity_example) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // Add menu items without overriding methods in the Activity
   addMenuProvider(object : MenuProvider {
      override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        // Add menu items here
        menuInflater.inflate(R.menu.example_menu, menu)
      }

      override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        // Handle the menu selection
        return true
      }
    })
  }
}


 */