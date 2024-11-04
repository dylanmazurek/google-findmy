package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fre extends fku {
    private final ta t;
    private final ta u;
    private final ta v;

    public fre(Context context, Looper looper, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, 23, fkpVar, fivVar, fjrVar);
        this.t = new ta();
        this.u = new ta();
        this.v = new ta();
        new ta();
    }

    @Override // defpackage.fkn
    public final void H() {
        System.currentTimeMillis();
        synchronized (this.t) {
            this.t.clear();
        }
        synchronized (this.u) {
            this.u.clear();
        }
        synchronized (this.v) {
            this.v.clear();
        }
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof frb) {
            return (frb) queryLocalInterface;
        }
        return new frb(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return fqz.p;
    }
}
