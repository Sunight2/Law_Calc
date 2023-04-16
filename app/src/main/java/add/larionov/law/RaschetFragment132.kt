package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet132Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment132 : Fragment() {

    lateinit var binding: FragmentRaschet132Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet132Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val one = binding.threefour1.text.toString()
        val two = binding.threefour2.text.toString()
        val three = binding.threefour3.text.toString()
        val four = binding.threefour4.text.toString()
        val five = binding.threefour5.text.toString()
        val six = binding.threefour6.text.toString()
        val seven = binding.threefour7.text.toString()
        val eight = binding.threefour8.text.toString()
        val nine = binding.threefour9.text.toString()
        val ten = binding.threefour10.text.toString()
        val eleven = binding.threefour11.text.toString()
        val twelve = binding.threefour12.text.toString()
        val fragment = RaschetFragmentLast()

        binding.threefour1.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = one
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threefour2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threefour3.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "150 рублей"
        }
        binding.threefour4.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = four
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.threefour5.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.threefour6.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.threefour7.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threefour8.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "150 рублей"
        }
        binding.threefour9.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.threefour10.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "150 рублей"
        }
        binding.threefour11.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "150 рублей"
        }
        binding.threefour12.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = twelve
            dataModelChena.massage.value = "3 000 рублей"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaschetFragment11()
    }

}