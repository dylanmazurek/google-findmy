package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggo extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        gxm gxmVar = (gxm) obj;
        int ordinal = gxmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return gpe.PRIORITY_HIGH;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(gxmVar.toString()));
            }
            return gpe.PRIORITY_NORMAL;
        }
        return gpe.PRIORITY_UNKNOWN;
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gpe gpeVar = (gpe) obj;
        int ordinal = gpeVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return gxm.c;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(gpeVar.toString()));
            }
            return gxm.b;
        }
        return gxm.a;
    }
}
