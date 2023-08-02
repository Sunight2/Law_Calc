package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet142Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment142 : Fragment() {

    lateinit var binding: FragmentRaschet142Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()
    private val dataModelTextPodr: DataModelTextPodr by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet142Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val one = binding.fourfour1.text.toString()
        val two = binding.fourfour2.text.toString()
        val three = binding.fourfour3.text.toString()
        val four = binding.fourfour4.text.toString()
        val five = binding.fourfour5.text.toString()
        val six = binding.fourfour6.text.toString()
        val seven = binding.fourfour7.text.toString()
        val eight = binding.fourfour8.text.toString()
        val nine = binding.fourfour9.text.toString()
        val ten = binding.fourfour10.text.toString()
        val eleven = binding.fourfour11.text.toString()
        val twelve = binding.fourfour12.text.toString()
        val fragment = RaschetFragmentLast()

        binding.fourfour1.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = one
            dataModelChena.massage.value = "3 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourfour2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "3 000 рублей"
            dataModelTextPodr.massage.value = R.string.three_one_one1.toString()
        }
        binding.fourfour3.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.fourfour4.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = four
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.fourfour5.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.fourfour6.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "1 500 рублей"
        }
        binding.fourfour7.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfour8.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfour9.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.fourfour10.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "2 250 рублей"
        }
        binding.fourfour11.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "1 000 рублей"
        }
        binding.fourfour12.setOnClickListener{
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