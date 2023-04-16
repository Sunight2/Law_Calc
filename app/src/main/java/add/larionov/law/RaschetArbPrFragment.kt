package add.larionov.law

import add.larionov.law.databinding.FragmentRaschetArbPrBinding
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.math.roundToInt

class RaschetArbPrFragment : Fragment() {
    lateinit var binding: FragmentRaschetArbPrBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschetArbPrBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.editTextSample.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                binding.sump2.setText(s)
                if (binding.sump2.text.isNullOrEmpty()) {
                    binding.editTextSample.hint = ""
                }
                else if (!binding.sump2.text.isNullOrEmpty()) {
                    val ss = binding.sump2.text.toString().toDouble()
                    if (ss < 10) {
                        binding.posl.text = "40 рублей"
                    }
                    else {
                        val ss = binding.sump2.text.toString().toDouble()
                        val summp = (((ss * 4) * 100.0).roundToInt() / 100).toString()
                        binding.posl.text = summp + " руб."
                    }
                }
            }
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaschetArbPrFragment()
    }
}