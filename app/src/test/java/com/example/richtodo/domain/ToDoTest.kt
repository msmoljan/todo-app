package com.example.richtodo.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class ToDoTest {

    @Test
    fun `When a check item is added, it is returned in the list`() {
        val toDo = ToDo()
        val buyEggs = CheckableItem("Buy eggs")

        toDo.addCheckableItem(buyEggs)

        assertEquals(1, toDo.checkableItems.size)
        assertEquals(buyEggs, toDo.checkableItems[0])
    }

    @Test
    fun `When a check item is added at an index, it is returned at that index`() {
        val toDo = ToDo()
        val buyEggs = CheckableItem("Buy eggs")
        val buyFlour = CheckableItem("Buy flour")
        val buyMilk = CheckableItem("Buy milk")

        toDo.addCheckableItem(buyEggs)
        toDo.addCheckableItem(buyFlour)
        toDo.addCheckableItem(buyMilk, index = 1)

        assertEquals(3, toDo.checkableItems.size)
        assertEquals(buyEggs, toDo.checkableItems[0])
        assertEquals(buyMilk, toDo.checkableItems[1])
        assertEquals(buyFlour, toDo.checkableItems[2])
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun `When a check item is added at an invalid index, throw exception`() {
        val toDo = ToDo()
        val buyEggs = CheckableItem("Buy eggs")

        toDo.addCheckableItem(buyEggs, index = 100)
    }
}