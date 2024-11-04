package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgx extends kll {
    public final int a;
    public final int b;
    public final kgw c;

    public kgx(int i, int i2, kgw kgwVar) {
        this.a = i;
        this.b = i2;
        this.c = kgwVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.c != kgw.d) {
            return true;
        }
        return false;
    }

    public final int b() {
        kgw kgwVar = this.c;
        if (kgwVar == kgw.d) {
            return this.b;
        }
        if (kgwVar == kgw.a || kgwVar == kgw.b || kgwVar == kgw.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kgx)) {
            return false;
        }
        kgx kgxVar = (kgx) obj;
        if (kgxVar.a != this.a || kgxVar.b() != b() || kgxVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kgx.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
