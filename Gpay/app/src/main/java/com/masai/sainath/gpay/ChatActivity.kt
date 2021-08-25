package com.masai.sainath.gpay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_chat.*
import java.util.ArrayList

class ChatActivity : AppCompatActivity() {

    private  val receiverModel: List<ReceiverModel> = ArrayList<ReceiverModel>()
    private var chatAdapter: ChatAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        setrecyclerAdapter()
        buildChatList()
    }

    private fun buildChatList() {

    }

    private fun setrecyclerAdapter() {
        chatAdapter= ChatAdapter(receiverModel)
        val layoutManager=LinearLayoutManager(this)
        recyclerview.layoutManager=layoutManager
        recyclerview.adapter=chatAdapter

           }


}