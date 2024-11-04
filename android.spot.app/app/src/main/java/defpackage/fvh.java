package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvh extends fku {
    public fvh(Context context, Looper looper, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, 208, fkpVar, fivVar, fjrVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 224500000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        if (queryLocalInterface instanceof fvj) {
            return (fvj) queryLocalInterface;
        }
        return new fvj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return new Feature[]{fuw.w, fuw.v, fuw.u};
    }
}
