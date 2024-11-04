package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggn extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        gxv gxvVar = (gxv) obj;
        int ordinal = gxvVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return gpq.c;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(gxvVar.toString()));
            }
            return gpq.b;
        }
        return gpq.a;
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gpq gpqVar = (gpq) obj;
        int ordinal = gpqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return gxv.c;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(gpqVar.toString()));
            }
            return gxv.b;
        }
        return gxv.a;
    }
}
