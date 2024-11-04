package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkq {
    public final Long a;
    public final byte[] b;
    private final Integer c;

    public gkq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkq) {
            gkq gkqVar = (gkq) obj;
            if (this.a.equals(gkqVar.a) && this.c.equals(gkqVar.c)) {
                boolean z = gkqVar instanceof gkq;
                if (Arrays.equals(this.b, gkqVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ChimeTaskData{id=" + this.a + ", jobType=" + this.c + ", payload=" + Arrays.toString(this.b) + "}";
    }

    public gkq(Long l, Integer num, byte[] bArr) {
        this.a = l;
        this.c = num;
        this.b = bArr;
    }
}
