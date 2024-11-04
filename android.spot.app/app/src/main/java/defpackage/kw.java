package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kw extends DataSetObserver {
    final /* synthetic */ ky a;

    public kw(ky kyVar) {
        this.a = kyVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.x()) {
            this.a.v();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
