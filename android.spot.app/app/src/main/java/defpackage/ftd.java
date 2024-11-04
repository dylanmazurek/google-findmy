package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftd extends fku {
    public ftd(Context context, Looper looper, fiv fivVar, fjr fjrVar, fkp fkpVar) {
        super(context, looper, 265, fkpVar, fivVar, fjrVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.INearbyFastPairService");
        if (queryLocalInterface instanceof ftj) {
            return (ftj) queryLocalInterface;
        }
        return new ftj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.nearby.fastpair.internal.INearbyFastPairService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.nearby.fastpair.START";
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
        return new Feature[]{ftb.a, ftb.f, ftb.g, ftb.h, ftb.b, ftb.e, ftb.c, ftb.d};
    }

    @Override // defpackage.fkn, defpackage.fhm
    public final boolean o() {
        return fma.v(this.b);
    }
}
