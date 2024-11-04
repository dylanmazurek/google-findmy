package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcg {
    private static final jme a;
    private final hcc b;
    private boolean c;

    static {
        int i = 0;
        jku jkuVar = new jku(hdv.INCOGNITO, new hdv[]{hdv.PRIVACY_ADVISOR, hdv.SETTINGS, hdv.HELP_AND_FEEDBACK});
        jiu jiuVar = new jiu(jkuVar.size());
        Iterator<E> it = jkuVar.iterator();
        while (it.hasNext()) {
            jiuVar.d(it.next(), Integer.valueOf(i));
            i++;
        }
        a = new jhp(jiuVar.b());
    }

    public hcg(hcc hccVar) {
        this.b = hccVar;
    }

    public final jis a() {
        jin jinVar = new jin();
        ArrayList arrayList = new ArrayList();
        jis jisVar = this.b.d.i;
        int i = ((jmi) jisVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            hdy hdyVar = (hdy) jisVar.get(i2);
            hdv hdvVar = hdyVar.i;
            hwx.U(true ^ hdvVar.equals(hdv.CUSTOM));
            if (!this.c || !hdvVar.equals(hdv.PRIVACY_ADVISOR)) {
                arrayList.add(hdyVar);
            }
        }
        jis u = jis.u(new hcf(a), arrayList);
        int i3 = ((jmi) u).c;
        for (int i4 = 0; i4 < i3; i4++) {
            jinVar.h(new hcr(new hft((hdy) u.get(i4), 1)));
        }
        return jinVar.g();
    }

    public final void b() {
        this.c = true;
    }
}
