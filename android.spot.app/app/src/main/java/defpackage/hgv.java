package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgv extends mh {
    public final ImageView r;
    public final TextView s;
    public final int t;
    public final hjp u;
    public final SimpleActionView v;

    public hgv(Context context, hjp hjpVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.b;
        this.v = (SimpleActionView) view;
        this.u = hjpVar;
        this.r = (ImageView) view.findViewById(R.id.icon);
        this.s = (TextView) this.b.findViewById(R.id.text);
        this.t = frx.Y(context, R.attr.ogIconColor);
    }
}
