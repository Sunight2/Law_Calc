package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet141Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment141 : Fragment() {

    lateinit var binding: FragmentRaschet141Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()
    private val dataModelTextPodr: DataModelTextPodr by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet141Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val one = binding.fourthree1.text.toString()
        val two = binding.fourthree2.text.toString()
        val three = binding.fourthree3.text.toString()
        val four = binding.fourthree4.text.toString()
        val five = binding.fourthree5.text.toString()
        val six = binding.fourthree6.text.toString()
        val seven = binding.fourthree7.text.toString()
        val eight = binding.fourthree8.text.toString()
        val nine = binding.fourthree9.text.toString()
        val ten = binding.fourthree10.text.toString()
        val eleven = binding.fourthree11.text.toString()
        val twelve = binding.fourthree12.text.toString()
        val fragment = RaschetFragmentLast()

        binding.fourthree1.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = one
            dataModelChena.massage.value = "6 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourthree2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "6 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourthree3.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "3000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourthree4.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = four
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourthree5.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourthree6.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourthree7.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourthree8.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.fourthree9.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourthree10.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "4 500 рублей"
        }
        binding.fourthree11.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "2 000 рублей"
        }
        binding.fourthree12.setOnClickListener{
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
        fun newInstance() = RaschetFragment11()
    }

}