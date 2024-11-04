package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfq extends kag {
    public final kgl a;

    public kfq(kgl kglVar) {
        this.a = kglVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfq)) {
            return false;
        }
        kgl kglVar = ((kfq) obj).a;
        kjr b = kjr.b(this.a.b.c);
        if (b == null) {
            b = kjr.UNRECOGNIZED;
        }
        kjr b2 = kjr.b(kglVar.b.c);
        if (b2 == null) {
            b2 = kjr.UNRECOGNIZED;
        }
        if (b.equals(b2)) {
            if (this.a.b.a.equals(kglVar.b.a)) {
                if (this.a.b.b.equals(kglVar.b.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        kgl kglVar = this.a;
        return Objects.hash(kglVar.b, kglVar.a);
    }

    public final String toString() {
        String str;
        kji kjiVar = this.a.b;
        String str2 = kjiVar.a;
        kjr b = kjr.b(kjiVar.c);
        if (b == null) {
            b = kjr.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }
}
