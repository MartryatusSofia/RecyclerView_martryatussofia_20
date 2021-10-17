package com.example.recyclerview_martryatussofia_20

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Disney(
    val imgDisney: Int,
    val nameDisney: String,
    val descDisney: String,
) : Parcelable
