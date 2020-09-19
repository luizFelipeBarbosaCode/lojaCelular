package com.example.lojacelular.data.network.model;

import com.example.lojacelular.R;
import com.example.lojacelular.ui.MenuPrincipal.CelularesClass;

import java.util.ArrayList;

public class RepositoryMenuPrincipal
{

    // metodo que é chamado na camada Presenter onde fica responsavel pela criação da tabela de celulares
    public ArrayList<CelularesClass> criacaoListaCelulares()
    {
        ArrayList<CelularesClass>  listaMenuPrincipal = new ArrayList<>();
        listaMenuPrincipal.add(new CelularesClass(R.drawable.celular1,"CELULAR 1 ","","","","",""));
        listaMenuPrincipal.add(new CelularesClass(R.drawable.celular2,"CELULAR 2 ","","","","",""));
        listaMenuPrincipal.add(new CelularesClass(R.drawable.celular3,"CELULAR 3 ","","","","",""));
        listaMenuPrincipal.add(new CelularesClass(R.drawable.celular4,"CELULAR 4 ","","","","",""));

        return  listaMenuPrincipal;
    }
}
