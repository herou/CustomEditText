# Custom EditText

## Simple Custom EditText for Android

#### Intro

https://imgflip.com/gif/24tigt

#### Usage

<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/transitions_container"
    tools:context="com.example.eljo.customedittext.MainActivity">

    <com.example.eljo.customedittext.EljoPriftiEditText
        android:id="@+id/edt_rounded"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:background="@drawable/rounded_edittext"
        android:hint="@string/rounded_editext"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.391" />

  
</android.support.constraint.ConstraintLayout>
