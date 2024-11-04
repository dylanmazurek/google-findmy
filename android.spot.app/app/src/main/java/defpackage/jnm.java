package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnm extends joa {
    public jnm(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.joa
    public final /* bridge */ /* synthetic */ void b(Object obj, jnz jnzVar) {
        jqo jqoVar = new jqo((jqp) ((jqs) obj).c.d, 0);
        while (jqoVar.hasNext()) {
            Map.Entry entry = (Map.Entry) jqoVar.next();
            if (!((Set) entry.getValue()).isEmpty()) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jnzVar.a((String) entry.getKey(), it.next());
                }
            } else {
                jnzVar.a((String) entry.getKey(), null);
            }
        }
    }
}
