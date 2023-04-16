package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet131Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment131 : Fragment() {

    lateinit var binding: FragmentRaschet131Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet131Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val one = binding.threethree1.text.toString()
        val two = binding.threethree2.text.toString()
        val three = binding.threethree3.text.toString()
        val four = binding.threethree4.text.toString()
        val five = binding.threethree5.text.toString()
        val six = binding.threethree6.text.toString()
        val seven = binding.threethree7.text.toString()
        val eight = binding.threethree8.text.toString()
        val nine = binding.threethree9.text.toString()
        val ten = binding.threethree10.text.toString()
        val eleven = binding.threethree11.text.toString()
        val twelve = binding.threethree12.text.toString()
        val fragment = RaschetFragmentLast()

        binding.threethree1.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = one
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.threethree2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.threethree3.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "300 рублей"
        }
        binding.threethree4.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = four
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threethree5.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threethree6.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threethree7.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threethree8.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "300 рублей"
        }
        binding.threethree9.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threethree10.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "300 рублей"
        }
        binding.threethree11.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "300 рублей"
        }
        binding.threethree12.setOnClickListener{
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