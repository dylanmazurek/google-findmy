package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mia extends maq {
    public final map a;
    final /* synthetic */ mib b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public mia(mib mibVar, map mapVar) {
        this.b = mibVar;
        this.a = mapVar;
    }

    @Override // defpackage.maq
    public final mam a() {
        if (this.c.compareAndSet(false, true)) {
            this.b.d.c().execute(new mgs(this, 4));
        }
        return mam.a;
    }
}
