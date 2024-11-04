package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cnu extends cdn {
    protected brr[] m;
    String n;
    int o;
    int p;

    public cnu() {
        this.m = null;
        this.o = 0;
    }

    public boolean d() {
        return false;
    }

    public brr[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(brr[] brrVarArr) {
        if (!bpn.e(this.m, brrVarArr)) {
            this.m = bpn.g(brrVarArr);
            return;
        }
        brr[] brrVarArr2 = this.m;
        for (int i = 0; i < brrVarArr.length; i++) {
            brrVarArr2[i].a = brrVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = brrVarArr[i].b;
                if (i2 < fArr.length) {
                    brrVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public cnu(cnu cnuVar) {
        this.m = null;
        this.o = 0;
        this.n = cnuVar.n;
        int i = cnuVar.p;
        this.p = 0;
        this.m = bpn.g(cnuVar.m);
    }
}
