package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet12Binding
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels


class RaschetFragment12 : Fragment() {

    lateinit var binding: FragmentRaschet12Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet12Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val two = binding.twotwo.text.toString()
        val three = binding.twothree.text.toString()
        val five = binding.twofive.text.toString()
        val six = binding.twosix.text.toString()
        val seven = binding.twoseven.text.toString()
        val eight = binding.twoeight.text.toString()
        val nine = binding.twoeight.text.toString()
        val ten = binding.twoeight.text.toString()
        val eleven = binding.twoeight.text.toString()
        val twelve = binding.twoeight.text.toString()
        val thirteen = binding.twoeight.text.toString()
        val fourteen = binding.twoeight.text.toString()
        val fragment = RaschetFragmentLast()


        binding.twoone.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.twotwo.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.twothree.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.twofour.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.twofive.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "3 000 рублей"
        }
        binding.twosix.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "6 000 рублей"
        }
        binding.twoseven.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "4 500 рублей"
        }
        binding.twoeight.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "4 500 рублей"
        }
        binding.twonine.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "2 000 рублей"
        }
        binding.twoten.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "300 рублей"
        }
        binding.twoeleven.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = " 2 250 рублей"
        }
        binding.twotwelve.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = twelve
            dataModelChena.massage.value = "300 рублей"
        }
        binding.twothirteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = thirteen
            dataModelChena.massage.value = "2 250 рублей"
        }
        binding.twofourteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = fourteen
            dataModelChena.massage.value = "6 000 рублей"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaschetFragment11()
    }
}
