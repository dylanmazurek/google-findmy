package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxe extends fku implements fhm {
    public final fkp t;
    public final Integer u;
    private final boolean v;
    private final Bundle w;

    public fxe(Context context, Looper looper, fkp fkpVar, Bundle bundle, fhr fhrVar, fhs fhsVar) {
        super(context, looper, 44, fkpVar, fhrVar, fhsVar);
        this.v = true;
        this.t = fkpVar;
        this.w = bundle;
        this.u = fkpVar.g;
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof fxd) {
            return (fxd) queryLocalInterface;
        }
        return new fxd(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.fkn, defpackage.fhm
    public final boolean p() {
        return this.v;
    }

    @Override // defpackage.fkn
    protected final Bundle u() {
        if (!this.b.getPackageName().equals(this.t.d)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", this.t.d);
        }
        return this.w;
    }
}
