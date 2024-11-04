package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbd extends kll {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final kbc d;

    public kbd(int i, kbc kbcVar) {
        this.a = i;
        this.d = kbcVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.d != kbc.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbd)) {
            return false;
        }
        kbd kbdVar = (kbd) obj;
        if (kbdVar.a == this.a) {
            int i = kbdVar.b;
            int i2 = kbdVar.c;
            if (kbdVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(kbd.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
