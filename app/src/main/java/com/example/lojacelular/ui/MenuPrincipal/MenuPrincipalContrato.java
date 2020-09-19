package com.example.lojacelular.ui.MenuPrincipal;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public interface MenuPrincipalContrato {


    interface View {
        //Obrigada a implementação do metodo na View, O metodo será responsavel pelos Binds
        void inicializacaoDosCampos();

        // Obrigada a implentação do metodo na View, o metodo será responsavel pela chamada no presenter para sua configuração e setar o retorno no Adapter
        void popularListaDeCelulares();

        // Obrigada a implentação do metodo na View, o metodo será responsavel pelo click do botão para criação de celulares
        void clickFabAddCelular();
    }

    interface Presenter {
        // Obrigada a implentação do metodo no Presenter, o metodo recebe o contexto passado no momento da sua inicilização na View onde e passado o contexto
        void setView(MenuPrincipalContrato.View view);

        //Obrigada a implentação do metodo no Presenter, o metodo recebe o contexto e a variavel do Recycler,e nela manipula os dados fazendo alguma validação e chama o DAL para criação da lista
        ArrayList<CelularesClass> configuracaoListaCelular(Context context, RecyclerView menuPrincipalView);

    }
}
