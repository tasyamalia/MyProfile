package smktelkom.sch.id.myprofile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

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

        return when (step) {
            2 -> inflater.inflate(R.layout.favorite_fragment, container, false)
            else -> inflater.inflate(R.layout.cv_fragment, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btNext).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.next_action)
        )
    }
}