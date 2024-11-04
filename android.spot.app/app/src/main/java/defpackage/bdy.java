package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdy extends ContentObserver {
    final /* synthetic */ mvy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdy(mvy mvyVar, Handler handler) {
        super(handler);
        this.a = mvyVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j(mlh.a);
    }
}
