package com.example.basicnavigation.ui.leftdestination

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basicnavigation.database.DatabaseManager
import com.example.basicnavigation.database.MyAppDataSource
import kotlinx.coroutines.launch
import com.example.basicnavigation.database.User

class DestinationViewModel: ViewModel(){

    val savedUsers = MutableLiveData<List<User>>()

    fun getUsers(){
        viewModelScope.launch {
            val userDao = DatabaseManager.intance.database.userDao()
            savedUsers.value = MyAppDataSource(userDao).getUsers().value


        }
    }

}