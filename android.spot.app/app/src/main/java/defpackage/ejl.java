package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ejl implements elr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ejl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.elr
    public final void a(ekk ekkVar) {
        kzh kzhVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = elw.a;
                    kzi kziVar = (kzi) this.a;
                    if (kziVar.a == 3) {
                        ekkVar.d = jdl.a;
                        ekkVar.i();
                    } else {
                        ekkVar.h(kziVar);
                    }
                    if (kziVar.a == 1) {
                        return;
                    }
                    ekkVar.e = jdl.a;
                    return;
                }
                int i3 = elw.a;
                ljh k = kzi.c.k();
                kzg kzgVar = kzg.a;
                if (!k.b.y()) {
                    k.t();
                }
                Object obj = this.a;
                kzi kziVar2 = (kzi) k.b;
                kzgVar.getClass();
                kziVar2.b = kzgVar;
                kziVar2.a = 1;
                ekkVar.h((kzi) k.q());
                ekkVar.c = jdl.a;
                ekkVar.b((String) obj);
                return;
            }
            kzi kziVar3 = (kzi) this.a;
            if (kziVar3.a == 3) {
                ekkVar.c = jdl.a;
                ekkVar.g(Long.valueOf(SystemClock.elapsedRealtime()));
                if (kziVar3.a == 3) {
                    kzhVar = (kzh) kziVar3.b;
                } else {
                    kzhVar = kzh.b;
                }
                ekkVar.f(Integer.valueOf(kzhVar.a * 100));
            } else {
                ekkVar.e(kziVar3);
            }
            if (kziVar3.a == 1) {
                return;
            }
            ekkVar.e = jdl.a;
            return;
        }
        int i4 = ejm.a;
        ekkVar.i();
        ljh k2 = kzi.c.k();
        kzg kzgVar2 = kzg.a;
        if (!k2.b.y()) {
            k2.t();
        }
        Object obj2 = this.a;
        kzi kziVar4 = (kzi) k2.b;
        kzgVar2.getClass();
        kziVar4.b = kzgVar2;
        kziVar4.a = 1;
        ekkVar.e((kzi) k2.q());
        ekkVar.d = jdl.a;
        ekkVar.b((String) obj2);
    }
}
