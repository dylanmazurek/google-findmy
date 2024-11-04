package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kt implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ky a;

    public kt(ky kyVar) {
        this.a = kyVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        kb kbVar;
        if (i != -1 && (kbVar = this.a.e) != null) {
            kbVar.a = false;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
