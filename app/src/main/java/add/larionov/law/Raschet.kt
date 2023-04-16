package add.larionov.law

import add.larionov.law.databinding.ActivityRaschetBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import kotlin.math.roundToInt

class Raschet : AppCompatActivity() {

    lateinit var binding: ActivityRaschetBinding
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaschetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Расчет госпошлины"
        openFrag(KlavaFragment.newInstance(), R.id.place_klava)

        dataModel.massage.observe(this, {
            val newData = it
            val lastT = binding.tChena.text
            if (newData == "-") {
                if (binding.tChena.text.isNullOrEmpty()) {
                    binding.tChena.hint = "Введите цену иска"
                    binding.tFiz.text = ""
                    binding.tUr.text = ""
                    binding.tPrikaz.text = ""
                    binding.tFizAr1.text = ""
                    binding.tUrAr1.text = ""
                    binding.tPrikazAr1.text = ""
                }
                else {
                    binding.tChena.text = lastT.substring(0, lastT.toString().length - 1)
                    binding.tFiz.text = ""
                    binding.tUr.text = ""
                    binding.tPrikaz.text = ""
                    binding.tFizAr1.text = ""
                    binding.tUrAr1.text = ""
                    binding.tPrikazAr1.text = ""
                }
            }
            else if (newData == "."){
                val dot = "."
                if (dot in lastT) binding.tChena.hint = "Введите цену иска"
                else binding.tChena.text = lastT.toString() + newData
            }
            else binding.tChena.text = lastT.toString() + newData
        })
    }

    private fun openFrag(f: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }

    fun onClickClear(view: View) {
        binding.tChena.text = ""
        binding.tChena.hint = "Введите цену иска"
        binding.tFiz.text = ""
        binding.tUr.text = ""
        binding.tPrikaz.text = ""
        binding.tFizAr1.text = ""
        binding.tUrAr1.text = ""
        binding.tPrikazAr1.text = ""
    }

    fun onClickResult(view: View) {
        if (!isFieldEmpty()) {
            val b = getResult().toDouble()
            val v = getResult1().toDouble()
            val w = getResult2().toDouble()
            val z = getResult3().toDouble()
            val x = getResult4().toDouble()
            val q = getResult5().toDouble()
            val e = getResult6().toDouble()
            val r = getResult7().toDouble()
            val t = getResult8().toDouble()
            val p = getResult9().toDouble()
            val polb = (((b / 2) * 100.0).roundToInt() / 100.0)
            val polv = (((v / 2) * 100.0).roundToInt() / 100.0)
            val polw = (((w / 2) * 100.0).roundToInt() / 100.0)
            val polz = (((z / 2) * 100.0).roundToInt() / 100.0)
            val polx = (((x / 2) * 100.0).roundToInt() / 100.0)
            val polq = (((q / 2) * 100.0).roundToInt() / 100.0)
            val pole = (((e / 2) * 100.0).roundToInt() / 100.0)
            val polr = (((r / 2) * 100.0).roundToInt() / 100.0)
            val polt = (((t / 2) * 100.0).roundToInt() / 100.0)
            val polp = (((p / 2) * 100.0).roundToInt() / 100.0)
            val summa = binding.tChena.text.toString().toDouble()
            if (summa < 10000.1) {
                binding.tFiz.text = " - 400 рублей"
                binding.tUr.text = " - 400 рублей"
                binding.tPrikaz.text = " - 200 рублей"
                binding.tFizAr1.text = " - 2000 рублей"
                binding.tUrAr1.text = " - 2000 рублей"
                binding.tPrikazAr1.text = " - 1000 рублей"
            }
            else if (summa < 20000) {
                binding.tFiz.text = " -  " + b.toString() + " рублей"
                binding.tUr.text = " -  " + b.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polb.toString() + " рублей"
                binding.tFizAr1.text = " - 2000 рублей"
                binding.tUrAr1.text = " - 2000 рублей"
                binding.tPrikazAr1.text = " - 1000 рублей"
            }
            else if (summa < 50000.1) {
                binding.tFiz.text = " -  " + v.toString() + " рублей"
                binding.tUr.text = " -  " + v.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polv.toString() + " рублей"
                binding.tFizAr1.text = " - 2000 рублей"
                binding.tUrAr1.text = " - 2000 рублей"
                binding.tPrikazAr1.text = " - 1000 рублей"

            }
            else if (summa < 100000.01) {
                binding.tFiz.text = " -  " + v.toString() + " рублей"
                binding.tUr.text = " -  " + v.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polv.toString() + " рублей"
                binding.tFizAr1.text = " -  " + q.toString() + " рублей"
                binding.tUrAr1.text = " -  " + q.toString() + " рублей"
                binding.tPrikazAr1.text = " -  " + polq.toString() + " рублей"
            }
            else if (summa < 200000.01){
                binding.tFiz.text = " -  " + w.toString() + " рублей"
                binding.tUr.text = " -  " + w.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polw.toString() + " рублей"
                binding.tFizAr1.text = " -  " + e.toString() + " рублей"
                binding.tUrAr1.text = " -  " + e.toString() + " рублей"
                binding.tPrikazAr1.text = " -  " + pole.toString() + " рублей"
            }
            else if (summa < 400000.01){
                binding.tFiz.text = " -  " + z.toString() + " рублей"
                binding.tUr.text = " -  " + z.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polz.toString() + " рублей"
                binding.tFizAr1.text = " -  " + r.toString() + " рублей"
                binding.tUrAr1.text = " -  " + r.toString() + " рублей"
                binding.tPrikazAr1.text = " -  " + polr.toString() + " рублей"
            }
            else if (summa < 500000.01){
                binding.tFiz.text = " -  " + z.toString() + " рублей"
                binding.tUr.text = " -  " + z.toString() + " рублей"
                binding.tPrikaz.text = " -  " + polz.toString() + " рублей"
                binding.tFizAr1.text = " -  " + r.toString() + " рублей"
                binding.tUrAr1.text = " -  " + r.toString() + " рублей"
                binding.tPrikazAr1.text = " - - - - - - - "
            }
            else if (summa < 600000.01){
                binding.tFiz.text = " -  " + z.toString() + " рублей"
                binding.tUr.text = " -  " + z.toString() + " рублей"
                binding.tPrikaz.text = " - - - - - - - "
                binding.tFizAr1.text = " -  " + r.toString() + " рублей"
                binding.tUrAr1.text = " -  " + r.toString() + " рублей"
                binding.tPrikazAr1.text = " - - - - - - - "
            }
            else if (summa < 1000000.01){
                binding.tFiz.text = " -  " + z.toString() + " рублей"
                binding.tUr.text = " -  " + z.toString() + " рублей"
                binding.tPrikaz.text = " - - - - - - - "
                binding.tFizAr1.text = " -  " + r.toString() + " рублей"
                binding.tUrAr1.text = " -  " + r.toString() + " рублей"
                binding.tPrikazAr1.text = " - - - - - - - "
            }
            else if (summa < 2000000.01){
                    binding.tFiz.text = " -  " + x.toString() + " рублей"
                    binding.tUr.text = " -  " + x.toString() + " рублей"
                    binding.tPrikaz.text = " - - - - - - - "
                    binding.tFizAr1.text = " -  " + t.toString() + " рублей"
                    binding.tUrAr1.text = " -  " + t.toString() + " рублей"
                    binding.tPrikazAr1.text = " - - - - - - - "
            }
            else if (summa < 15000000.00){
                if (x < 60000) {
                    binding.tFiz.text = " -  " + x.toString() + " рублей"
                    binding.tUr.text = " -  " + x.toString() + " рублей"
                    binding.tPrikaz.text = " - - - - - - - "
                    binding.tFizAr1.text = " -  " + p.toString() + " рублей"
                    binding.tUrAr1.text = " -  " + p.toString() + " рублей"
                    binding.tPrikazAr1.text = " - - - - - - - "
                }
                else {
                    binding.tFiz.text = " - 60000 рублей"
                    binding.tUr.text = " - 60000 рублей"
                    binding.tPrikaz.text = " - - - - - - - "
                    binding.tFizAr1.text = " -  " + p.toString() + " рублей"
                    binding.tUrAr1.text = " -  " + p.toString() + " рублей"
                    binding.tPrikazAr1.text = " - - - - - - - "
                }
            }
            else {
                if (p < 200000) {
                    binding.tFiz.text = " - 60000 рублей"
                    binding.tUr.text = " - 60000 рублей"
                    binding.tPrikaz.text = " - - - - - - - "
                    binding.tFizAr1.text = " -  " + p.toString() + " рублей"
                    binding.tUrAr1.text = " -  " + p.toString() + " рублей"
                    binding.tPrikazAr1.text = " - - - - - - - "
                }
                else {
                    binding.tFiz.text = " - 60 000 рублей"
                    binding.tUr.text = " - 60 000 рублей"
                    binding.tPrikaz.text = " - - - - - - - "
                    binding.tFizAr1.text = " - 200 000 рублей"
                    binding.tUrAr1.text = " - 200 000 рублей"
                    binding.tPrikazAr1.text = " - - - - - - - "
                }
            }
        }
    }
    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if (tChena.text.isNullOrEmpty()) binding.tChena.hint = "Введите цену иска"
            return tChena.text.isNullOrEmpty()
        }
    }
    private fun getResult(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
            return ((((a / 100) * 4) * 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult1(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
            return ((((a - 20000) / 100 * 3 + 800)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult2(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 100000) / 100 * 2 + 3200)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult3(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 200000) / 100 * 1 + 5200)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult4(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 1000000) / 100 * 0.5 + 13200)* 100.0).roundToInt() / 100.0).toString()
    }
    //далее для арбитражного суда ------------------------------------------------------
    private fun getResult5(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return (((a / 100 * 4)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult6(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 100000) / 100 * 3 + 4000)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult7(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 200000) / 100 * 2 + 7000)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult8(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 1000000) / 100 * 1 + 23000)* 100.0).roundToInt() / 100.0).toString()
    }
    private fun getResult9(): String {
        val a: Double
        binding.apply {
            a = tChena.text.toString().toDouble()
        }
        return ((((a - 2000000) / 100 * 0.5 + 33000)* 100.0).roundToInt() / 100.0).toString()
    }
}

