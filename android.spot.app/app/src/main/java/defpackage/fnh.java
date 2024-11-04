package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnh extends fku {
    public fnh(Context context, Looper looper, fkp fkpVar, fhr fhrVar, fhs fhsVar) {
        super(context, looper, 202, fkpVar, fhrVar, fhsVar);
    }

    @Override // defpackage.fkn
    public final boolean C() {
        return true;
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 19525000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheService");
        if (queryLocalInterface instanceof fnj) {
            return (fnj) queryLocalInterface;
        }
        return new fnj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.facs.cache.internal.IFacsCacheService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.facs.cache.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }
}
