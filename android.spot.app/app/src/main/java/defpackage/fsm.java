package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsm extends fku {
    public fsm(Context context, Looper looper, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, 215, fkpVar, fivVar, fjrVar);
    }

    @Override // defpackage.fkn
    public final boolean C() {
        return true;
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 19621000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        if (queryLocalInterface instanceof fsj) {
            return (fsj) queryLocalInterface;
        }
        return new fsj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return fsg.c;
    }
}
