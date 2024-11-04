package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoa extends lj {
    public final /* synthetic */ eob a;
    private final jis e;

    public eoa(eob eobVar, jis jisVar) {
        this.a = eobVar;
        this.e = jisVar;
    }

    @Override // defpackage.lj
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new kux(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spot_category_row, viewGroup, false), null);
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        kux kuxVar = (kux) mhVar;
        eoe eoeVar = (eoe) this.e.get(i);
        ((MaterialButton) kuxVar.r).setText(eoeVar.b);
        ((MaterialButton) kuxVar.r).d(eoeVar.a(kuxVar.b.getContext()));
        ((MaterialButton) kuxVar.r).setOnClickListener(new ecp(this, eoeVar, 4, null));
    }
}
