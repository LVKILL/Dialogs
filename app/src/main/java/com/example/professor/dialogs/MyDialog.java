package com.example.professor.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.Toast;

public class MyDialog extends AppCompatDialogFragment implements
        DialogInterface.OnClickListener{

    public onExitListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new
                AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.app_name)
                .setMessage(R.string.sair)
                .setPositiveButton(R.string.sim, this)
                .setNegativeButton(R.string.nao, this);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof onExitListener){
            listener = (onExitListener) context;
        }
        else{
            throw new RuntimeException("A activity deve " +
                    "implementar o listener");
        }
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

        if (i == DialogInterface.BUTTON_POSITIVE){
            //Toast.makeText(getActivity(), R.string.bye, Toast.LENGTH_SHORT).show();
            listener.onExit();
        }
        else if (i == DialogInterface.BUTTON_NEGATIVE){
            Toast.makeText(getActivity(), R.string.thanks, Toast.LENGTH_SHORT).show();
        }
    }

    public interface onExitListener{
        void onExit();
    }

}