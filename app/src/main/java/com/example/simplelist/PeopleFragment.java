package com.example.simplelist;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PeopleFragment extends Fragment {

    private PeoplesAdapter peoplesAdapter;
    private RecyclerView recyclerView;
    private List<People> peopleList;
    private PeopleDataProvider peopleDataProvider;
    private RecyclerView.LayoutManager layoutManager;

    public PeopleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("fragment", hashCode() + " onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        peopleDataProvider = new PeopleDataProvider();
        Log.e("fragment", hashCode() + " onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("fragment", hashCode() + " onCreateView");
        return inflater.inflate(R.layout.fragment_people, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("fragment", hashCode() + " OnActivity Created");

        peoplesAdapter = new PeoplesAdapter(getContext());
        layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView = getView().findViewById(R.id.peoples_recycle_view);
        recyclerView.setAdapter(peoplesAdapter);
        recyclerView.setLayoutManager(layoutManager);

        peopleList = peopleDataProvider.getPeopleList();
        peoplesAdapter.setPeopleList(peopleList);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e("fragment", hashCode() + " onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("fragment", hashCode() + " onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("fragment", hashCode() + " onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("fragment", hashCode() + " onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("fragment", hashCode() + " onResume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("fragment", hashCode() + " onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("fragment", hashCode() + " onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("fragment", hashCode() + " onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("fragment", hashCode() + " onSaveInstanceState");
    }

}
