package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gvm extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lcu lcuVar = (lcu) obj;
        int ordinal = lcuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lfb.BANNED;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(lcuVar.toString()));
            }
            return lfb.ALLOWED;
        }
        return lfb.APP_BLOCK_STATE_UNKNOWN;
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lfb lfbVar = (lfb) obj;
        int ordinal = lfbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lcu.BANNED;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(lfbVar.toString()));
            }
            return lcu.ALLOWED;
        }
        return lcu.APP_BLOCK_STATE_UNKNOWN;
    }
}
