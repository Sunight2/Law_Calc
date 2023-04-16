package add.larionov.law

import add.larionov.law.databinding.FragmentRaschetLastBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner


class RaschetFragmentLast : Fragment() {

    lateinit var binding: FragmentRaschetLastBinding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschetLastBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataModel.massage.observe(activity as LifecycleOwner, {
            binding.textView12.text = it
        })
        dataModelChena.massage.observe(activity as LifecycleOwner, {
            binding.textView13.text = it
        })
    }


    companion object {

        @JvmStatic
        fun newInstance() = RaschetFragmentLast()

    }
}