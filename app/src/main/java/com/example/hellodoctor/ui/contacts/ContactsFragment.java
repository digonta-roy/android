package com.example.hellodoctor.ui.contacts;

/*import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hellodoctor.R;*/

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.hellodoctor.R;
import com.example.hellodoctor.databinding.FragmentContactsBinding;
import com.example.hellodoctor.databinding.FragmentGalleryBinding;
import com.example.hellodoctor.ui.gallery.GalleryViewModel;


public class ContactsFragment extends Fragment {

    private ContactsViewModel ContactsViewModel;
    private FragmentContactsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContactsViewModel galleryViewModel =
                new ViewModelProvider(this).get(ContactsViewModel.class);

        binding = FragmentContactsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContacts;
        ContactsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

  /*  public static ContactsFragment newInstance() {
        return new ContactsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ContactsViewModel.class);
        // TODO: Use the ViewModel
    }  */



}