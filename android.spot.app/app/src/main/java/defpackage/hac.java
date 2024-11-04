package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hac implements gzt {
    public final jis a;
    private boolean d;
    private Object e;
    private final gzr c = new gzr();
    public final Map b = new HashMap();

    public hac(jis jisVar, cfc cfcVar) {
        this.a = jisVar;
        int i = ((jmi) jisVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            gzp gzpVar = (gzp) jisVar.get(i2);
            gzpVar.a.g(cfcVar, new eqn(this, gzpVar, 12));
        }
        b();
    }

    @Override // defpackage.gzt
    public final gzr a(Object obj) {
        if (obj != this.e) {
            ijs.c();
            this.e = obj;
            this.d = true;
            jis jisVar = this.a;
            for (int i = 0; i < ((jmi) jisVar).c; i++) {
                ((gzp) jisVar.get(i)).a(obj);
            }
            this.d = false;
            b();
        }
        return this.c;
    }

    public final void b() {
        ijs.c();
        if (!this.d) {
            jis jisVar = this.a;
            gzo gzoVar = null;
            for (int i = 0; i < ((jmi) jisVar).c; i++) {
                gzo gzoVar2 = (gzo) this.b.get((gzp) jisVar.get(i));
                if (gzoVar2 != null && (gzoVar == null || gzoVar2.compareTo(gzoVar) > 0)) {
                    gzoVar = gzoVar2;
                }
            }
            jer h = jer.h(gzoVar);
            if (h.g()) {
                this.c.c((gzo) h.c());
            } else {
                this.c.c(null);
            }
        }
    }
}
