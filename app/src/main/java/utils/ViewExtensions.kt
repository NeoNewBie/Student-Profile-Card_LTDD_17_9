package utils

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.studentprofilecard.R

fun Double.toAcademicRanking(): String = when {
    this >= 3.6 -> "Xuất sắc"
    this >= 3.2 -> "Giỏi"
    this >= 2.5 -> "Khá"
    else -> "Trung bình"
}

fun Context.toast(message: String) {
    val toast = Toast(this)
    val view = LayoutInflater.from(this).inflate(R.layout.custom_toast, null)
    view.findViewById<TextView>(R.id.tvToastMessage).text = message
    toast.view = view
    toast.duration = Toast.LENGTH_SHORT
    toast.show()
}