package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmi implements fmj {
    final /* synthetic */ fmk a;
    private final /* synthetic */ int b;

    public fmi(fmk fmkVar, int i) {
        this.b = i;
        this.a = fmkVar;
    }

    @Override // defpackage.fmj
    public final int a() {
        if (this.b != 0) {
            return 4;
        }
        return 5;
    }

    @Override // defpackage.fmj
    public final void b() {
        if (this.b != 0) {
            try {
                Object obj = this.a.d.a;
                ((duf) obj).c(15, ((duf) obj).a());
                return;
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
        try {
            Object obj2 = this.a.d.a;
            ((duf) obj2).c(5, ((duf) obj2).a());
        } catch (RemoteException e2) {
            throw new fsc(e2);
        }
    }
}
