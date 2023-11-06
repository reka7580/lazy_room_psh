package com.example.lazy_room_psh

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lazy_room_psh.databinding.ItemRoomBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class RoomAdapter: RecyclerView.Adapter<RoomAdapter.RoomHolder>() {
    val roomlist = ArrayList<Rooms>()
    class RoomHolder(item: View) : RecyclerView.ViewHolder(item){

        val binding = ItemRoomBinding.bind(item)
        fun bind(room: Rooms){
            binding.roomName.text=room.Name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomHolder {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.item_room),parent, false)
        return RoomHolder(view)
    }

    override fun getItemCount(): Int {
      return roomlist.size
    }

    override fun onBindViewHolder(holder: RoomHolder, position: Int) {
        holder.bind(roomlist[position])
    }


    public fun addRoom(room:Rooms){
        roomlist.add(room)
        notifyDataSetChanged()
    }

}
