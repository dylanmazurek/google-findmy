package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoh extends mh {
    public static final /* synthetic */ int u = 0;
    final ConstraintLayout r;
    final TextView s;
    public final boh t;

    public eoh(View view, boolean z) {
        super(view);
        boh bohVar = new boh();
        this.t = bohVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        this.r = constraintLayout;
        TextView textView = (TextView) view.findViewById(R.id.owner_title);
        this.s = textView;
        bohVar.c(constraintLayout);
        TextView textView2 = (TextView) view.findViewById(R.id.owner_subtitle);
        ImageView imageView = (ImageView) view.findViewById(R.id.action_image);
        if (z) {
            textView.setTextColor(iqg.c(view, R.attr.colorOutline));
            textView2.setTextColor(iqg.c(view, R.attr.colorOutline));
            imageView.setImageResource(R.drawable.gs_chevron_right_vd_theme_24);
        } else {
            textView.setTextColor(iqg.c(view, R.attr.colorOnBackground));
            textView2.setTextColor(iqg.c(view, R.attr.colorOnSurfaceVariant));
            imageView.setImageResource(R.drawable.gs_more_vert_vd_theme_24);
        }
    }
}
