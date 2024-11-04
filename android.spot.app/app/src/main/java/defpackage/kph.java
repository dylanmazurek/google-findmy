package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kph extends fjz {
    private final Bundle a;

    public kph(Bundle bundle) {
        super(null, false, 13202);
        this.a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fjz
    public final /* bridge */ /* synthetic */ void a(fhh fhhVar, bym bymVar) {
        kpf kpfVar = (kpf) fhhVar;
        kpg kpgVar = new kpg(bymVar);
        Bundle bundle = this.a;
        try {
            kpl kplVar = (kpl) kpfVar.v();
            Parcel a = kplVar.a();
            duh.d(a, kpgVar);
            duh.c(a, bundle);
            kplVar.c(2, a);
        } catch (RemoteException unused) {
        }
    }
}
