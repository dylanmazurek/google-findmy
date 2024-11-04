package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlo {
    public static final byte[] a = moz.aL("0123456789abcdef");

    public static final String a(nkp nkpVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (nkpVar.c(j2) == 13) {
                String j3 = nkpVar.j(j2);
                nkpVar.u(2L);
                return j3;
            }
        }
        String j4 = nkpVar.j(j);
        nkpVar.u(1L);
        return j4;
    }

    public static final boolean b(nlg nlgVar, int i, byte[] bArr, int i2) {
        nlgVar.getClass();
        bArr.getClass();
        byte[] bArr2 = nlgVar.a;
        int i3 = nlgVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                nlgVar = nlgVar.f;
                nlgVar.getClass();
                byte[] bArr3 = nlgVar.a;
                int i5 = nlgVar.b;
                i3 = nlgVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
