package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hux {
    public final lhl a;
    private final long b;

    public hux() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hux) {
            hux huxVar = (hux) obj;
            if (this.a.equals(huxVar.a) && this.b == huxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lhl lhlVar = this.a;
        if (lhlVar.y()) {
            i = lhlVar.i();
        } else {
            int i2 = lhlVar.y;
            if (i2 == 0) {
                i2 = lhlVar.i();
                lhlVar.y = i2;
            }
            i = i2;
        }
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CachedGetActivityControlsSettingsResponse{response=" + this.a.toString() + ", timestamp=" + this.b + "}";
    }

    public hux(lhl lhlVar) {
        this.a = lhlVar;
        this.b = -1L;
    }
}
