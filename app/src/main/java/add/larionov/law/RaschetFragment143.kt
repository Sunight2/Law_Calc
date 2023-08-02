package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet143Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment143 : Fragment() {

    lateinit var binding: FragmentRaschet143Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()
    private val dataModelTextPodr: DataModelTextPodr by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet143Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val one = binding.fourfife1.text.toString()
        val two = binding.fourfife2.text.toString()
        val three = binding.fourfife3.text.toString()
        val four = binding.fourfife4.text.toString()
        val five = binding.fourfife5.text.toString()
        val six = binding.fourfife6.text.toString()
        val seven = binding.fourfife7.text.toString()
        val eight = binding.fourfife8.text.toString()
        val nine = binding.fourfife9.text.toString()
        val ten = binding.fourfife10.text.toString()
        val eleven = binding.fourfife11.text.toString()
        val twelve = binding.fourfife12.text.toString()
        val fragment = RaschetFragmentLast()
        val one1 = binding.fourfife1.text.toString()

        binding.fourfife1.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = one
            dataModelChena.massage.value = "6 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourfife2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "6 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourfife3.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "3 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourfife4.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = four
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfife5.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfife6.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfife7.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfife8.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.fourfife9.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfife10.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "4 500 рублей"
        }
        binding.fourfife11.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "2 000 рублей"
        }
        binding.fourfife12.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = twelve
            dataModelChena.massage.value = "6 000 рублей"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaschetFragment143()
    }

}