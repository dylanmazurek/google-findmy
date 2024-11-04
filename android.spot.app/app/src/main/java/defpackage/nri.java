package defpackage;

import java.io.DataInput;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nri {
    final nrg a;
    final String b;
    final int c;

    public nri(nrg nrgVar, String str, int i) {
        this.a = nrgVar;
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nri c(DataInput dataInput) {
        return new nri(new nrg((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) moz.au(dataInput)), dataInput.readUTF(), (int) moz.au(dataInput));
    }

    public final long a(long j, int i, int i2) {
        nrg nrgVar = this.a;
        char c = nrgVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        npg npgVar = npg.o;
        long a = nrgVar.a(npgVar, npgVar.i.e(npgVar.i.h(npgVar.m.h(j3, nrgVar.b), 0), Math.min(nrgVar.f, 86399999)));
        if (nrgVar.d == 0) {
            if (a <= j3) {
                a = nrgVar.a(npgVar, npgVar.n.e(a, 1));
            }
        } else {
            a = nrgVar.c(npgVar, a);
            if (a <= j3) {
                a = nrgVar.c(npgVar, nrgVar.a(npgVar, npgVar.m.h(npgVar.n.e(a, 1), nrgVar.b)));
            }
        }
        return npgVar.i.e(npgVar.i.h(a, 0), nrgVar.f) - j2;
    }

    public final long b(long j, int i, int i2) {
        nrg nrgVar = this.a;
        char c = nrgVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        npg npgVar = npg.o;
        long b = nrgVar.b(npgVar, npgVar.i.e(npgVar.i.h(npgVar.m.h(j3, nrgVar.b), 0), nrgVar.f));
        if (nrgVar.d == 0) {
            if (b >= j3) {
                b = nrgVar.b(npgVar, npgVar.n.e(b, -1));
            }
        } else {
            b = nrgVar.c(npgVar, b);
            if (b >= j3) {
                b = nrgVar.c(npgVar, nrgVar.b(npgVar, npgVar.m.h(npgVar.n.e(b, -1), nrgVar.b)));
            }
        }
        return npgVar.i.e(npgVar.i.h(b, 0), nrgVar.f) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nri) {
            nri nriVar = (nri) obj;
            if (this.c == nriVar.c && this.b.equals(nriVar.b) && this.a.equals(nriVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
