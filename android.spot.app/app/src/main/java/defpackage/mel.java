package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mel extends meo {
    public final man a;
    final /* synthetic */ mem b;
    private final lzi g = lzi.b();
    private final lyy[] h;

    public mel(mem memVar, man manVar, lyy[] lyyVarArr) {
        this.b = memVar;
        this.a = manVar;
        this.h = lyyVarArr;
    }

    public final Runnable b(mdt mdtVar) {
        lzi a = this.g.a();
        try {
            man manVar = this.a;
            mdq a2 = mdtVar.a(manVar.c, manVar.b, manVar.a, this.h);
            synchronized (this) {
                if (this.e == null) {
                    a2.getClass();
                    super.f(a2);
                    mds mdsVar = this.d;
                    if (mdsVar == null) {
                        this.f = null;
                        this.c = true;
                    }
                    if (mdsVar != null) {
                        super.e(mdsVar);
                        return new meg(this, 8);
                    }
                }
            }
            return null;
        } finally {
            this.g.c(a);
        }
    }

    @Override // defpackage.meo
    protected final void c() {
        int i = 0;
        while (true) {
            lyy[] lyyVarArr = this.h;
            if (i < lyyVarArr.length) {
                lyyVarArr[i].T();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.meo, defpackage.mdq
    public final void g(mfm mfmVar) {
        if (this.a.a.f()) {
            mfmVar.a("wait_for_ready");
        }
        super.g(mfmVar);
    }

    @Override // defpackage.meo, defpackage.mdq
    public final void h(mca mcaVar) {
        super.h(mcaVar);
        synchronized (this.b.a) {
            mem memVar = this.b;
            if (memVar.e != null) {
                boolean remove = memVar.g.remove(this);
                if (!this.b.f() && remove) {
                    mem memVar2 = this.b;
                    memVar2.b.b(memVar2.d);
                    if (this.b.h.a != null) {
                        mem memVar3 = this.b;
                        memVar3.b.b(memVar3.e);
                        this.b.e = null;
                    }
                }
            }
        }
        this.b.b.a();
    }
}
