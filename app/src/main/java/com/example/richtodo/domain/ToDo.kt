package com.example.richtodo.domain

class ToDo {

    private val mutableCheckableItems = mutableListOf<CheckableItem>()
    val checkableItems: List<CheckableItem> = mutableCheckableItems

    fun addCheckableItem(item: CheckableItem) {
        mutableCheckableItems.add(item)
    }

    fun addCheckableItem(item: CheckableItem, index: Int) {
        mutableCheckableItems.add(index, item)
    }
}
