package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxu {
    private final gxv a;
    private final gxm b;
    private final gxm c;
    private final Integer d;

    public gxu(gxv gxvVar, gxm gxmVar, gxm gxmVar2, Integer num) {
        gxvVar.getClass();
        gxmVar.getClass();
        gxmVar2.getClass();
        this.a = gxvVar;
        this.b = gxmVar;
        this.c = gxmVar2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxu)) {
            return false;
        }
        gxu gxuVar = (gxu) obj;
        if (this.a == gxuVar.a && this.b == gxuVar.b && this.c == gxuVar.c && amr.i(this.d, gxuVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "PayloadMetadata(payloadType=" + this.a + ", fcmMessageOriginalPriority=" + this.b + ", fcmMessageDeliveredPriority=" + this.c + ", fcmMessageTtl=" + this.d + ")";
    }
}
