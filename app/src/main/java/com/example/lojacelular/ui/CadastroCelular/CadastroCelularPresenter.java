package com.example.lojacelular.ui.CadastroCelular;


import com.example.lojacelular.data.network.model.RepositoryCadastroCelular;

public class CadastroCelularPresenter implements CadastroCelularContrato.Presenter
{
    private CadastroCelularContrato.View view;
    private RepositoryCadastroCelular repositoryCadastroCelular;

    //construtor instanciando a camada MODEL
    public CadastroCelularPresenter() {
        repositoryCadastroCelular = new RepositoryCadastroCelular();
    }

    @Override
    public void setView(CadastroCelularContrato.View view) {
        this.view = view;
    }

}
