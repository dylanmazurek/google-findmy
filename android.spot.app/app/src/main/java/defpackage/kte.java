package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kte implements kti {
    private final String a;
    private final ktf b;

    public kte(Set set, ktf ktfVar) {
        this.a = b(set);
        this.b = ktfVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ktg ktgVar = (ktg) it.next();
            sb.append(ktgVar.a);
            sb.append('/');
            sb.append(ktgVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.kti
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(this.b.a());
    }
}
