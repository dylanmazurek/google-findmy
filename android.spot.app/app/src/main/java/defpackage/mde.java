package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mde extends mfa {
    private final meb a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile mca c;

    public mde(meb mebVar, String str) {
        this.a = mebVar;
        str.getClass();
    }

    @Override // defpackage.mfa, defpackage.mdt
    public final mdq a(mbg mbgVar, mbc mbcVar, lys lysVar, lyy[] lyyVarArr) {
        if (this.b.get() >= 0) {
            return new mew(this.c, lyyVarArr);
        }
        return this.a.a(mbgVar, mbcVar, lysVar, lyyVarArr);
    }

    @Override // defpackage.mfa
    protected final meb d() {
        return this.a;
    }

    @Override // defpackage.mfa, defpackage.mhf
    public final void e(mca mcaVar) {
        mcaVar.getClass();
        synchronized (this) {
            if (this.b.get() < 0) {
                this.c = mcaVar;
                this.b.addAndGet(Integer.MAX_VALUE);
                if (this.b.get() != 0) {
                    return;
                }
                super.e(mcaVar);
            }
        }
    }
}
