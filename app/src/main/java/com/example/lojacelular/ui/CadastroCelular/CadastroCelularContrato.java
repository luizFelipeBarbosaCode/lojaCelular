package com.example.lojacelular.ui.CadastroCelular;

public interface CadastroCelularContrato {
    interface View {
        //Obrigada a implementação do metodo na View, O metodo será responsavel pelos Binds
        void inicializacaoDosCampos();

    }

    interface Presenter {
        // Obrigada a implentação do metodo no Presenter, o metodo recebe o contexto passado no momento da sua inicilização na View onde e passado o contexto
        void setView(CadastroCelularContrato.View view);

    }
}
