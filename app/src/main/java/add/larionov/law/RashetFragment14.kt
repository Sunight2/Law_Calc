package add.larionov.law

import add.larionov.law.databinding.FragmentRashet14Binding
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class RashetFragment14 : Fragment() {

    lateinit var binding: FragmentRashet14Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRashet14Binding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fourone.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.fourtwo.setOnClickListener{
            val raschet = Intent(activity, Raschet::class.java)
            startActivity(raschet)
            activity?.finish()
        }
        binding.fourthree.setOnClickListener() {
            val fragment = RaschetFragment141()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.fourfour.setOnClickListener {
            val fragment = RaschetFragment142()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.fourfive.setOnClickListener {
            val fragment = RaschetFragment143()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.foursix.setOnClickListener {
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
