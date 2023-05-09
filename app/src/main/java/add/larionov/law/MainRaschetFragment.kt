package add.larionov.law

import add.larionov.law.databinding.FragmentMainRaschetBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainRaschetFragment : Fragment() {

    lateinit var binding: FragmentMainRaschetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainRaschetBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.one.setOnClickListener {
            val fragment = RaschetFragment11()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.two.setOnClickListener() {
            val fragment = RaschetFragment12()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.three.setOnClickListener {
            val fragment = RashetFragment13()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.four.setOnClickListener {
            val fragment = RashetFragment14()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }

    }
    companion object {
        @JvmStatic
        fun newInstance() = MainRaschetFragment()
    }
}
