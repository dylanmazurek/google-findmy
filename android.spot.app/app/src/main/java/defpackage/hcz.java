package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hcz extends hcv {
    public final int x;
    public ImageView y;

    public hcz(ViewGroup viewGroup, Context context, hjp hjpVar) {
        super(viewGroup, context, hjpVar);
        this.x = frx.Y(context, R.attr.ogIconColor);
    }

    protected abstract void E(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hcv
    public final void F(cfc cfcVar) {
        super.F(cfcVar);
        hcu hcuVar = this.w;
        hcuVar.getClass();
        hcuVar.i.k(cfcVar);
    }

    @Override // defpackage.hcv
    protected final void G(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View inflate = LayoutInflater.from(((hcv) this).r).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.y = (ImageView) inflate.findViewById(R.id.og_card_icon);
        E((ViewGroup) inflate.findViewById(R.id.og_card_view_container));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(cfc cfcVar, hcu hcuVar) {
        super.D(cfcVar, hcuVar);
        hcuVar.i.g(cfcVar, new euc(this, 16));
    }
}
