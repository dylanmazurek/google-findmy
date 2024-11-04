package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbw extends kll {
    public final kbv a;
    public final String b;
    public final kll c;
    private final kbu d;

    public kbw(kbv kbvVar, String str, kbu kbuVar, kll kllVar) {
        this.a = kbvVar;
        this.b = str;
        this.d = kbuVar;
        this.c = kllVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.a != kbv.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbw)) {
            return false;
        }
        kbw kbwVar = (kbw) obj;
        if (!kbwVar.d.equals(this.d) || !kbwVar.c.equals(this.c) || !kbwVar.b.equals(this.b) || !kbwVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kbw.class, this.b, this.d, this.c, this.a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.d.g + ", dekParametersForNewKeys: " + this.c.toString() + ", variant: " + this.a.c + ")";
    }
}
