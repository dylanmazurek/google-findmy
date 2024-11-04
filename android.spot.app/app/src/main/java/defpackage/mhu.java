package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhu extends maq {
    final /* synthetic */ mhw a;
    private final mhw b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public mhu(mhw mhwVar, mhw mhwVar2) {
        this.a = mhwVar;
        this.b = mhwVar2;
    }

    @Override // defpackage.maq
    public final mam a() {
        if (this.c.compareAndSet(false, true)) {
            this.a.e.c().execute(new mgs(this.b, 3, null));
        }
        return mam.a;
    }
}
