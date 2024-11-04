package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjf implements cki {
    final /* synthetic */ cjg a;

    public cjf(cjg cjgVar) {
        this.a = cjgVar;
    }

    @Override // defpackage.cki
    public final String b() {
        return this.a.g;
    }

    @Override // defpackage.cki
    public final void h(ckh ckhVar) {
        int length = this.a.a.length;
        for (int i = 1; i < length; i++) {
            cjg cjgVar = this.a;
            int i2 = cjgVar.a[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                ckhVar.f(i);
                            }
                        } else {
                            byte[] bArr = cjgVar.e[i];
                            bArr.getClass();
                            ckhVar.c(i, bArr);
                        }
                    } else {
                        String str = cjgVar.d[i];
                        str.getClass();
                        ckhVar.g(i, str);
                    }
                } else {
                    ckhVar.d(i, cjgVar.c[i]);
                }
            } else {
                ckhVar.e(i, cjgVar.b[i]);
            }
        }
    }
}
