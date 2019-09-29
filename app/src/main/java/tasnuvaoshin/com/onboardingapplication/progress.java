#Circle Progressbar

<ProgressBar
        android:visibility="gone"
        android:layout_alignParentBottom="true"
        android:id="@+id/loading_spinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="16dp"
        android:indeterminateTintMode="src_atop"
        android:indeterminateTint="@color/colorPrimaryDark"
        android:layout_gravity="center" />
        
        
           private ProgressBar progressBar;
           progressBar = view.findViewById(R.id.loading_spinner);
            progressBar.setVisibility(View.GONE);
             progressBar.setVisibility(View.VISIBLE);
