package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kat extends kll {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final kas e;
    public final kar f;

    public kat(int i, int i2, int i3, int i4, kas kasVar, kar karVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = kasVar;
        this.f = karVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.e != kas.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kat)) {
            return false;
        }
        kat katVar = (kat) obj;
        if (katVar.a != this.a || katVar.b != this.b || katVar.c != this.c || katVar.d != this.d || katVar.e != this.e || katVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kat.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        kar karVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(karVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
