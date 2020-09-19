package com.example.lojacelular.ui.MenuPrincipal;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lojacelular.data.network.model.RepositoryMenuPrincipal;
import java.util.ArrayList;

public class MenuPrincipalPresenter implements  MenuPrincipalContrato.Presenter{

    private MenuPrincipalContrato.View view;
    private RepositoryMenuPrincipal repositoryMenuPrincipal;

    //construtor instanciando a camada MODEL
    public MenuPrincipalPresenter() {
        repositoryMenuPrincipal = new RepositoryMenuPrincipal();
    }

    @Override
    public void setView(MenuPrincipalContrato.View view) {
        this.view = view;
    }


    // Metodo que recebe o contexto e o RecyclerView da camada View e faz toda a parte de configuração ou manipulação dos dados
    @Override
    public ArrayList<CelularesClass> configuracaoListaCelular(Context context,RecyclerView menuPrincipalView)
    {
        menuPrincipalView.setLayoutManager(new GridLayoutManager(context,3));

        // chama o metodo de criação da lista de celulares na camada MODEL que fica como resposavel pela parte de DADOS
        ArrayList<CelularesClass> retornoLista = repositoryMenuPrincipal.criacaoListaCelulares();

        // Retorna para View a lista criada e ja com os dados tratados.
        return  retornoLista;
    }

}
