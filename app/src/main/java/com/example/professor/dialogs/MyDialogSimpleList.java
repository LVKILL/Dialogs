package com.example.professor.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.Toast;

public class MyDialogSimpleList extends AppCompatDialogFragment
        implements DialogInterface.OnClickListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.tituloCarros)
                .setItems(R.array.carros,this);
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String[] carros = getActivity().getResources()
                .getStringArray(R.array.carros);

        String carro = carros[i];
        Toast.makeText(getActivity(),
                getActivity().getResources().getString(R.string.respCarros) + " " + carro,
                Toast.LENGTH_SHORT).show();
    }
}