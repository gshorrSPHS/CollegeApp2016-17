package com.mistershorr.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.mistershorr.collegeapp.Model.Guardian;
import com.mistershorr.collegeapp.R;

/**
 * Created by gshorr on 12/13/16.
 */
public class GuardianFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //call the superclass and to the stuff
        super.onCreateView(inflater,container,savedInstanceState);
        //create a rootView to inflate your fragment's layout
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

        //wire our widgets
        EditText editFirstName = (EditText) rootView.findViewById(R.id.guardian_first_name);
        EditText editLastName = (EditText) rootView.findViewById(R.id.guardian_last_name);
        EditText editOccupation  = (EditText) rootView.findViewById(R.id.guardian_occupation);

        //get information from the model layer
        Guardian g = new Guardian("Scissors", "Paperbag", "Printing", 123);

        //put the information in the view layer
        //set the text for your editTexts with the info you get from the object you made
        editFirstName.setText(g.getFirstName());
        editLastName.setText(g.getLastName());
        editOccupation.setText(g.getOccupation());

        return rootView;
    }
}
