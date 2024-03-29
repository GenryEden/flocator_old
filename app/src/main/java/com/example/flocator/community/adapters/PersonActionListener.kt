package com.example.flocator.community.adapters

import com.example.flocator.community.data_classes.Person

interface PersonActionListener {
    fun onPersonOpenProfile(person: Person)
    fun onPersonAccept(person: Person)
    fun onPersonCancel(person: Person)
}