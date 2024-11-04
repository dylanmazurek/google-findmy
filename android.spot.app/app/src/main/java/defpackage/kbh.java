package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbh extends kll {
    public final int a;
    public final kbg b;

    public kbh(int i, kbg kbgVar) {
        this.a = i;
        this.b = kbgVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.b != kbg.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbh)) {
            return false;
        }
        kbh kbhVar = (kbh) obj;
        if (kbhVar.a != this.a || kbhVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kbh.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
