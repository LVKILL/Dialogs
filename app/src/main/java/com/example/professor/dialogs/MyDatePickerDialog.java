package com.example.professor.dialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Locale;

public class MyDatePickerDialog extends AppCompatDialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return new DatePickerDialog(getActivity(), this, 2019,0,22);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String msg = String.format(new Locale("pt", "BR"),
                "%02d/%02d/%d", i2, i1+1, i);
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();

    }
}