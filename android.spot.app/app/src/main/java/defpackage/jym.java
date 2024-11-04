package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jym extends jwq {
    private jyn a;

    public jym(jyn jynVar) {
        this.a = jynVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        jyn jynVar = this.a;
        if (jynVar != null) {
            jyz[] jyzVarArr = jynVar.d;
            AtomicInteger atomicInteger = jynVar.c;
            return "inputCount=[" + jyzVarArr.length + "], remaining=[" + atomicInteger.get() + "]";
        }
        return null;
    }

    @Override // defpackage.jwq
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        jyn jynVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        jynVar.getClass();
        jynVar.a = true;
        if (!z) {
            jynVar.b = false;
        }
        jynVar.a();
        return true;
    }
}
