# Custom EditText

Simple Custom EditText for Android

## Intro

<a href="https://imgflip.com/gif/24tigt"><img src="https://i.imgflip.com/24tigt.gif" title="made at imgflip.com"/></a>

## Usage

Add EditText to your layout via XML
```
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

    <com.example.eljo.customedittext.EljoPriftiEditText
        android:id="@+id/edt_rectangle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:background="@drawable/rectangle_editext"
        android:hint="@string/rectangle_editext"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.573" />


    <com.example.eljo.customedittext.EljoPriftiEditText
        android:id="@+id/edt_bottomLine"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="@string/bottom_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.466"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.158" />

</android.support.constraint.ConstraintLayout>


```
Add EditText to your layout programatically

```
public class MainActivity extends AppCompatActivity {

    EljoPriftiEditText edt_rounded;
    EljoPriftiEditText edt_rectangle;
    EljoPriftiEditText edt_bottomLine;

    ViewGroup transitionsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transitionsContainer = findViewById(R.id.transitions_container);
        edt_rounded = findViewById(R.id.edt_rounded);
        edt_rectangle = findViewById(R.id.edt_rectangle);
        edt_bottomLine = findViewById(R.id.edt_bottomLine);

        edt_rounded.init(edt_rounded,transitionsContainer,200,30,250,60);
        edt_rectangle.init(edt_rectangle,transitionsContainer,200,30,250,30);
        edt_bottomLine.init(edt_bottomLine,transitionsContainer,200,30,250,50);

    }
}
```

## Download

Jitpack : 
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
Grandle :
```
dependencies {
    implementation 'com.github.herou:CustomEditText:1.0'
}
```
