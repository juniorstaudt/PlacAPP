package ui.game.event


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.juniorstaudt.placapp.R
import kotlinx.android.synthetic.main.fragment_event.*
import ui.game.hometeam.HomeTeamFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class EventFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btNextStep.setOnClickListener {
            nextScreen()
        }
    }
    private fun nextScreen() {
        val ft = activity?.supportFragmentManager?.beginTransaction()
        ft?.replace(R.id.containerGame, HomeTeamFragment())
        ft?.addToBackStack(null)
        ft?.commit()
    }


}
