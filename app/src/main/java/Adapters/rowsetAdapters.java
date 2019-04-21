package Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ru.magev.moexagent.R;

public class rowsetAdapters extends RecyclerView.Adapter<rowsetAdapters.rowsetViewHolder>{

    @NonNull
    @Override
    public rowsetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull rowsetViewHolder rowsetViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class rowsetViewHolder extends RecyclerView.ViewHolder {

        private ImageView logoView;
        private TextView rateText;
        private ImageView directionView;

        public rowsetViewHolder(@NonNull View itemView) {
            super(itemView);
            logoView=itemView.findViewById(R.id.image_instr_logo);
            rateText=itemView.findViewById(R.id.txtview_rate);
            directionView=itemView.findViewById(R.id.image_dir_logo);
        }
    }
}
