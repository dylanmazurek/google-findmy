package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ck implements AdapterView.OnItemClickListener {
    final /* synthetic */ co a;
    final /* synthetic */ cl b;

    public ck(cl clVar, co coVar) {
        this.b = clVar;
        this.a = coVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.r.onClick(this.a.b, i);
        if (!this.b.t) {
            this.a.b.dismiss();
        }
    }
}
