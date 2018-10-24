package smktelkom.sch.id.myprofile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.Navigation

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO STEP 5 - Set an OnClickListener, using Navigation.createNavigateOnClickListener()
        view.findViewById<Button>(R.id.btCv)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.cv, null)
        )
        //TODO ENDSTEP 5

        //TODO STEP 6 - Set NavOptions

        val options = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_right)
            .setExitAnim(R.anim.slide_out_left)
            .setPopEnterAnim(R.anim.slide_in_left)
            .setPopExitAnim(R.anim.slide_out_right)
            .build()

        view.findViewById<Button>(R.id.btCv)?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.cv, null, options)
        }

//        view.findViewById<Button>(R.id.navigate_action_bt)?.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.next_action, null)
//        )
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.main_menu, menu)
    }
}
