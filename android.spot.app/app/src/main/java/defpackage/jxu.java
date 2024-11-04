package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxu extends jwx {
    private jxt b;

    public jxu(jih jihVar, boolean z, Executor executor, jxc jxcVar) {
        super(jihVar, z, false);
        this.b = new jxr(this, jxcVar, executor);
        q();
    }

    @Override // defpackage.jwx
    public final void h() {
        jxt jxtVar = this.b;
        if (jxtVar != null) {
            jxtVar.f();
        }
    }

    @Override // defpackage.jwq
    protected final void l() {
        jxt jxtVar = this.b;
        if (jxtVar != null) {
            jxtVar.h();
        }
    }

    @Override // defpackage.jwx
    public final void s(int i) {
        super.s(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public jxu(jih jihVar, boolean z, Executor executor, Callable callable) {
        super(jihVar, z, false);
        this.b = new jxs(this, callable, executor);
        q();
    }

    @Override // defpackage.jwx
    public final void f(int i, Object obj) {
    }
}
