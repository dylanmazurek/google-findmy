package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlg {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public nlg f;
    public nlg g;

    public nlg() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final nlg a() {
        nlg nlgVar;
        nlg nlgVar2 = this.f;
        if (nlgVar2 != this) {
            nlgVar = nlgVar2;
        } else {
            nlgVar = null;
        }
        nlg nlgVar3 = this.g;
        nlgVar3.getClass();
        nlgVar3.f = nlgVar2;
        nlg nlgVar4 = this.f;
        nlgVar4.getClass();
        nlgVar4.g = nlgVar3;
        this.f = null;
        this.g = null;
        return nlgVar;
    }

    public final nlg b() {
        this.d = true;
        return new nlg(this.a, this.b, this.c, true);
    }

    public final void c(nlg nlgVar, int i) {
        if (nlgVar.e) {
            int i2 = nlgVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!nlgVar.d) {
                    int i4 = nlgVar.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = nlgVar.a;
                        mkm.o(bArr, bArr, 0, i4, i2);
                        i2 = nlgVar.c - nlgVar.b;
                        nlgVar.c = i2;
                        nlgVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = nlgVar.a;
            int i5 = this.b;
            mkm.o(bArr2, bArr3, i2, i5, i5 + i);
            nlgVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public final void d(nlg nlgVar) {
        nlgVar.g = this;
        nlgVar.f = this.f;
        nlg nlgVar2 = this.f;
        nlgVar2.getClass();
        nlgVar2.g = nlgVar;
        this.f = nlgVar;
    }

    public nlg(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
