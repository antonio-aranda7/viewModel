package mx.edu.itechetumal.viewmodel.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.main_fragment.*
import mx.edu.itechetumal.viewmodel.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        //val resultObserver = Observer<Float>{result->message.text=result.toString()}
        convertBtn.setOnClickListener {
            if (dollarTxt.text.isNotEmpty()){
                viewModel.setAmount(dollarTxt.text.toString())
                message.text = viewModel.getResult().toString()
            }else{
                message.text="No Value"
            }
        }


    }

}