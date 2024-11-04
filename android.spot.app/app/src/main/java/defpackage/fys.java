package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fys extends ContentObserver {
    final /* synthetic */ fyv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(fyv fyvVar) {
        super(null);
        this.a = fyvVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
