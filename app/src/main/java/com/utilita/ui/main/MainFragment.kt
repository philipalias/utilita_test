package com.utilita.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.utilita.R
import com.utilita.model.StatusDetailsModel
import com.utilita.ui.main.adapter.StatusAdapter
import com.utilita.utils.Utils
import com.utilita.viewmodel.StatusViewModel
import kotlinx.android.synthetic.main.main_fragment.*


class MainFragment : Fragment() , StatusAdapter.StatusListener{

    private lateinit var adapter: StatusAdapter
    private lateinit var viewModel: StatusViewModel

    companion object {
        fun newInstance() = MainFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        var view: View = inflater.inflate(R.layout.main_fragment, container, false)

        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StatusViewModel::class.java)

        initAdapter()

        viewModel.fetchAllStatus()

        viewModel.statusModelListLiveData?.observe(this, Observer {
            if (it!=null){
                rv_status.visibility = View.VISIBLE
                var statusList = ArrayList<StatusDetailsModel>()

                statusList.add(StatusDetailsModel("Core API",it.aPIsDBs.coreAPI))
                statusList.add(StatusDetailsModel("Docuware API",it.aPIsDBs.docuwareAPI))
                statusList.add(StatusDetailsModel("Prime DB",it.aPIsDBs.primeDB))
                statusList.add(StatusDetailsModel("Redis DB",it.aPIsDBs.redisDB))
                statusList.add(StatusDetailsModel("Redis Q HQAPI",it.aPIsDBs.redisQHQAPI))
                statusList.add(StatusDetailsModel("Redis Q Prime",it.aPIsDBs.redisQPrime))
                statusList.add(StatusDetailsModel("Redis Q WAPI",it.aPIsDBs.redisQWAPI))
                statusList.add(StatusDetailsModel("WebAPI DB",it.aPIsDBs.webAPIDB))
                statusList.add(StatusDetailsModel("Web API",it.aPIsDBs.webAPI))

                adapter.setData(statusList)
            }else{
                showToast("Something went wrong")
            }
            progress_status.visibility = View.GONE
        })
        // TODO: Use the ViewModel
    }

    override fun onItemClicked(statusDetailsModel: StatusDetailsModel, position: Int) {
        val intent = Intent(activity, StatusDetailsActivity::class.java)
        intent.putExtra(Utils.TAG_STATUS_TITLE, statusDetailsModel.status)
        intent.putExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_CLASS, statusDetailsModel.details.classX)
        intent.putExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_CODE, statusDetailsModel.details.responseCode)
        intent.putExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_TIME, statusDetailsModel.details.responseTime)
        intent.putExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_URL, statusDetailsModel.details.url)
        startActivity(intent)
    }

    private fun initAdapter() {
        adapter = StatusAdapter(this)
        rv_status.layoutManager = LinearLayoutManager(activity)
        rv_status.adapter = adapter
    }

    private fun showToast(msg:String){
        Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show()
    }


}