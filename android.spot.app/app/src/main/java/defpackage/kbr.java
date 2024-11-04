package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbr extends kll {
    public final String a;
    public final kbq b;

    public kbr(String str, kbq kbqVar) {
        this.a = str;
        this.b = kbqVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.b != kbq.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbr)) {
            return false;
        }
        kbr kbrVar = (kbr) obj;
        if (!kbrVar.a.equals(this.a) || !kbrVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kbr.class, this.a, this.b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + this.b.c + ")";
    }
}
