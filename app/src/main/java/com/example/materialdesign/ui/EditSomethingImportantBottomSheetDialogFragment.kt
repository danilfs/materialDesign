package com.example.materialdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.materialdesign.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class EditSomethingImportantBottomSheetDialogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_edit_something_important_bottom_sheet, container, false)
}