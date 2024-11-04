package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khe extends kll {
    public final int a;
    public final int b;
    public final khd c;
    public final khc d;

    public khe(int i, int i2, khd khdVar, khc khcVar) {
        this.a = i;
        this.b = i2;
        this.c = khdVar;
        this.d = khcVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.c != khd.d) {
            return true;
        }
        return false;
    }

    public final int b() {
        khd khdVar = this.c;
        if (khdVar == khd.d) {
            return this.b;
        }
        if (khdVar == khd.a || khdVar == khd.b || khdVar == khd.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof khe)) {
            return false;
        }
        khe kheVar = (khe) obj;
        if (kheVar.a != this.a || kheVar.b() != b() || kheVar.c != this.c || kheVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(khe.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        khc khcVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(khcVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
