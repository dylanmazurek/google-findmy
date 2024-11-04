package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecz extends cgk implements edb {
    private final lqd a;
    private final Map b;
    private final ewg c;
    private edb d;

    public ecz(Map map, ewg ewgVar, cfz cfzVar) {
        this.b = map;
        this.c = ewgVar;
        this.a = eyf.h(cfzVar);
    }

    @Override // defpackage.edb
    public final cfk a() {
        edb edbVar = this.d;
        edbVar.getClass();
        return edbVar.a();
    }

    @Override // defpackage.edb
    public final void b() {
        lqf b;
        if (this.d == null) {
            lqd lqdVar = this.a;
            lqf b2 = lqf.b(lqdVar.c);
            if (b2 == null) {
                b2 = lqf.UNRECOGNIZED;
            }
            if (b2 == lqf.ANDROID_DEVICE && ((Boolean) this.c.b(lqdVar).b(new dvh(11)).e(false)).booleanValue()) {
                b = lqf.SPOT_DEVICE;
            } else {
                b = lqf.b(this.a.c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
            }
            mko mkoVar = (mko) this.b.get(b);
            mkoVar.getClass();
            edb edbVar = (edb) mkoVar.a();
            this.d = edbVar;
            edbVar.b();
        }
    }

    @Override // defpackage.edb
    public final void d(kzl kzlVar) {
        edb edbVar = this.d;
        edbVar.getClass();
        edbVar.d(kzlVar);
    }

    @Override // defpackage.edb
    public final void e() {
        edb edbVar = this.d;
        edbVar.getClass();
        edbVar.e();
    }

    @Override // defpackage.edb
    public final void f() {
        edb edbVar = this.d;
        edbVar.getClass();
        edbVar.f();
    }
}
