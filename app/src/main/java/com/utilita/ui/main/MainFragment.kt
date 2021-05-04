package com.utilita.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.utilita.R
import com.utilita.model.StatusModel
import com.utilita.ui.main.adapter.StatusAdapter
import com.utilita.viewmodel.StatusViewModel
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() , StatusAdapter.StatusListener{
    private lateinit var vm:StatusModel
    private lateinit var adapter: StatusModel

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: StatusViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StatusViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onItemDeleted(postModel: StatusModel, position: Int) {
        TODO("Not yet implemented")
    }


}