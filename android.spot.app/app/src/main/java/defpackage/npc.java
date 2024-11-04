package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npc extends nov {
    public npc(nor norVar) {
        super(norVar);
    }

    @Override // defpackage.npm
    protected final int A(String str, Locale locale) {
        Integer num = (Integer) npb.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new noa(nns.h, str);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int b(Locale locale) {
        return npb.a(locale).l;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String k(int i, Locale locale) {
        return npb.a(locale).e[i];
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String n(int i, Locale locale) {
        return npb.a(locale).d[i];
    }
}
