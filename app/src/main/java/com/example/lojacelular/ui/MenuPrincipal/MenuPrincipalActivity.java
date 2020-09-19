package com.example.lojacelular.ui.MenuPrincipal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lojacelular.R;
import com.example.lojacelular.ui.CadastroCelular.CadastroCelularActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

// implementado a Interface MenuContrato na parte de View onde temos todos os metods necessarios para implementação
public class MenuPrincipalActivity extends AppCompatActivity implements MenuPrincipalContrato.View {

    RecyclerView menuPrincipalView;
    private MenuPrincipalPresenter presenter;
    RecyclerView.Adapter adapter;
    FloatingActionButton fabAddCelular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        //inicializa o presenter
        presenter = new MenuPrincipalPresenter();
        presenter.setView(this);

        inicializacaoDosCampos(); // inicializa os campos da activity principal
        popularListaDeCelulares(); // chama o metodo de configuração da lista principal de celulares e seta o retorno no adapter
        clickFabAddCelular(); // click do FloatActionButton
    }

    // Metodo que inicializa os campos da Activity principal
    @Override
    public void inicializacaoDosCampos() {
        menuPrincipalView = findViewById(R.id.activity_menu_principal_recycler);
        fabAddCelular = findViewById(R.id.activity_menu_principal_fab);
    }

    // Metodo que chama o presenter para sua configuração e seu retorno e setado no adapter
    @Override
    public void popularListaDeCelulares() {
        // chama o metodo de configuração da lista na camada Presenter
        ArrayList<CelularesClass> retornoListaCelular = presenter.configuracaoListaCelular(this,menuPrincipalView);

        // Recebe o retorno da lista e guarada o mesmo na variavel adapter
        adapter = new MenuPrincipalAdapter(retornoListaCelular);

        // seta o adpter na lista(RecylerView)
        menuPrincipalView.setAdapter(adapter);

    }

    @Override
    public void clickFabAddCelular()
    {
                //no click do botão ira abrir a tela de cadastro do celular
               fabAddCelular.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent = new Intent(MenuPrincipalActivity.this, CadastroCelularActivity.class);
                       startActivity(intent);
                   }
               });
    }

}


