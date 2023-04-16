package add.larionov.law

import add.larionov.law.databinding.FragmentRaschet11Binding
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class RaschetFragment11 : Fragment() {

    lateinit var binding: FragmentRaschet11Binding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschet11Binding.inflate(inflater)
        return binding.root
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val two = binding.onetwo.text.toString()
        val three = binding.onethree.text.toString()
        val five = binding.onefive.text.toString()
        val six = binding.onesix.text.toString()
        val seven = binding.oneseven.text.toString()
        val eight = binding.oneeight.text.toString()
        val nine = binding.oneeight.text.toString()
        val ten = binding.oneeight.text.toString()
        val eleven = binding.oneeight.text.toString()
        val twelve = binding.oneeight.text.toString()
        val thirteen = binding.oneeight.text.toString()
        val fourteen = binding.oneeight.text.toString()
        val fifteen = binding.oneeight.text.toString()
        val sixteen = binding.oneeight.text.toString()
        val seventeen = binding.oneeight.text.toString()
        val fragment = RaschetFragmentLast()


        binding.oneone.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.onetwo.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = two
            dataModelChena.massage.value = "300 рублей"
        }
        binding.onethree.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = three
            dataModelChena.massage.value = "300 рублей"
        }
        binding.onefour.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.onefive.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = five
            dataModelChena.massage.value = "150 рублей"
        }
        binding.onesix.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = six
            dataModelChena.massage.value = "300 рублей"
        }
        binding.oneseven.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seven
            dataModelChena.massage.value = "600 рублей"
        }
        binding.oneeight.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eight
            dataModelChena.massage.value = "300 рублей"
        }
        binding.onenine.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = nine
            dataModelChena.massage.value = "300 рублей"
        }
        binding.oneten.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = ten
            dataModelChena.massage.value = "300 рублей"
        }
        binding.oneeleven.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = eleven
            dataModelChena.massage.value = "300 рублей"
        }
        binding.onetwelve.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = twelve
            dataModelChena.massage.value = "2250 рублей"
        }
        binding.onethirteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = thirteen
            dataModelChena.massage.value = "300 рублей"
        }
        binding.onefourteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = fourteen
            dataModelChena.massage.value = "2250 рублей"
        }
        binding.onefifteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = fifteen
            dataModelChena.massage.value = "150 рублей"
        }
        binding.onesixteen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = sixteen
            dataModelChena.massage.value = "300 рублей"
        }
        binding.oneseventeen.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
            dataModel.massage.value = seventeen
            dataModelChena.massage.value = "300 рублей"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaschetFragment11()
    }
}