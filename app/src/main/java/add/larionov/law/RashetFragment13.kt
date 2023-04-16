package add.larionov.law

import add.larionov.law.databinding.FragmentRashet13Binding
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class RashetFragment13 : Fragment() {

    lateinit var binding: FragmentRashet13Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRashet13Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.threeone.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.threetwo.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.threethree.setOnClickListener() {
            val fragment = RaschetFragment131()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.threefour.setOnClickListener {
            val fragment = RaschetFragment132()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.threefive.setOnClickListener {
            val fragment = RaschetFragment133()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.threesix.setOnClickListener {
            val fragment = RaschetArbPrFragment()
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
