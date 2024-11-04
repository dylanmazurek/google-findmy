package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtq extends mtr {
    private final Runnable a;

    public mtq(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.mtr
    public final String toString() {
        String mtrVar = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return mtrVar.concat(runnable.toString());
    }
}
