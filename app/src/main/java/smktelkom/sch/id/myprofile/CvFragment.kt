package smktelkom.sch.id.myprofile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [CvFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [CvFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class CvFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.cv_fragment, container, false)

        view.findViewById<Button>(R.id.btxp)?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.favorite, null)
            Log.d("biss", "terklik")
        }
        // Inflate the layout for this fragment
        return view
    }


}
