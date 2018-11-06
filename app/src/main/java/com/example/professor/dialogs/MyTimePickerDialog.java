package com.example.professor.dialogs;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.TimePicker;
import android.widget.Toast;

public class MyTimePickerDialog extends AppCompatDialogFragment
        implements TimePickerDialog.OnTimeSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return new TimePickerDialog(getActivity(),this, 8, 45, false);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        String msg = String.format("%02d:%02d", i, i1);
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();

    }
}