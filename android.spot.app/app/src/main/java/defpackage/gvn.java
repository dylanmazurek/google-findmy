package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gvn extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lbw lbwVar = (lbw) obj;
        int ordinal = lbwVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lfe.BANNED;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(lbwVar.toString()));
            }
            return lfe.ALLOWED;
        }
        return lfe.CHANNEL_GROUP_UNKNOWN;
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lfe lfeVar = (lfe) obj;
        int ordinal = lfeVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lbw.BANNED;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(lfeVar.toString()));
            }
            return lbw.ALLOWED;
        }
        return lbw.CHANNEL_GROUP_STATE_UNKNOWN;
    }
}
