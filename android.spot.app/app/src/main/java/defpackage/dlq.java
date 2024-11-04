package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlq {
    private final dlp a = new dlp(null);
    private final Map b = new HashMap();

    private static void d(dlp dlpVar) {
        dlp dlpVar2 = dlpVar.d;
        dlpVar2.c = dlpVar.c;
        dlpVar.c.d = dlpVar2;
    }

    private static void e(dlp dlpVar) {
        dlpVar.c.d = dlpVar;
        dlpVar.d.c = dlpVar;
    }

    public final Object a(dlx dlxVar) {
        dlp dlpVar = (dlp) this.b.get(dlxVar);
        if (dlpVar == null) {
            dlpVar = new dlp(dlxVar);
            this.b.put(dlxVar, dlpVar);
        } else {
            dlxVar.a();
        }
        d(dlpVar);
        dlp dlpVar2 = this.a;
        dlpVar.d = dlpVar2;
        dlpVar.c = dlpVar2.c;
        e(dlpVar);
        return dlpVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [dlx, java.lang.Object] */
    public final Object b() {
        for (dlp dlpVar = this.a.d; !dlpVar.equals(this.a); dlpVar = dlpVar.d) {
            Object b = dlpVar.b();
            if (b != null) {
                return b;
            }
            d(dlpVar);
            this.b.remove(dlpVar.a);
            dlpVar.a.a();
        }
        return null;
    }

    public final void c(dlx dlxVar, Object obj) {
        dlp dlpVar = (dlp) this.b.get(dlxVar);
        if (dlpVar == null) {
            dlpVar = new dlp(dlxVar);
            d(dlpVar);
            dlp dlpVar2 = this.a;
            dlpVar.d = dlpVar2.d;
            dlpVar.c = dlpVar2;
            e(dlpVar);
            this.b.put(dlxVar, dlpVar);
        } else {
            dlxVar.a();
        }
        if (dlpVar.b == null) {
            dlpVar.b = new ArrayList();
        }
        dlpVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        dlp dlpVar = this.a.c;
        boolean z = false;
        while (!dlpVar.equals(this.a)) {
            sb.append('{');
            sb.append(dlpVar.a);
            sb.append(':');
            sb.append(dlpVar.a());
            sb.append("}, ");
            dlpVar = dlpVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
