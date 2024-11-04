package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mew extends mhn {
    private boolean b;
    private final mca c;
    private final mdr d;
    private final lyy[] e;

    public mew(mca mcaVar, mdr mdrVar, lyy[] lyyVarArr) {
        hwx.K(!mcaVar.f(), "error must not be OK");
        this.c = mcaVar;
        this.d = mdrVar;
        this.e = lyyVarArr;
    }

    @Override // defpackage.mhn, defpackage.mdq
    public final void g(mfm mfmVar) {
        mfmVar.b("error", this.c);
        mfmVar.b("progress", this.d);
    }

    @Override // defpackage.mhn, defpackage.mdq
    public final void n(mds mdsVar) {
        hwx.V(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            lyy[] lyyVarArr = this.e;
            if (i < lyyVarArr.length) {
                lyyVarArr[i].T();
                i++;
            } else {
                mdsVar.a(this.c, this.d, new mbc());
                return;
            }
        }
    }

    public mew(mca mcaVar, lyy[] lyyVarArr) {
        this(mcaVar, mdr.PROCESSED, lyyVarArr);
    }
}
