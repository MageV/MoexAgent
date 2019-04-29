package ru.magev.moexagent.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import ru.magev.moexagent.DataManipulation.ItemContainer;
import ru.magev.moexagent.R;
import ru.magev.moexagent.UI.MainActivity;

public class rowsetAdapters extends RecyclerView.Adapter<rowsetAdapters.rowsetViewHolder>{

    private List<ItemContainer> itemsList=new ArrayList<>();
    @Inject
    MainActivity mainActivity;


    @NonNull
    @Override
    public rowsetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_item_layout,viewGroup,false);
        return new rowsetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rowsetViewHolder rowsetViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return  itemsList.size();
    }
    public void fill(Collection<ItemContainer> items)
    {
        itemsList.addAll(items);
        notifyDataSetChanged();
    }
    public void clear()
    {
        itemsList.clear();
        notifyDataSetChanged();
    }

    class rowsetViewHolder extends RecyclerView.ViewHolder {

        private ImageView logoView;
        private TextView rateText;
        private TextView instName;
        private ImageView directionView;

        public rowsetViewHolder(@NonNull View itemView) {
            super(itemView);
            logoView=itemView.findViewById(R.id.image_instr_logo);
            instName=itemView.findViewById(R.id.txtview_inst_name);
            rateText=itemView.findViewById(R.id.txtview_rate);
            directionView=itemView.findViewById(R.id.image_dir_logo);
        }
        public void Bind(ItemContainer item)
        {

        }
    }
}
