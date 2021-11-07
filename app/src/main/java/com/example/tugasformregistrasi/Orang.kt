package com.example.tugasformregistrasi

import android.os.Parcel
import android.os.Parcelable
import android.widget.RadioButton

data class Orang(

    val nama: String?,
    val alamat: String?,
    val nohp: String?,
    val jeniskelamin: String?,
    val jeniskendaraan: String?,

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(alamat)
        parcel.writeString(nohp)
        parcel.writeString(jeniskelamin)
        parcel.writeString(jeniskendaraan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Orang> {
        override fun createFromParcel(parcel: Parcel): Orang {
            return Orang(parcel)
        }

        override fun newArray(size: Int): Array<Orang?> {
            return arrayOfNulls(size)
        }
    }
}
