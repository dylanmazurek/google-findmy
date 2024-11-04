package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuj {
    public final jis a;
    public final Throwable b;
    public final int c;

    public kuj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        jis jisVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuj) {
            kuj kujVar = (kuj) obj;
            if (this.c == kujVar.c && ((jisVar = this.a) != null ? hzc.L(jisVar, kujVar.a) : kujVar.a == null)) {
                Throwable th = this.b;
                Throwable th2 = kujVar.b;
                if (th != null ? th.equals(th2) : th2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.c;
        a.N(i);
        jis jisVar = this.a;
        int i2 = 0;
        if (jisVar == null) {
            hashCode = 0;
        } else {
            hashCode = jisVar.hashCode();
        }
        int i3 = i ^ 1000003;
        Throwable th = this.b;
        if (th != null) {
            i2 = th.hashCode();
        }
        return (((i3 * 1000003) ^ hashCode) * 1000003) ^ i2;
    }

    public final String toString() {
        String str;
        if (this.c != 1) {
            str = "HAS_ERROR";
        } else {
            str = "HAS_VALUE";
        }
        jis jisVar = this.a;
        Throwable th = this.b;
        return "EndpointStateResult{state=" + str + ", value=" + String.valueOf(jisVar) + ", error=" + String.valueOf(th) + "}";
    }

    public kuj(int i, jis jisVar, Throwable th) {
        this.c = i;
        this.a = jisVar;
        this.b = th;
    }
}
