package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jng extends jof {
    public static final jnu a = new jne();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.jof
    public final void a() {
        this.b.set(Math.max(-this.b.get(), 0L));
    }
}
