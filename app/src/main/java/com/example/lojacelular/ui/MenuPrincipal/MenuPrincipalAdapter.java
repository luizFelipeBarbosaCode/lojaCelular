package com.example.lojacelular.ui.MenuPrincipal;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lojacelular.R;

import java.util.List;

public class MenuPrincipalAdapter extends RecyclerView.Adapter<MenuPrincipalAdapter.MenuPrincipalViewHolder>  {


    private List<CelularesClass> ListaCelulares;

    //Construtor
    public MenuPrincipalAdapter(List<CelularesClass> ListaCelulares) {

        this.ListaCelulares = ListaCelulares;
    }


    @NonNull
    @Override
    public MenuPrincipalAdapter.MenuPrincipalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // Infla o layout do cardView com o layout que será exibido na tela principal
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_menu_principal,parent,false);

        MenuPrincipalAdapter.MenuPrincipalViewHolder menuPrincipalViewHolder = new MenuPrincipalAdapter.MenuPrincipalViewHolder(view);
        return menuPrincipalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuPrincipalAdapter.MenuPrincipalViewHolder holder, int position) {
        // titulo que será exibido abaixo da imagem do celular(Produto)
        holder.tv_celular_titulo.setText(ListaCelulares.get(position).getTitulo());

        // Imagegm do celular(Produto) que será exibido acima do titulo
        holder.img_celular.setImageResource(ListaCelulares.get(position).getImage());

        // CardView que será clicado para ser exibido alguma informação
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return ListaCelulares.size();
    }

    public static class MenuPrincipalViewHolder extends RecyclerView.ViewHolder {

        // titulo do celular (Produto)
        TextView tv_celular_titulo;

        // Imagem do celular (Produto)
        ImageView img_celular;

        // CardView principal com as informações
        CardView cardView;

        public MenuPrincipalViewHolder(@NonNull View itemView) {
            super(itemView);
          tv_celular_titulo = (TextView) itemView.findViewById(R.id.cardView_item_menu_principal_txt_nome_celular);
          img_celular = (ImageView) itemView.findViewById(R.id.cardView_item_menu_principal_img_celular);
          cardView = (CardView) itemView.findViewById(R.id.cardView_item_menu_principal_card_id);
        }

    }
}
