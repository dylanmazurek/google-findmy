package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpj extends fjz {
    private final String a;
    private final kqz e;

    public kpj(kqz kqzVar, String str) {
        super(null, false, 13201);
        this.a = str;
        this.e = kqzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fjz
    public final /* bridge */ /* synthetic */ void a(fhh fhhVar, bym bymVar) {
        kpf kpfVar = (kpf) fhhVar;
        kpi kpiVar = new kpi(this.e, bymVar);
        String str = this.a;
        try {
            kpl kplVar = (kpl) kpfVar.v();
            Parcel a = kplVar.a();
            duh.d(a, kpiVar);
            a.writeString(str);
            kplVar.c(1, a);
        } catch (RemoteException unused) {
        }
    }
}
