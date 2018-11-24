package smktelkom.sch.id.myprofile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)

        val step = arguments?.getInt("step")

        // TODO STEP 9 - Use type-safe arguments - remove previous line!
//        val step = arguments?.let {
//            val safeArgs = HomeFragment.fromBundle(it)
//            safeArgs.step
//        }
        // TODO ENDSTEP 9

        return inflater.inflate(R.layout.main_fragment, container, false)

    }

}