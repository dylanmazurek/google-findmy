package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpk {
    private static final jpg a = new jpi();
    private static final jpf b = new jpj();

    public static jph a(Set set) {
        jpd jpdVar = new jpd(a);
        jpdVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            joa joaVar = (joa) it.next();
            joaVar.getClass();
            if (joaVar.b) {
                jpf jpfVar = jpd.b;
                jql.f(true, "key must be repeating");
                jpdVar.c.remove(joaVar);
                jpdVar.d.put(joaVar, jpfVar);
            } else {
                Map map = jpdVar.d;
                jpg jpgVar = jpd.a;
                map.remove(joaVar);
                jpdVar.c.put(joaVar, jpgVar);
            }
        }
        return new jpe(jpdVar);
    }
}
