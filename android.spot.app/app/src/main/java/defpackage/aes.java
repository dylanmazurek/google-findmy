package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes {
    public static final void a(agb agbVar, List list, aew aewVar) {
        Object obj;
        aeu aeuVar;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int a = agbVar.a((aav) list.get(i));
                int n = agbVar.n(agbVar.b, agbVar.h(a));
                if (n < agbVar.c(agbVar.b, agbVar.h(a + 1))) {
                    obj = agbVar.c[agbVar.d(n)];
                } else {
                    obj = abh.a;
                }
                if (obj instanceof aeu) {
                    aeuVar = (aeu) obj;
                } else {
                    aeuVar = null;
                }
                if (aeuVar != null) {
                    aeuVar.b = aewVar;
                }
            }
        }
    }
}
