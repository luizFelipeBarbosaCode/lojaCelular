package com.example.lojacelular.ui.CadastroCelular;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lojacelular.R;


public class CadastroCelularActivity extends AppCompatActivity implements CadastroCelularContrato.View
{
    private CadastroCelularPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_celular);

        //inicializa o presenter
        presenter = new CadastroCelularPresenter();
        presenter.setView(this);

        inicializacaoDosCampos(); // inicializa os campos da activity principal

    }

    @Override
    public void inicializacaoDosCampos()
    {

    }
}
