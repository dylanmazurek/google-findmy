package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahf extends aij {
    public static final ahf a = new ahf();

    private ahf() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        int i = ((ali) aikVar.b(0)).a;
        List list = (List) aikVar.b(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            aawVar.g(i3, obj);
            aawVar.h(i3, obj);
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "effectiveNodeIndex";
        }
        if (a.m(i, 1)) {
            return "nodes";
        }
        return super.c(i);
    }
}
