package add.larionov.law

import add.larionov.law.databinding.FragmentRaschetLastBinding
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

class RaschetFragmentLast : Fragment() {

    lateinit var binding: FragmentRaschetLastBinding
    private val dataModel: DataModeltwo by activityViewModels()
    private val dataModelChena: DataModeltwoChena by activityViewModels()
    private val dataModelTextPodr: DataModelTextPodr by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaschetLastBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.massage.observe(activity as LifecycleOwner, {
            binding.textView12.text = it
        })
        dataModelChena.massage.observe(activity as LifecycleOwner, {
            binding.textView13.text = it
        })
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.menu_raschet_podrob, menu)
            }
            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {
                    R.id.inforachet -> {
                        val builder = AlertDialog.Builder(activity)
                        builder.setTitle("Подробно")
                        builder.setMessage(
                            dataModelTextPodr.massage.observe(activity as LifecycleOwner, {
                                "$it"
                            }).toString()
                        )
                        builder.show()
                        true
                    }
                    else -> false
                }
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)

    }



    companion object {
        @JvmStatic
        fun newInstance() = RaschetFragmentLast()
    }
}