package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiq {
    public final his a;
    public final his b;
    public final jis c;
    private final hog d;

    public hiq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hiq) {
            hiq hiqVar = (hiq) obj;
            if (this.a.equals(hiqVar.a) && this.b.equals(hiqVar.b) && this.d.equals(hiqVar.d)) {
                jis jisVar = this.c;
                jis jisVar2 = hiqVar.c;
                if (jisVar != null ? hzc.L(jisVar, jisVar2) : jisVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        jis jisVar = this.c;
        if (jisVar == null) {
            hashCode = 0;
        } else {
            hashCode = jisVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        jis jisVar = this.c;
        hog hogVar = this.d;
        his hisVar = this.b;
        return "ImageModelLoader{imageRetriever=" + String.valueOf(this.a) + ", secondaryImageRetriever=" + String.valueOf(hisVar) + ", defaultImageRetriever=" + String.valueOf(hogVar) + ", postProcessors=" + String.valueOf(jisVar) + "}";
    }

    public hiq(his hisVar, his hisVar2, hog hogVar, jis jisVar) {
        this.a = hisVar;
        this.b = hisVar2;
        this.d = hogVar;
        this.c = jisVar;
    }
}
