package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiz implements lsh {
    private final mko a;
    private final mko b;

    public iiz(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kuv a() {
        return new kuv(((iix) this.a).a(), (Executor) this.b.a());
    }
}
