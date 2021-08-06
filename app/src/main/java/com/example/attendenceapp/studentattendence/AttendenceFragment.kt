package com.example.attendenceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.attendenceapp.databinding.FragmentAttendenceBinding

class AttendenceFragment : Fragment() {

    private var _binding: FragmentAttendenceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentAttendenceBinding.inflate(inflater, container, false)

        return binding.root
    }


}