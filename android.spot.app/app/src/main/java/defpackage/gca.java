package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gca implements gbc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gca(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gbc
    public final List a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((gcf) this.a).a();
            }
            Object obj = this.a;
            gcc gccVar = (gcc) obj;
            gccVar.b.b();
            gcf gcfVar = gccVar.b;
            if (gcfVar.h) {
                Iterator it = gcfVar.c.iterator();
                while (it.hasNext()) {
                    if (((gce) it.next()).g) {
                        break;
                    }
                }
            }
            if (gccVar.g > gccVar.e) {
                if (gccVar.h == null) {
                    gccVar.h = new gcb(obj, 0);
                    ijs.d(gccVar.h, r2 - r3);
                }
                return null;
            }
            return gccVar.b.a();
        }
        gcc gccVar2 = (gcc) this.a;
        gccVar2.b.b();
        return gccVar2.b.a();
    }
}
