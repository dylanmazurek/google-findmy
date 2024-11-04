package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrx extends jsa implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public jrx(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.jsa
    public final int a() {
        boolean z;
        int length = this.a.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.W(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        int i3 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // defpackage.jsa
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.jsa
    public final long c() {
        boolean z;
        int length = this.a.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        hwx.W(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.jsa
    public final boolean d(jsa jsaVar) {
        boolean z;
        if (this.a.length != jsaVar.f().length) {
            return false;
        }
        int i = 0;
        boolean z2 = true;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                if (bArr[i] == jsaVar.f()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
                i++;
            } else {
                return z2;
            }
        }
    }

    @Override // defpackage.jsa
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.jsa
    public final byte[] f() {
        return this.a;
    }
}
