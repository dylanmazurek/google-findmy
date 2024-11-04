package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djj {
    private static final djf a = new djh();
    private final Map b = new HashMap();

    public final synchronized djg a(Object obj) {
        djf djfVar;
        bsc.q(obj);
        djfVar = (djf) this.b.get(obj.getClass());
        if (djfVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                djf djfVar2 = (djf) it.next();
                if (djfVar2.b().isAssignableFrom(obj.getClass())) {
                    djfVar = djfVar2;
                    break;
                }
            }
        }
        if (djfVar == null) {
            djfVar = a;
        }
        return djfVar.a(obj);
    }

    public final synchronized void b(djf djfVar) {
        this.b.put(djfVar.b(), djfVar);
    }
}
