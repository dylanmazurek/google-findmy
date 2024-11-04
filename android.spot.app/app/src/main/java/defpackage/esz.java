package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esz extends lj {
    private final jis a;

    public esz(jis jisVar) {
        this.a = jisVar;
    }

    @Override // defpackage.lj
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new kux(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spot_sharing_application_owner_row, viewGroup, false));
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        kzq kzqVar = (kzq) this.a.get(i);
        ((TextView) ((kux) mhVar).r).setText(kzqVar.b);
    }
}
