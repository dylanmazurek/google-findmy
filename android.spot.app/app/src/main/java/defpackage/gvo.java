package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gvo extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lby lbyVar = (lby) obj;
        switch (lbyVar) {
            case IMPORTANCE_UNSPECIFIED:
                return lfc.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return lfc.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return lfc.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return lfc.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return lfc.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return lfc.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return lfc.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(lbyVar.toString()));
        }
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lfc lfcVar = (lfc) obj;
        switch (lfcVar) {
            case IMPORTANCE_UNSPECIFIED:
                return lby.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return lby.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return lby.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return lby.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return lby.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return lby.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return lby.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(lfcVar.toString()));
        }
    }
}
