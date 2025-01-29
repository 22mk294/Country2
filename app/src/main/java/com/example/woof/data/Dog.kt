package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R


    data class Dog(
        @DrawableRes val imageResourceId: Int,
        @StringRes val name: Int,
        @StringRes val capital: Int,
        @StringRes val hobbies: Int
    )

    val dogs = listOf(
        Dog(R.drawable.angle, R.string.dog_name_1, R.string.capital_1, R.string.dog_description_1),
        Dog(R.drawable.core, R.string.dog_name_2, R.string.capital_2, R.string.dog_description_2),
        Dog(R.drawable.rdc, R.string.dog_name_3, R.string.capital_3, R.string.dog_description_3),
        Dog(R.drawable.usa, R.string.dog_name_4,R.string.capital_4, R.string.dog_description_4),
        Dog(R.drawable.france, R.string.dog_name_5, R.string.capital_5, R.string.dog_description_5),
        Dog(R.drawable.belgique, R.string.dog_name_6, R.string.capital_6, R.string.dog_description_6),
        Dog(R.drawable.japon, R.string.dog_name_7, R.string.capital_7, R.string.dog_description_7),
        Dog(R.drawable.maroc, R.string.dog_name_8, R.string.capital_8, R.string.dog_description_8),
        Dog(R.drawable.tanzanie, R.string.dog_name_9, R.string.capital_9, R.string.dog_description_9)
    )
