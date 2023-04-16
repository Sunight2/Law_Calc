package add.larionov.law

import add.larionov.law.databinding.FragmentKlavaBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class KlavaFragment : Fragment() {

    lateinit var binding: FragmentKlavaBinding
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKlavaBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btn0.setOnClickListener{dataModel.massage.value = "0"}
        binding.btn1.setOnClickListener{dataModel.massage.value = "1"}
        binding.btn2.setOnClickListener{dataModel.massage.value = "2"}
        binding.btn3.setOnClickListener{dataModel.massage.value = "3"}
        binding.btn4.setOnClickListener{dataModel.massage.value = "4"}
        binding.btn5.setOnClickListener{dataModel.massage.value = "5"}
        binding.btn6.setOnClickListener{dataModel.massage.value = "6"}
        binding.btn7.setOnClickListener{dataModel.massage.value = "7"}
        binding.btn8.setOnClickListener{dataModel.massage.value = "8"}
        binding.btn9.setOnClickListener{dataModel.massage.value = "9"}
        binding.btnZ.setOnClickListener{dataModel.massage.value = "."}
        binding.btnB.setOnClickListener{dataModel.massage.value = "-"}
    }

    companion object {
        @JvmStatic
        fun newInstance() = KlavaFragment()
    }
}