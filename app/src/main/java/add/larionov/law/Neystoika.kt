package add.larionov.law

import add.larionov.law.databinding.ActivityNeystoikaBinding
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.roundToInt

class Neystoika : AppCompatActivity() {
    lateinit var binding: ActivityNeystoikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNeystoikaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Расчет процентов"
        binding.bRaschetN.setEnabled(false)
        binding.VivodDneiK.text = LocalDate.now()
            .format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        val a = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            a.set(Calendar.YEAR, year)
            a.set(Calendar.MONTH, month)
            a.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable(a)
        }

        binding.button2.setOnClickListener {
            DatePickerDialog(
                this,
                datePicker,
                a.get(Calendar.YEAR),
                a.get(Calendar.MONTH),
                a.get(Calendar.DAY_OF_MONTH)
            ).show()
            binding.bRaschetN.setEnabled(true)
        }

        val b = Calendar.getInstance()
        val datePicker2 = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            b.set(Calendar.YEAR, year)
            b.set(Calendar.MONTH, month)
            b.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable2(b)
        }

        binding.button3.setOnClickListener {
            DatePickerDialog(
                this,
                datePicker2,
                a.get(Calendar.YEAR),
                a.get(Calendar.MONTH),
                a.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        binding.bRaschetN.setOnClickListener() {
            if (!isFieldEmpty2() && !isFieldEmpty3())  {
                binding.apply {
                    val a = main()
                    tDniProsrochki.text = a
                    wait(100)
                    val b = neustoika()
                    tResultNeystoika.text = b + " руб."
                }
            }
        }
    }

    fun wait(ms: Int) {
        try {
            Thread.sleep(ms.toLong())
        } catch (ex: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }

    private fun updateLable(a: Calendar) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.ROOT)
        binding.VivodDneiN.setText(sdf.format(a.time))
    }

    private fun updateLable2(b: Calendar) {
        val myFormat2 = "dd-MM-yyyy"
        val sdf2 = SimpleDateFormat(myFormat2, Locale.ROOT)
        binding.VivodDneiK.setText(sdf2.format(b.time))
    }

    private fun main(): String {
        val mDate1 = binding.VivodDneiN.text
        val mDate2 = binding.VivodDneiK.text

        val mDateFormat = SimpleDateFormat("dd-MM-yyyy")

        val mDate11 = mDateFormat.parse(mDate1 as String)
        val mDate22 = mDateFormat.parse(mDate2 as String)

        val mDifference = kotlin.math.abs(mDate11.time - mDate22.time)

        val mDifferenceDates = mDifference / (24 * 60 * 60 * 1000)

        val mDayDifference = mDifferenceDates.toString()
        return mDayDifference
    }

    private fun neustoika(): String {
        val days = binding.tDniProsrochki.text.toString().toDouble()
        val stavka = binding.tProcStavka.text.toString().toDouble()
        val dolg = binding.tDolg.text.toString().toDouble()
        return (((dolg * ((days / 365) * stavka) / 100) * 100.0).roundToInt() / 100.0).toString()
    }

    private fun isFieldEmpty2(): Boolean {
        binding.apply {
            if (tDolg.text.isNullOrEmpty()) tDolg.error = "Заполните поле"
            return tDolg.text.isNullOrEmpty()
        }
    }
    private fun isFieldEmpty3(): Boolean {
        binding.apply {
            if (tProcStavka.text.isNullOrEmpty()) tProcStavka.error = "Заполните поле"
            return tProcStavka.text.isNullOrEmpty()
        }
    }
}
