package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iim implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;

    public iim(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iil a() {
        return new iil(((ijc) this.a).a(), ((iiz) this.b).a(), ((iiw) this.c).a(), (Executor) this.d.a());
    }
}
