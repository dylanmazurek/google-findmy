package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuo extends cug {
    private final ConnectivityManager e;

    public cuo(Context context, eld eldVar) {
        super(context, eldVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
    }

    @Override // defpackage.cug
    public final IntentFilter a() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // defpackage.cuj
    public final /* bridge */ /* synthetic */ Object b() {
        return cun.a(this.e);
    }

    @Override // defpackage.cug
    public final void c(Intent intent) {
        if (amr.i(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            cqc.b();
            String str = cun.a;
            f(cun.a(this.e));
        }
    }
}
