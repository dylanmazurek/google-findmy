package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drr implements dtk {
    final /* synthetic */ Context a;

    public drr(Context context) {
        this.a = context;
    }

    @Override // defpackage.dtk
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
