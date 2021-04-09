package com.alex.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtCodigo;
    private EditText txtValor;
    private EditText txtIva;
    private EditText txtDescripcion;
    private EditText txtCategoria;
    private ListView lvLista;
    private Button btnAgregar;
    private Button btnMas;
    private Button btnMenos;
    private Button btnPromedio;
    private ArrayAdapter<String> adapter;
    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtCodigo = findViewById(R.id.txtCodigo);
        txtValor = findViewById(R.id.txtValor);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtCategoria = findViewById(R.id.txtCategoria);
        txtIva = findViewById(R.id.txtIva);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnPromedio = findViewById(R.id.btnPromedio);
        btnAgregar.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnPromedio.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAgregar:
                agregar();
                limpiarCampos();
                adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, productos);
                lvLista.setAdapter(adapter);
                break;
        }
        Intent myIntent = new Intent(this, Producto.class);
        startActivity(myIntent);
    }

    private void agregar(){
        String nombre = txtNombre.getText().toString();
        double codigo = Double.parseDouble(txtCodigo.getText().toString());
        double valor = Double.parseDouble(txtValor.getText().toString());
        String descripcion = txtDescripcion.getText().toString();
        String categoria = txtCategoria.getText().toString();
        String iva = txtIva.getText().toString();


        Producto producto = new Producto(nombre, codigo, valor, descripcion, categoria, iva);

        productos.add(producto);
    }
    private void limpiarCampos(){
        txtNombre.getText().clear();
        txtCodigo.getText().clear();
        txtValor.getText().clear();
        txtDescripcion.getText().clear();
        txtCategoria.getText().clear();
        txtIva.getText().clear();
    }

}