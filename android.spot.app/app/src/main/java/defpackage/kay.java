package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kay extends kll {
    public final int a;
    public final int b;
    public final int c = 16;
    public final kax d;

    public kay(int i, int i2, kax kaxVar) {
        this.a = i;
        this.b = i2;
        this.d = kaxVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.d != kax.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kay)) {
            return false;
        }
        kay kayVar = (kay) obj;
        if (kayVar.a == this.a && kayVar.b == this.b) {
            int i = kayVar.c;
            if (kayVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(kay.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
